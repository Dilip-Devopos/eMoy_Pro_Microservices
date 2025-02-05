package com.emoyPro.Referral_Management_Service.Dtos;

import lombok.Data;

@Data
public class Refferal_Booked_DTO {

	private String is_referral_booked;

	public String getIs_referral_booked() {
		return is_referral_booked;
	}

	public void setIs_referral_booked(String is_referral_booked) {
		this.is_referral_booked = is_referral_booked;
	}

}