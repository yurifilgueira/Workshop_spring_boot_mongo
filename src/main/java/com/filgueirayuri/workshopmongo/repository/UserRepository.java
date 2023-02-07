package com.filgueirayuri.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filgueirayuri.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
