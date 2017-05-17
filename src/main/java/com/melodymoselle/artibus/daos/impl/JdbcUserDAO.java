package com.melodymoselle.artibus.daos.impl;

import com.melodymoselle.artibus.entities.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUserDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public User register(String username, String password){
        User user = findUserByUsername(username);
        if (user == null) {
            user = new User(username, password);
        }
    }

    public User findUserByUsername(String username){
        String sql = "FIND * FROM USERS WHERE USERNAME = ?";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            User user = null;
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user = new User(
                        rs.getInt("ID"),
                        rs.getString("USERNAME"),
                        rs.getString("PASSWORD")
                );
            }
            rs.close();
            ps.close();
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e){}
            }
        }

    };
}
