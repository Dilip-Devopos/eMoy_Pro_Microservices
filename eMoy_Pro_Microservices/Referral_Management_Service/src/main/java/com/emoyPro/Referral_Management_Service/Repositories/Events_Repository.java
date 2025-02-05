package com.emoyPro.Referral_Management_Service.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emoyPro.Referral_Management_Service.Entites.Event_Master;

public interface Events_Repository extends JpaRepository<Event_Master, Integer> {

	
	 @Query(value = "SELECT * FROM public.sp_get_all_event_master()", nativeQuery = true)
     List<Event_Master> getAllEventMasters();
	
}
