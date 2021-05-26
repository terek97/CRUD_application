package ru.kurbanmagomedov.springCRUD.service;

import ru.kurbanmagomedov.springCRUD.models.User;

import java.util.List;

public interface UserService {


    void saveUser(User user);

    User getUserById(Long id);

    void setUser(User user);

    void removeUser(Long id);

    List<User> getAllUsers();
}
