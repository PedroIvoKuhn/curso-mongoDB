package com.pedro.cursomongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pedro.cursomongodb.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
