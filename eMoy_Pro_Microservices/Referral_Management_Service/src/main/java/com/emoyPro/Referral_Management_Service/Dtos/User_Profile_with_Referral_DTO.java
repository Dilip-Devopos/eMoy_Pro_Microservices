package com.emoyPro.Referral_Management_Service.Dtos;

import com.emoyPro.Referral_Management_Service.Entites.Referal_Info;
import com.emoyPro.User_Mangement_Service_Entities.User_Profile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User_Profile_with_Referral_DTO {

	private Referal_Info referal_Info;

	private User_Profile user_Profiles;

	public User_Profile_with_Referral_DTO(Referal_Info referal_Info, User_Profile userProfile) {
		super();
		this.referal_Info = referal_Info;
		this.user_Profiles = userProfile;
	}

	public Referal_Info getReferal_Info() {
		return referal_Info;
	}

	public void setReferal_Info(Referal_Info referal_Info) {
		this.referal_Info = referal_Info;
	}

	public User_Profile getUser_Profiles() {
		return user_Profiles;
	}

	public void setUser_Profiles(User_Profile user_Profiles) {
		this.user_Profiles = user_Profiles;
	}
}
