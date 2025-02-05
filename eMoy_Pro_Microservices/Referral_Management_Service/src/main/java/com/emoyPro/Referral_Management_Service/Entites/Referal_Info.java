package com.emoyPro.Referral_Management_Service.Entites;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "referral_info")
public class Referal_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer referral_info_id;
	private Integer referral_event_id;
	private Integer branch_id;
	private Integer event_id;
	private UUID user_id;
	private String customer_name;
	private String address;
	private LocalDate date_of_function;
	private String customer_mobile_number;
	private String customer_whatsapp_number;
	private String no_of_table;
	private String self_proposal;
	private String description;
//	@JsonInclude(JsonInclude.Include.ALWAYS)
	private  byte[] event_photo;
	private String is_referral_booked;
	private String created_by;
	private LocalDateTime created_date;
	private String updated_by;
	private LocalDateTime updated_date;
	private String is_active;
	
	//
	
	private Integer user_credit_points_id;
	private Integer no_of_points;
	private Integer total_amount;
	private Integer total_sum_amount;
	

	public Integer getReferral_info_id() {
		return referral_info_id;
	}

	public void setReferral_info_id(Integer referral_info_id) {
		this.referral_info_id = referral_info_id;
	}

	public Integer getReferral_event_id() {
		return referral_event_id;
	}

	public void setReferral_event_id(Integer referral_event_id) {
		this.referral_event_id = referral_event_id;
	}

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}

	public UUID getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = UUID.fromString(user_id);
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public LocalDate getDate_of_function() {
		return date_of_function;
	}

	public void setDate_of_function(LocalDate date_of_function) {
		this.date_of_function = date_of_function;
	}

	public String getCustomer_mobile_number() {
		return customer_mobile_number;
	}

	public void setCustomer_mobile_number(String customer_mobile_number) {
		this.customer_mobile_number = customer_mobile_number;
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

//	public String getEventPhoteBase64() {
//		return eventPhoteBase64;
//	}
//	public void setEventPhoteBase64(String eventPhoteBase64) {
//		this.eventPhoteBase64 = eventPhoteBase64;
//	}
//	public byte[] getEvent_photo() {
//		return event_photo;
//	}
//	public void setEvent_photo(byte[] event_photo) {
//		this.event_photo = event_photo;
//	}
	public byte[] getEvent_photo() {
		return event_photo ;
	}

	public void setEvent_photo(String event_photo) {
		if (event_photo != null && !event_photo.isEmpty()) {
			this.event_photo = Base64.getDecoder().decode(event_photo);
		} else {
			this.event_photo = null;
		}
	}



	public String getIs_referral_booked() {
		return is_referral_booked;
	}

	public void setIs_referral_booked(String is_referral_booked) {
		this.is_referral_booked = is_referral_booked;
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

	public Integer getEvent_id() {
		return event_id;
	}

	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomer_whatsapp_number() {
		return customer_whatsapp_number;
	}

	public void setCustomer_whatsapp_number(String customer_whatsapp_number) {
		this.customer_whatsapp_number = customer_whatsapp_number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUser_credit_points_id() {
		return user_credit_points_id;
	}

	public void setUser_credit_points_id(Integer user_credit_points_id) {
		this.user_credit_points_id = user_credit_points_id;
	}

	public Integer getNo_of_points() {
		return no_of_points;
	}

	public void setNo_of_points(Integer no_of_points) {
		this.no_of_points = no_of_points;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public Integer getTotal_sum_amount() {
		return total_sum_amount;
	}

	public void setTotal_sum_amount(Integer total_sum_amount) {
		this.total_sum_amount = total_sum_amount;
	}

	
	public Referal_Info() {
		super();
	}

	public Referal_Info(Integer referral_info_id, Integer referral_event_id, Integer branch_id, Integer event_id,
			UUID user_id, String customer_name, String address, LocalDate date_of_function,
			String customer_mobile_number, String customer_whatsapp_number, String no_of_table, String self_proposal,
			String description, byte[] event_photo, String is_referral_booked, String created_by,
			LocalDateTime created_date, String updated_by, LocalDateTime updated_date, String is_active,
			Integer user_credit_points_id, Integer no_of_points, Integer total_amount , Integer total_sum_amount) {
		super();
		this.referral_info_id = referral_info_id;
		this.referral_event_id = referral_event_id;
		this.branch_id = branch_id;
		this.event_id = event_id;
		this.user_id = user_id;
		this.customer_name = customer_name;
		this.address = address;
		this.date_of_function = date_of_function;
		this.customer_mobile_number = customer_mobile_number;
		this.customer_whatsapp_number = customer_whatsapp_number;
		this.no_of_table = no_of_table;
		this.self_proposal = self_proposal;
		this.description = description;
		this.event_photo = event_photo;
		this.is_referral_booked = is_referral_booked;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.is_active = is_active;
		this.user_credit_points_id = user_credit_points_id;
		this.no_of_points = no_of_points;
		this.total_amount = total_amount;
		this.total_sum_amount = total_sum_amount;
	}

}
