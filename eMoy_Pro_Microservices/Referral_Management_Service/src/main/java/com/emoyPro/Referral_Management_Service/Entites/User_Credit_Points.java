package com.emoyPro.Referral_Management_Service.Entites;

import java.security.Timestamp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class User_Credit_Points {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer user_id;
	private Integer no_of_points;
	private Integer total_amount;
	private String created_by;
	private Timestamp created_date;
	private String updated_by;
	private Timestamp updated_date;

	private Integer user_credit_points_id;

	public Integer getUser_credit_points_id() {
		return user_credit_points_id;
	}

	public void setUser_credit_points_id(Integer user_credit_points_id) {
		this.user_credit_points_id = user_credit_points_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getNo_of_points() {
		return no_of_points;
	}

	public void setNo_of_points(int no_of_points) {
		this.no_of_points = no_of_points;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Timestamp getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}

}
