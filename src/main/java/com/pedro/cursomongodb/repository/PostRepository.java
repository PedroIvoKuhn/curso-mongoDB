package com.pedro.cursomongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pedro.cursomongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    
    List<Post> findByTitleContainingIgnoreCase(String text);
}
