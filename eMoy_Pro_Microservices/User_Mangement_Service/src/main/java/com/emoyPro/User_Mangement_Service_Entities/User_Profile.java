package com.emoyPro.User_Mangement_Service_Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "user_profile")
public class User_Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userprofile_id")
	private Integer userprofile_id;
	private UUID user_id;
	private String first_name;
	private String last_name;
	private String gender;
	private LocalDate date_of_birth;
	private String email;
	private String address;
	private String mobile_number;
	private String whatsapp_number;
	@JsonProperty("identityproof")
	private byte[] identity_proof;
	@JsonProperty("profile_picture")
	private byte[] profile_picture;
	private Integer branch_id;
	private String created_by;
	private LocalDateTime created_date;
	private String updated_by;
	private LocalDateTime updated_date;
	private String is_active;

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

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
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

	public Integer getBranch_id() {
		return branch_id;
	}

	public String getIdentity_proof() {
		return identity_proof != null ? Base64.getEncoder().encodeToString(identity_proof) : null;
	}

	public void setIdentity_proof(String identity_proof) {
		this.identity_proof = Base64.getDecoder().decode(identity_proof);
	}

	public String getProfile_picture() {
		return profile_picture != null ? Base64.getEncoder().encodeToString(profile_picture) : null;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = Base64.getDecoder().decode(profile_picture);
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail_id(String email) {
		this.email = email;
	}

	public User_Profile(Integer userprofile_id, UUID user_id, String first_name, String last_name, String gender,
			LocalDate date_of_birth, String mobile_number, String whatsapp_number, String address, String email,
			byte[] identity_proof, byte[] profile_picture, Integer branch_id, String created_by,
			LocalDateTime created_date, String updated_by, LocalDateTime updated_date, String is_active) {
		super();
		this.userprofile_id = userprofile_id;
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.mobile_number = mobile_number;
		this.whatsapp_number = whatsapp_number;
		this.address = address;
		this.email = email;
		this.identity_proof = identity_proof;
		this.profile_picture = profile_picture;
		this.branch_id = branch_id;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.is_active = is_active;
	}

	public User_Profile() {

	}
}
