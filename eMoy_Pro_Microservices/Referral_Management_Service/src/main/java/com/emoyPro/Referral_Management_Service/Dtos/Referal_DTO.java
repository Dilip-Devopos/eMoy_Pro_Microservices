package com.emoyPro.Referral_Management_Service.Dtos;

import java.sql.Date;
import java.util.UUID;



public class Referal_DTO {	

	private UUID user_id;
	private Integer branch_id;
	private Integer event_id;
	private String customer_name;
	private String address;
	private Date date_of_function;
	private String customer_mobile_number;
	private String customer_whatsapp_number;
	private String no_of_table;
	private String self_proposal;
	private String description;
	private byte[]event_photo;
	private String created_by;
	private String updated_by;
	
	public UUID getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = UUID.fromString(user_id);
	}
	public Integer getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}
	public Integer getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate_of_function() {
		return date_of_function;
	}
	public void setDate_of_function(Date date_of_function) {
		this.date_of_function = date_of_function;
	}
	public String getCustomer_mobile_number() {
		return customer_mobile_number;
	}
	public void setCustomer_mobile_number(String customer_mobile_number) {
		this.customer_mobile_number = customer_mobile_number;
	}
	public String getCustomer_whatsapp_number() {
		return customer_whatsapp_number;
	}
	public void setCustomer_whatsapp_number(String customer_whatsapp_number) {
		this.customer_whatsapp_number = customer_whatsapp_number;
	}
	public String getNo_of_table() {
		return no_of_table;
	}
	public void setNo_of_table(String no_of_table) {
		this.no_of_table = no_of_table;
	}
	public String getSelf_proposal() {
		return self_proposal;
	}
	public void setSelf_proposal(String self_proposal) {
		this.self_proposal = self_proposal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getEvent_photo() {
		return event_photo;
	}
	public void setEvent_photo(byte[] event_photo) {
		this.event_photo = event_photo;
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
	
	public Referal_DTO(UUID user_id, Integer branch_id, Integer event_id, String customer_name, String address,
			Date date_of_function, String customer_mobile_number, String customer_whatsapp_number, String no_of_table,
			String self_proposal, String description, byte[] event_photo, String created_by, String updated_by) {
		super();
		this.user_id = user_id;
		this.branch_id = branch_id;
		this.event_id = event_id;
		this.customer_name = customer_name;
		this.address = address;
		this.date_of_function = date_of_function;
		this.customer_mobile_number = customer_mobile_number;
		this.customer_whatsapp_number = customer_whatsapp_number;
		this.no_of_table = no_of_table;
		this.self_proposal = self_proposal;
		this.description = description;
		this.event_photo = event_photo;
		this.created_by = created_by;
		this.updated_by = updated_by;
	}
	
	

	


}
