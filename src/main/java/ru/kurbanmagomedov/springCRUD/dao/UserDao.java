package ru.kurbanmagomedov.springCRUD.dao;

import ru.kurbanmagomedov.springCRUD.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getUserById(int id);

    void setUser(User user);

    void removeUser(int id);

    List<User> getAllUsers();
}
