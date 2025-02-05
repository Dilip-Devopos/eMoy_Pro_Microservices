package com.emoyPro.Referral_Management_Service.Repositories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emoyPro.Referral_Management_Service.Entites.Branch_details;

@Repository
public interface Branch_Repository extends JpaRepository<Branch_details, Integer> {


	// GET_ALL BRANCHES

	@Query(value = "SELECT * FROM public.sp_get_all_branch()", nativeQuery = true)
	List<Branch_details> getAll_branchdetails();
	
}
