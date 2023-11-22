package com.fortunato.java_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortunato.java_api.model.UserModel;
import com.fortunato.java_api.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserModel save(UserModel user) {
        return repository.save(user);
    }

    public void save(String id, String name, String email, String password, boolean admin) {
        UserModel user = new UserModel(id, name, email, password, admin);
        repository.save(user);
    }

    public UserModel findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public List<UserModel> findAll() {
        return (List<UserModel>) repository.findAll();
    }

    public List<UserModel> findByName(String name) {
        return (List<UserModel>) repository.findByName(name);
    }

    public UserModel findByEmail(String email) {
        return (UserModel) repository.findByEmail(email);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
