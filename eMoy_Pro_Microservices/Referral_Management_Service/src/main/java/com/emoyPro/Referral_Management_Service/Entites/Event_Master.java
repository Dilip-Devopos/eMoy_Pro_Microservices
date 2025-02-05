package com.emoyPro.Referral_Management_Service.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event_Master {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eventId;
	private String description;

	public Event_Master(Integer eventId, String description) {
		this.eventId = eventId;
		this.description = description;
	}

	public Integer getEvent_id() {
		return eventId;
	}

	public void setEvent_id(Integer event_id) {
		this.eventId = event_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Event_Master() {

	}

}
