package com.melodymoselle.artibus.daos;

import com.melodymoselle.artibus.entities.User;

public interface UserDAO {

    public User register(User user);
    public User register(String username, String password);

    public User save(User user);

    public User findUserById(int id);

    public User findUserByUsername(String username);
}
