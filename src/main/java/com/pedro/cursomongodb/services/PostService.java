package com.pedro.cursomongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.cursomongodb.domain.Post;
import com.pedro.cursomongodb.repository.PostRepository;
import com.pedro.cursomongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;
    
    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
