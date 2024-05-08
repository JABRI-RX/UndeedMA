package com.example.undeedma.services.Job;

import com.example.undeedma.dao.entities.User;
import com.example.undeedma.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class JobService implements JobManager {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean updateUser(Integer userId, User updated_user) {
        Optional<User> usr = userRepository.findById(userId);
        if(usr.isPresent())
        {
            User user = usr.get();
            user.setUsername(updated_user.getUsername());
            user.setPassword(updated_user.getPassword());
            userRepository.save(user);
        }
        return true;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        userRepository.deleteById(userId);
        return true;
    }

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }
}
