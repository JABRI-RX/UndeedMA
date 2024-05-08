package com.example.undeedma.services.Employer;

import com.example.undeedma.dao.entities.User;

import java.util.Collection;
import java.util.Optional;

public interface EmployerManager {
    public User addUser(User user);
    public boolean updateUser(Integer userId, User user);
    public boolean deleteUser(Integer userId);
    public Collection<User> getAllUsers();
    public Optional<User> getUserById(Integer userId);
}
