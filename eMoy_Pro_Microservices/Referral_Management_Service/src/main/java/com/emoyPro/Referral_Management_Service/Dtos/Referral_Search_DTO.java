package com.emoyPro.Referral_Management_Service.Dtos;

import java.time.LocalDate;


public class Referral_Search_DTO {


	private Integer branch_id;
	private LocalDate startdate;
    private LocalDate enddate;

	

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}


	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}

	public Referral_Search_DTO() {
		
	}
}
