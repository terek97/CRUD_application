package ru.kurbanmagomedov.springCRUD.service;

import ru.kurbanmagomedov.springCRUD.models.User;

import java.util.List;

public interface UserService {


    void saveUser(User user);

    User getUserById(int id);

    void setUser(User user);

    void removeUser(int id);

    List<User> getAllUsers();
}
