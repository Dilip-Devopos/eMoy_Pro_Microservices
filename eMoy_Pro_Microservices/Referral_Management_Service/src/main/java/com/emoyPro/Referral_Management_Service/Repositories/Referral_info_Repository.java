package com.emoyPro.Referral_Management_Service.Repositories;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emoyPro.Referral_Management_Service.Entites.Referal_Info;

@Repository
public interface Referral_info_Repository extends JpaRepository<Referal_Info, Integer> {

	// Post

	@Query(value = "SELECT public.sp_add_referral_info(:p_user_id, :p_branch_id, :p_event_id, :p_customer_name, "
			+ ":p_address, :p_date_of_function, :p_customer_mobile_number, :p_customer_whatsapp_number, "
			+ ":p_no_of_table, :p_self_proposal, :p_description, :p_event_photo, :p_created_by, :p_updated_by)", nativeQuery = true)
	UUID addBranchInfo(@Param("p_user_id") UUID user_id, @Param("p_branch_id") Integer branch_id,
			@Param("p_event_id") Integer event_id, @Param("p_customer_name") String customer_name,
			@Param("p_address") String address, @Param("p_date_of_function") Date date_of_function,
			@Param("p_customer_mobile_number") String customer_mobile_number,
			@Param("p_customer_whatsapp_number") String customer_whatsapp_number,
			@Param("p_no_of_table") String no_of_table, @Param("p_self_proposal") String self_proposal,
			@Param("p_description") String description, @Param("p_event_photo") byte[] event_photo,
			@Param("p_created_by") String created_by, @Param("p_updated_by") String updated_by);

	// update

	@Query(value = "SELECT public.sp_update_referral_info(:p_referral_info_id,:p_user_id,:p_branch_id,:p_event_id,"
			+ ":p_customer_name,:p_address,:p_date_of_function,:p_customer_mobile_number,:p_customer_whatsapp_number,"
			+ ":p_no_of_table,:p_self_proposal,:p_description,:p_event_photo,:p_updated_by)", nativeQuery = true)
	void updateReferralInfo(@Param("p_referral_info_id") Integer referral_info_id, @Param("p_user_id") UUID user_id,
			@Param("p_branch_id") Integer branch_id, @Param("p_event_id") Integer event_id,
			@Param("p_customer_name") String customer_name, @Param("p_address") String address,
			@Param("p_date_of_function") java.sql.Date date_of_function,
			@Param("p_customer_mobile_number") String customer_mobile_number,
			@Param("p_customer_whatsapp_number") String customer_whatsapp_number,
			@Param("p_no_of_table") String no_of_table, @Param("p_self_proposal") String self_proposal,
			@Param("p_description") String description, @Param("p_event_photo") byte[] event_photo,
			@Param("p_updated_by") String updated_by);

	// Delete

	@Query(value = "SELECT public.sp_delete_referral_info(:p_referral_info_id,:p_updated_by)", nativeQuery = true)
	void deleteReferralInfo(@Param("p_referral_info_id") Integer referral_info_id,
			@Param("p_updated_by") String updated_by);

	// is_Booked

	@Query(value = "SELECT public.sp_referral_booked_status(:referral_info_id, :is_referral_booked)", nativeQuery = true)
	void is_booked(@Param("referral_info_id") Integer referral_info_id,
			@Param("is_referral_booked") String is_referral_booked);

	// SERACH

	@Query(value = "SELECT * FROM public.sp_get_referral_info_search(:startdate , :enddate , :branch_id, :is_referral_booked,:p_offset, :p_limit)", nativeQuery = true)
	List<Referal_Info> search(@Param("startdate") LocalDate startdate, @Param("enddate") LocalDate enddate,
			@Param("branch_id") Integer branch_id,
			@Param("is_referral_booked") String is_referral_booked,
			@Param("p_offset")Integer offset,
			@Param("p_limit")Integer limit
			);

}
