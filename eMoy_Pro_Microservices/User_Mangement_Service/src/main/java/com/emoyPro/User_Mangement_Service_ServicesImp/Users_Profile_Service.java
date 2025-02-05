package com.emoyPro.User_Mangement_Service_ServicesImp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emoyPro.User_Mangement_Service_DTOs.UserProfileDTO;
import com.emoyPro.User_Mangement_Service_Entities.User_Profile;
import com.emoyPro.User_Mangement_Service_Repositories.User_Profile_Repository;

@Service
public class Users_Profile_Service {

	@Autowired
	private User_Profile_Repository profile_repository;

	List<User_Profile> profiles = new ArrayList<>();

	// Get_Profile_byId

	public List<User_Profile> get_Profiles_byId(int id) {
		List<User_Profile> resultList = profiles.stream().filter(p -> p.getUserprofile_id() == id)
				.collect(Collectors.toList());
		return resultList;
	}

	// Update_Profile_byId

	// public User_Profile update_Profile(int id , User_Profile user_prof) {

	// for(User_Profile pro : profiles) {
	// if(pro.getUserprofile_id()==id) {
	// pro.setFirst_name(user_prof.getFirst_name());
	// pro.setLast_name(user_prof.getLast_name());
	// pro.setMobile_number(user_prof.getMobile_number());
	// pro.setWhatsapp_number(user_prof.getWhatsapp_number());
	// pro.setEmail_id(user_prof.getEmail_id());
	// pro.setAddress(user_prof.getAddress());
	// pro.setGender(user_prof.getGender());
	// pro.setBranch_id(user_prof.getBranch_id());
	// pro.setDate_of_birth(user_prof.getDate_of_birth());
	// pro.setProfile_picture(user_prof.getProfile_picture());
	// pro.setIdentity_proof(user_prof.getIdentity_proof());
	// pro.setIs_active(user_prof.getIs_active());
	// }
	// return pro;
	// }
	// return null;
	// }

	// Delete_profile_byId

	public boolean delete_Profile(int id) {
		return profiles.removeIf(p -> p.getUserprofile_id() == id);
	}

	// POST FOR DB

	public Integer addUserProfile(UserProfileDTO userProfileDTO) {
		return profile_repository.addUserProfile(
				userProfileDTO.getUser_id(),
				userProfileDTO.getFirst_name(),
				userProfileDTO.getLast_name(),
				userProfileDTO.getGender(),
				userProfileDTO.getDate_of_birth(),
				userProfileDTO.getEmail(),
				userProfileDTO.getAddress(),
				userProfileDTO.getMobile_number(),
				userProfileDTO.getWhatsapp_number(),
				userProfileDTO.getIdentity_proof(),
				userProfileDTO.getProfile_picture(),
				userProfileDTO.getBranch_id(),
				userProfileDTO.getCreated_by(),
				userProfileDTO.getUpdated_by());

	}

	// UPDATE FOR DB
	public UserProfileDTO updateProfile(Integer id, UserProfileDTO updatedProfile) {
		if (id == updatedProfile.getUserprofile_id()) {
			profile_repository.updateUserProfile(
					id,
					updatedProfile.getUser_id(),
					updatedProfile.getFirst_name(),
					updatedProfile.getLast_name(),
					updatedProfile.getGender(),
					updatedProfile.getDate_of_birth(),
					updatedProfile.getEmail(),
					updatedProfile.getAddress(),
					updatedProfile.getMobile_number(),
					updatedProfile.getWhatsapp_number(),
					updatedProfile.getIdentity_proof(),
					updatedProfile.getProfile_picture(),
					updatedProfile.getBranch_id(),
					updatedProfile.getUpdated_by());

			return updatedProfile;
		} else {
			return null;
		}
	}


	// GET FOR DB

	public List<User_Profile> get_all() {
		return profile_repository.getAll_UserProfiles();
	}

	// GET BY ID

		public List<User_Profile> get_by_user_id(UUID u_id){
			return profile_repository.get_user_by_id(u_id);
		}
}
