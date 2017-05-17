package com.melodymoselle.artibus.daos.impl;

import com.melodymoselle.artibus.entities.User;

import javax.sql.DataSource;
import java.sql.*;

public class JdbcUserDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public User register(String username, String password){
        User user = findUserByUsername(username);
        if (user != null) {
            return null;
        }
        user = new User(username, password);
        user = save(user);
        return user;
    }

    public User findUserById(int id){
        String sql = "FIND * FROM users WHERE ID = ?";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
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

    public User findUserByUsername(String username){
        String sql = "FIND * FROM users WHERE USERNAME = ?";
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

    public User save(User user){
        String sql = "INSERT INTO users (USERNAME, PASSWORD) VALUES (?, ?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
            user.setId(ps.getGeneratedKeys().getInt(1));
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
        return user;
    }
}
