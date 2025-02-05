package com.emoyPro.User_Mangement_Service_ServicesImp;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emoyPro.User_Mangement_Service_Entities.Users;
import com.emoyPro.User_Mangement_Service_Repositories.User_Repository;

@Service
public class Users_Service {

	@Autowired
	public User_Repository user_repo;

	// POST for New Users

	public UUID addUser(Users users) {
		UUID userId = users.getUser_id() != null ? UUID.fromString(users.getUser_id().toString()) : UUID.randomUUID();
		return user_repo.addUser(userId, users.getUser_name(), users.getPassword(), users.getRole_id(),
				users.getEmail(), users.getCreated_by(), users.getUpdated_by());
	}

	// PUT for Exsit Users

	public void update_users(UUID id, Users users) {
		user_repo.Update_user(id, users.getUser_name(), users.getPassword(), users.getRole_id(), users.getEmail(),
				users.getUpdated_by());

	}

	// GET for fetch user details

	public List<Users> get_by_user_id(UUID id) {
		return user_repo.get_by_user_id(id);
	}

}