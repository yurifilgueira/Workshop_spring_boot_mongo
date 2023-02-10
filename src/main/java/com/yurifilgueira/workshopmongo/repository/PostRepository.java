package com.yurifilgueira.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yurifilgueira.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}