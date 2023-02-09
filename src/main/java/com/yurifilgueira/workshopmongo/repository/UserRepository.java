package com.yurifilgueira.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yurifilgueira.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}