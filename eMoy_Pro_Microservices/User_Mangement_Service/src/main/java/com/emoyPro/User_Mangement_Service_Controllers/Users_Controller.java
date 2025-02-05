package com.emoyPro.User_Mangement_Service_Controllers;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emoyPro.User_Mangement_Service_Entities.Users;
import com.emoyPro.User_Mangement_Service_ServicesImp.Users_Service;

@RestController
@RequestMapping("/users")
public class Users_Controller {

	@Autowired
	public Users_Service service;

	private static final Logger log = LoggerFactory.getLogger(Users_Controller.class);

	@GetMapping("/test")
	public String testEndpoint() {
		return "Test successful";
	}

	@PostMapping("/user")
	public ResponseEntity<UUID> addUsers(@RequestBody Users users) {
		UUID Result = service.addUser(users);
		log.info("Posting the Users ...");
		return ResponseEntity.ok(Result);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<List<Users>> get_by_user_id(@PathVariable UUID id) {
		List<Users> user = service.get_by_user_id(id);
		log.info("Fetching Details ....");
		return ResponseEntity.ok(user);
	}

	@PutMapping("/user/{id}")
	public void update_user(@PathVariable UUID id, @RequestBody Users users) {
		log.info("Updating profile ....");
		service.update_users(id, users);
	}
}
