package com.emoyPro.User_Mangement_Service_Entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Users {

	@Id
	private UUID user_id;
	private String user_name;
	private String password;
	private Integer role_id;
	private String email;
	private LocalDateTime date_of_Registration;
	private LocalDateTime last_login;
	private String is_active;
	private String created_by;
	private LocalDateTime created_date;
	private String updated_by;
	private LocalDateTime updated_date;

	public Users(UUID user_id, String user_name, String password, Integer role_id, String email,
			LocalDateTime date_of_Registration, LocalDateTime last_login, String is_active, String created_by,
			LocalDateTime created_date, String updated_by, LocalDateTime updated_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.role_id = role_id;
		this.email = email;
		this.date_of_Registration = date_of_Registration;
		this.last_login = last_login;
		this.is_active = is_active;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
	}

	public UUID getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = UUID.fromString(user_id);
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole_id() {
	    return role_id ;
	}

	public void setRole_id(String role_id) {
	    if (role_id != null && !role_id.isEmpty()) {
	        this.role_id = Integer.parseInt(role_id);
	    } else {
	        this.role_id = null;  // Or set a default value if needed
	    }
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDate_of_Registration() {
		return date_of_Registration;
	}

	public void setDate_of_Registration(LocalDateTime date_of_Registration) {
		this.date_of_Registration = date_of_Registration;
	}

	public LocalDateTime getLast_login() {
		return last_login;
	}

	public void setLast_login(LocalDateTime last_login) {
		this.last_login = last_login;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
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
	
	public Users() {
		
	}

}
