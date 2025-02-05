package com.emoyPro.User_Mangement_Service_Entities;

//import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Roles {

//	@Id
	private int role_id;
	private String role_description;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_description() {
		return role_description;
	}

	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}

	public Roles(int role_id, String role_description) {
		super();
		this.role_id = role_id;
		this.role_description = role_description;
	}

}
