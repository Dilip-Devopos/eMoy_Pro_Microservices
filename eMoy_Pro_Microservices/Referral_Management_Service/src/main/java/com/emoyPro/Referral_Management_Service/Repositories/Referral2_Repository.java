package com.emoyPro.Referral_Management_Service.Repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emoyPro.Referral_Management_Service.Entites.Referal_Info;

@Repository
public interface Referral2_Repository  extends JpaRepository<Referal_Info, Integer>{
	
	
	 // GET_All referral_info_list
	
	   @Query(value = "SELECT * FROM public.sp_get_referral_info_list(:offset , :limit)", nativeQuery = true)
    List<Referal_Info> getAllReferal_GetInfo(
 		   @Param("offset")Integer offset,
 		   @Param("limit")Integer limit
 		   );
    

    
    @Query(value = "SELECT * FROM public.sp_referral_get_by_id(:userId,:offset , :limit)",nativeQuery = true)
    List<Referal_Info> getAllReferal_GetInfo_id(
  		  @Param ("userId") UUID user_id,
  		 @Param("offset") Integer offset,
				@Param("limit")Integer limit
  		  );
    
  //GET_BY_BRANCH_ID
    
		@Query(value = "SELECT * FROM public.sp_get_referral_info_by_branch_id(:branch_id , :offset,:limit)",nativeQuery = true)
		List<Referal_Info> get_by_branchid ( 
				@Param("branch_id") Integer branch_id,
				@Param("offset") Integer offset,
				@Param("limit")Integer limit
				);
      
}
