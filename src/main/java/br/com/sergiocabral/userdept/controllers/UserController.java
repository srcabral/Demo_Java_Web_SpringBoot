package br.com.sergiocabral.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sergiocabral.userdept.entities.User;
import br.com.sergiocabral.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> response = repository.findAll();
		return response;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User response = repository.findById(id).get();
		return response;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User response = repository.save(user);
		return response;
	}
}
