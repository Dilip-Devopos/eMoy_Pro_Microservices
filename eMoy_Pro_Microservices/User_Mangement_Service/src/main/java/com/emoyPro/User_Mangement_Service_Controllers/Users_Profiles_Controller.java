package com.emoyPro.User_Mangement_Service_Controllers;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.emoyPro.User_Mangement_Service_DTOs.UserProfileDTO;
import com.emoyPro.User_Mangement_Service_Entities.User_Profile;
import com.emoyPro.User_Mangement_Service_ServicesImp.Users_Profile_Service;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/profiles")
public class Users_Profiles_Controller {

	@Autowired
	private Users_Profile_Service profile_service;

	private static final Logger log = (Logger) LoggerFactory.getLogger(Users_Profiles_Controller.class);

	// POST

	@PostMapping("/profile")
	public Integer insert_Profiles(@RequestBody UserProfileDTO prof) {
		log.info("POSTING_PROFILE...");
		return profile_service.addUserProfile(prof);
	}
//	
//	@PostMapping("/profile")
//	public Integer insert_Profiles(@RequestBody UserProfileDTO prof , @RequestParam("profile_picture") MultipartFile profile_picture) {
//		log.info("POSTING_PROFILE...");
//		try {
//			prof.setProfile_picture(profile_picture.getBytes());
//		}catch (Exception e) {
//			log.error("Error converting row into bytes....! ");
//			throw new RuntimeException("error in proccessing :",e);
//		}
//		return profile_service.addUserProfile(prof);
//	}
	

	// GET

	@GetMapping("/profile")
	public ResponseEntity<List<User_Profile>> get_allProfiles() {
		List<User_Profile> profiles = profile_service.get_all();
		return ResponseEntity.ok(profiles);
	}

	// GET_BY_ID

	@GetMapping("/profile/{u_id}")
	public ResponseEntity<List<User_Profile>> get_profile_by_id(@PathVariable UUID u_id) {
		List<User_Profile> pro = profile_service.get_by_user_id(u_id);
		return ResponseEntity.ok(pro);
	}

	// //UPDATE

	@PutMapping("/profile/{id}")
	public void update_Profile(@PathVariable int id, @RequestBody UserProfileDTO prof) {
		log.info("UPDATING_PROFILE...");
		profile_service.updateProfile(id, prof);
	}

	// DELETE

	@DeleteMapping("/profile/{id}")
	public boolean delete_Profile(@PathVariable int id) {
		log.info("DELETING...");
		return profile_service.delete_Profile(id);
	}

}
