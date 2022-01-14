package br.com.sergiocabral.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergiocabral.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
