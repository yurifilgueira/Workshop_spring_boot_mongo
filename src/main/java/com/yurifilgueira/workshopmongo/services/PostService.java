package com.yurifilgueira.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurifilgueira.workshopmongo.domain.Post;
import com.yurifilgueira.workshopmongo.repository.PostRepository;
import com.yurifilgueira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}