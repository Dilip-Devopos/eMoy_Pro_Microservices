package com.emoyPro.Referral_Management_Service.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Branch_details {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer branch_id;
	// private String branch_code;
	private String branch_name;
	// private String branch_address;
	// private String branch_mobile_1;
	// private String branch_mobile_2;
	
	
	
		public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	// public String getBranch_code() {
	// 	return branch_code;
	// }
	// public void setBranch_code(String branch_code) {
	// 	this.branch_code = branch_code;
	// }
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	// public String getBranch_address() {
	// 	return branch_address;
	// }
	// public void setBranch_address(String branch_address) {
	// 	this.branch_address = branch_address;
	// }
	// public String getBranch_mobile_1() {
	// 	return branch_mobile_1;
	// }
	// public void setBranch_mobile_1(String branch_mobile_1) {
	// 	this.branch_mobile_1 = branch_mobile_1;
	// }
	// public String getBranch_mobile_2() {
	// 	return branch_mobile_2;
	// }
	// public void setBranch_mobile_2(String branch_mobile_2) {
	// 	this.branch_mobile_2 = branch_mobile_2;
	// }
		
}
