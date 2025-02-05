package com.emoyPro.User_Mangement_Service_DTOs;

import java.sql.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class UserProfileDTO {

	private Integer userprofile_id;
	private UUID user_id;
	private String first_name;
	private String last_name;
	private String gender;
	private Date date_of_birth;
	private String mobile_number;
	private String whatsapp_number;
	private String email;
	private String address;
	private byte[] identity_proof;
	private byte[] profile_picture;
	private Integer branch_id;
	private String created_by;
	private String updated_by;

	public Integer getUserprofile_id() {
		return userprofile_id;
	}

	public void setUserprofile_id(Integer userprofile_id) {
		this.userprofile_id = userprofile_id;
	}

	public UUID getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = UUID.fromString(user_id);
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getWhatsapp_number() {
		return whatsapp_number;
	}

	public void setWhatsapp_number(String whatsapp_number) {
		this.whatsapp_number = whatsapp_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public byte[] getIdentity_proof() {
		return identity_proof;
	}

	public void setIdentity_proof(byte[] identity_proof) {
		this.identity_proof = identity_proof;
	}

	public byte[] getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(byte[] profile_picture) {
		this.profile_picture = profile_picture;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public UserProfileDTO() {
		super();
	}

}
