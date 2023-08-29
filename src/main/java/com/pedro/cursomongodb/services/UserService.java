package com.pedro.cursomongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.cursomongodb.domain.User;
import com.pedro.cursomongodb.repository.UserRepository;
import com.pedro.cursomongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    
    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
