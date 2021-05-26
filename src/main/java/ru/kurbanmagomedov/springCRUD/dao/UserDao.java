package ru.kurbanmagomedov.springCRUD.dao;

import ru.kurbanmagomedov.springCRUD.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getUserById(Long id);

    void setUser(User user);

    void removeUser(Long id);

    List<User> getAllUsers();
}
