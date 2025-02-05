package com.emoyPro.Referral_Management_Service.Controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emoyPro.Referral_Management_Service.Dtos.Referal_DTO;
import com.emoyPro.Referral_Management_Service.Dtos.Referal_Update_DTO;
import com.emoyPro.Referral_Management_Service.Dtos.Refferal_Booked_DTO;
import com.emoyPro.Referral_Management_Service.Dtos.User_Profile_with_Referral_DTO;
import com.emoyPro.Referral_Management_Service.Entites.Branch_details;
import com.emoyPro.Referral_Management_Service.Entites.Event_Master;
import com.emoyPro.Referral_Management_Service.ServicesImp.Referal_services;

@RestController
@RequestMapping("/referrals")
public class Referal_Controller {

	@Autowired
	private Referal_services services;

	private static final Logger log = (Logger) LoggerFactory.getLogger(Controller.class);

	@PostMapping("/referral")
	public UUID insert_add_referal(@RequestBody Referal_DTO prof) {
		log.info("POSTING_PROFILE...");
		return services.addbranchinfo(prof);
	}

	@GetMapping("/branch")
	public ResponseEntity<List<Branch_details>> get_allBranches() {
		List<Branch_details> profiles = services.get_allBranch_details();
		log.info("getAllBranches()... ");
		return ResponseEntity.ok(profiles);
	}

	@GetMapping("/events")
	public List<Event_Master> get_AllEvents() {
		return services.get_AllEvents();

	}

	// GET_BY_ID
	@GetMapping("/referral/{id}/{offset}/{limit}")
	public ResponseEntity<List<User_Profile_with_Referral_DTO>> GetReferralById(@PathVariable UUID id,@PathVariable  Integer offset ,@PathVariable Integer limit) {
		List<User_Profile_with_Referral_DTO> profiles = services.get_by_id(id,offset,limit);
		log.info("get_GetReferralById()... ");
		return ResponseEntity.ok(profiles);
	}

	@GetMapping("/referral/{offset}/{limit}")
	public ResponseEntity<List<User_Profile_with_Referral_DTO>> get_allReferal(@PathVariable  Integer offset ,@PathVariable Integer limit) {
		List<User_Profile_with_Referral_DTO> profiles = services.getreferallist(offset,limit);
		log.info("get_allReferal()... ");
		return ResponseEntity.ok(profiles);
	}

	@PutMapping("/referral/{id}")
	public Referal_Update_DTO update_Referal(@PathVariable Integer id, @RequestBody Referal_Update_DTO prof) {
		log.info("UPDATING_PROFILE...");
		return services.updatedReferal(id, prof);
	}

	@DeleteMapping("/referral/{r_id}/{updated_by}")
	public void delete_referal_info(@PathVariable Integer r_id, @PathVariable String updated_by) {
		log.info("DELETING...");
		services.deleInfo(r_id, updated_by);
	}

	@PutMapping("/referral/booked/{id}")
	public void is_booked(@PathVariable Integer id, @RequestBody Refferal_Booked_DTO booked) {
		System.out.println("Received booked value: " + booked);
		services.is_booked(id, booked.getIs_referral_booked());
	}

	@GetMapping("/branch/{id}/{offset}/{limit}")
	public ResponseEntity<List<User_Profile_with_Referral_DTO>> get_by_branchid(@PathVariable Integer id , @PathVariable  Integer offset ,@PathVariable Integer limit) {
		List<User_Profile_with_Referral_DTO> ref = services.get_by_branchid(id,offset,limit);
		log.info( "answer iss :    " +ref.get(0));
		return ResponseEntity.ok(ref);
	}
	
//	@GetMapping("/branch/{id}/{offset}/{limit}")
//	public List<Referal_Info> get_by_branchid(@PathVariable Integer id , @PathVariable  Integer offset ,@PathVariable Integer limit){
//		List<Referal_Info> ref = services.get_by_branchid(id,offset,limit);
//		return ref;
//	}

	@GetMapping("/referral/search")
	public ResponseEntity<List<User_Profile_with_Referral_DTO>> search(@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate, @RequestParam(required = false) Integer id,
			@RequestParam(required = false) String is_referral_booked ,
			@RequestParam Integer offset ,@RequestParam Integer limit)
	{
		
		LocalDate start = (startDate != null && !startDate.equalsIgnoreCase("null")) ? LocalDate.parse(startDate)
				: null;
		LocalDate end = (endDate != null && !endDate.equalsIgnoreCase("null")) ? LocalDate.parse(endDate) : null;

		List<User_Profile_with_Referral_DTO> result = services.search(start, end, id, is_referral_booked,offset,limit);

		return ResponseEntity.ok(result);
	}

}
