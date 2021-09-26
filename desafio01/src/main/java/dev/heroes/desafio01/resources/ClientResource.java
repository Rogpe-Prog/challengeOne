package dev.heroes.desafio01.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.heroes.desafio01.entities.Client;
import dev.heroes.desafio01.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = clientRepository.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id) {
		Client cli = clientRepository.findById(id).get();
		return ResponseEntity.ok().body(cli);
	}

}
