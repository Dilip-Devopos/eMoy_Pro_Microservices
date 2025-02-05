package com.emoyPro.Referral_Management_Service.ServicesImp;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.emoyPro.Referral_Management_Service.Dtos.Referal_DTO;
import com.emoyPro.Referral_Management_Service.Dtos.Referal_Update_DTO;
import com.emoyPro.Referral_Management_Service.Dtos.User_Profile_with_Referral_DTO;
import com.emoyPro.Referral_Management_Service.Entites.Branch_details;
import com.emoyPro.Referral_Management_Service.Entites.Event_Master;
import com.emoyPro.Referral_Management_Service.Entites.Referal_Info;
import com.emoyPro.Referral_Management_Service.Interfaces.UserProfile_interface;
import com.emoyPro.Referral_Management_Service.Repositories.Branch_Repository;
import com.emoyPro.Referral_Management_Service.Repositories.Events_Repository;
import com.emoyPro.Referral_Management_Service.Repositories.Referral2_Repository;
import com.emoyPro.Referral_Management_Service.Repositories.Referral_info_Repository;
import com.emoyPro.User_Mangement_Service_Entities.User_Profile;

@Service
public class Referal_services {

	private Logger log = LoggerFactory.getLogger(Referal_services.class);

	@Autowired
	private Referral_info_Repository repository;

	@Autowired
	private Referral2_Repository repo;

	@Autowired
	private Events_Repository event_repo;

	@Autowired
	private Branch_Repository b_repo;

	@Autowired
	private UserProfile_interface u_interface;

	// PUT FOR BOOKED

	public void is_booked(Integer id, String booked) {
		repository.is_booked(id, booked);
	}

	// GET FOR All Branches DB

	public List<Branch_details> get_allBranch_details() {
		return b_repo.getAll_branchdetails();
	}

	// GET BY ID

	public List<User_Profile_with_Referral_DTO> get_by_id(UUID id ,Integer offset , Integer limit) {
		List<Referal_Info> referal_Infos = repo.getAllReferal_GetInfo_id(id,offset,limit);

		return referal_Infos.stream().flatMap(referalInfo -> {
			UUID userId = referalInfo.getUser_id();
			ResponseEntity<List<User_Profile>> response = u_interface.get_profile_by_id(userId);

			log.info("Response Check: " + response.getBody());
			List<User_Profile> userProfiles = response.getBody();

			userProfiles.forEach(userProfile -> {
				log.info("User ID: " + userProfile.getUser_id() + ", Profile Picture: "
						+ userProfile.getProfile_picture());
			});

			return userProfiles.stream()
					.map(userProfile -> new User_Profile_with_Referral_DTO(referalInfo, userProfile));
		}).collect(Collectors.toList());
	}

	// POST FOR DB

	public UUID addbranchinfo(Referal_DTO referal_DTO) {
		return repository.addBranchInfo(referal_DTO.getUser_id(), referal_DTO.getBranch_id(), referal_DTO.getEvent_id(),
				referal_DTO.getCustomer_name(), referal_DTO.getAddress(), referal_DTO.getDate_of_function(),
				referal_DTO.getCustomer_mobile_number(), referal_DTO.getCustomer_whatsapp_number(),
				referal_DTO.getNo_of_table(), referal_DTO.getSelf_proposal(), referal_DTO.getDescription(),
				referal_DTO.getEvent_photo(), referal_DTO.getCreated_by(), referal_DTO.getUpdated_by());

	}

	// sp_get_referral_info_list for DB
	public List<User_Profile_with_Referral_DTO> getreferallist(Integer offset , Integer limit) {

		List<Referal_Info> referal_Infos = repo.getAllReferal_GetInfo(offset,limit);

		return referal_Infos.stream().flatMap(referalInfo -> {
			UUID userId = referalInfo.getUser_id();
			ResponseEntity<List<User_Profile>> response = u_interface.get_profile_by_id(userId);
			log.info("response Check : " + response.getBody());
			List<User_Profile> userProfiles = response.getBody();

			userProfiles.forEach(userProfile -> {
				log.info("User ID: " + userProfile.getUser_id() + ", Profile Picture: "
						+ userProfile.getProfile_picture());
			});
			return userProfiles.stream()
					.map(userProfile -> new User_Profile_with_Referral_DTO(referalInfo, userProfile));

		})

				.collect(Collectors.toList());

	}

	// UPDATE FOR DB

	public Referal_Update_DTO updatedReferal(Integer id, Referal_Update_DTO updatedReferal) {
		if (id == updatedReferal.getReferral_info_id()) {
			repository.updateReferralInfo(id, updatedReferal.getUser_id(), updatedReferal.getBranch_id(),
					updatedReferal.getEvent_id(), updatedReferal.getCustomer_name(), updatedReferal.getAddress(),
					updatedReferal.getDate_of_function(), updatedReferal.getCustomer_mobile_number(),
					updatedReferal.getCustomer_whatsapp_number(), updatedReferal.getNo_of_table(),
					updatedReferal.getSelf_proposal(), updatedReferal.getDescription(), updatedReferal.getEvent_photo(),
					updatedReferal.getUpdated_by());

			return updatedReferal;
		} else {
			return null;
		}

	}

	// DELETE FOR DB

	public void deleInfo(Integer r_id, String u_by) {

		repository.deleteReferralInfo(r_id, u_by);
	}

	// GET ALL BRANCH

	public List<Event_Master> get_AllEvents() {
		return event_repo.getAllEventMasters();
	}

	// GET BY BRANCH_ID

	
//	public List<Referal_Info> get_by_branchid(Integer branchId , Integer offset, Integer limit){
//		List<Referal_Info> referalInfos = repo.get_by_branchid(branchId , offset , limit);
//		return referalInfos
//	}
	public List<User_Profile_with_Referral_DTO> get_by_branchid(Integer branchId , Integer offset, Integer limit) {

		List<Referal_Info> referalInfos = repo.get_by_branchid(branchId , offset , limit);

		return referalInfos.stream().flatMap(referalInfo -> {
			UUID userId = referalInfo.getUser_id();
			ResponseEntity<List<User_Profile>> response = u_interface.get_profile_by_id(userId);
			log.info("Response Check: " + response.getBody());

			List<User_Profile> userProfiles = response.getBody();
			userProfiles.forEach(userProfile -> log.info(
					"User ID: " + userProfile.getUser_id() + ", Profile Picture: " + userProfile.getProfile_picture()));

			return userProfiles.stream()
					.map(userProfile -> new User_Profile_with_Referral_DTO(referalInfo, userProfile));
		}).collect(Collectors.toList());
		
		
	}

	// SEARCH

	public List<User_Profile_with_Referral_DTO> search(LocalDate startDate, LocalDate endDate, Integer id,
			String isReferralBooked,Integer offset,Integer limit) {
		List<Referal_Info> referalInfos = repository.search(startDate, endDate, id, isReferralBooked,offset,limit);

		return referalInfos.stream().flatMap(referalInfo -> {
			UUID userId = referalInfo.getUser_id();
			ResponseEntity<List<User_Profile>> response = u_interface.get_profile_by_id(userId);
			log.info("response Check : " + response.getBody());

			List<User_Profile> userProfiles = response.getBody();

			userProfiles.forEach(userProfile -> {
				log.info("User ID: " + userProfile.getUser_id() + ", Profile Picture: "
						+ userProfile.getProfile_picture());
			});

			return userProfiles.stream()
					.map(userProfile -> new User_Profile_with_Referral_DTO(referalInfo, userProfile));
		}).collect(Collectors.toList());
	}

}