package com.emoyPro.Referral_Management_Service.Entites;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Referal_Event {

	private Integer referral_event_id;
    private String	event;
    private Integer points;

	public int getReferral_event_id() {
		return referral_event_id;
	}
	public void setReferral_event_id(int referral_event_id) {
		this.referral_event_id = referral_event_id;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

}
