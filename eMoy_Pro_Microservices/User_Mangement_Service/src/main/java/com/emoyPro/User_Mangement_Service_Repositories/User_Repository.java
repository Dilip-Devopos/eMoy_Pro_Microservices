package com.emoyPro.User_Mangement_Service_Repositories;


import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emoyPro.User_Mangement_Service_Entities.Users;


@Repository
public interface User_Repository extends JpaRepository<Users, UUID> {


	
	//POST 
	
	@Query(value = "SELECT public.sp_add_user(:user_id , :user_name, :password, :role_id, :email, :created_by, :updated_by)", nativeQuery = true)
UUID addUser(
    @Param("user_id") UUID userId,
    @Param("user_name") String userName,
    @Param("password") String password,
    @Param("role_id") Integer roleId,
    @Param("email") String email,
    @Param("created_by") String createdBy,
    @Param("updated_by") String updatedBy
);

	
	//PUT
	
	@Query(value = "SELECT public.sp_update_user(:user_id, :user_name , :password, :role_id , :email, :updated_by)", nativeQuery = true)
	void Update_user(
					@Param("user_id") UUID user_id,
					@Param("user_name")String user_name,
					@Param("password")String password,
					@Param("role_id") Integer role_id,
					@Param("email")String email,
					@Param("updated_by") String updated_by
			);
	
	
	//GET
	
	@Query(value = "SELECT * FROM public.sp_get_user_by_user_id(:user_id)", nativeQuery = true)
	List<Users> get_by_user_id(@Param("user_id") UUID user_id);

	
}


