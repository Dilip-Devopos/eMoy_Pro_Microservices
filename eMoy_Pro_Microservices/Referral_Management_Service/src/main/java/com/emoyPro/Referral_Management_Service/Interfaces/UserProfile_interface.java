package com.emoyPro.Referral_Management_Service.Interfaces;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emoyPro.User_Mangement_Service_Entities.User_Profile;

@FeignClient(name = "user-management-servic" , url = "http://localhost:8000")
public interface UserProfile_interface {

	@GetMapping("profiles/profile/{u_id}")
	public ResponseEntity<List<User_Profile>> get_profile_by_id(@PathVariable UUID u_id);
}
