package com.emoyPro.User_Mangement_Service_Repositories;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emoyPro.User_Mangement_Service_Entities.User_Profile;

@Repository
public interface User_Profile_Repository extends JpaRepository<User_Profile, Integer> {

	// POST

	@Query(value = "SELECT public.sp_add_user_profile(:userId, :firstName, :lastName, :gender, :dateOfBirth, :email, :address, "
			+ ":mobileNumber, :whatsappNumber, :identityProof, :profilePicture, :branchId, :createdBy, :updatedBy)", nativeQuery = true)
	Integer addUserProfile(@Param("userId") UUID userId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("gender") String gender, @Param("dateOfBirth") Date date,
			@Param("email") String email, @Param("address") String address, @Param("mobileNumber") String mobileNumber,
			@Param("whatsappNumber") String whatsappNumber, @Param("identityProof") byte[] identityProof,
			@Param("profilePicture") byte[] profilePicture, @Param("branchId") Integer branchId,
			@Param("createdBy") String createdBy, @Param("updatedBy") String updatedBy);

	// GET_ALL

	@Query(value = "SELECT * FROM public.sp_get_all_user_profile()", nativeQuery = true)
	List<User_Profile> getAll_UserProfiles();

	// UPDATE

	@Query(value = "SELECT public.sp_update_user_profile(:userprofile_id, :user_id, :first_name, :last_name, :gender, :date_of_birth, :email, :address, :mobile_number, :whatsapp_number, :identity_proof, :profile_picture, :branch_id, :updated_by)", nativeQuery = true)
	void updateUserProfile(@Param("userprofile_id") Integer userprofileId, @Param("user_id") UUID userId,
			@Param("first_name") String firstName, @Param("last_name") String lastName, @Param("gender") String gender,
			@Param("date_of_birth") Date dateOfBirth, @Param("email") String email, @Param("address") String address,
			@Param("mobile_number") String mobileNumber, @Param("whatsapp_number") String whatsappNumber,
			@Param("identity_proof") byte[] identityProof, @Param("profile_picture") byte[] profilePicture,
			@Param("branch_id") Integer branchId, @Param("updated_by") String updatedBy);

	// GET_BY_ID
	@Query(value = "SELECT * FROM public.sp_get_userprofile_by_userid(:userid)", nativeQuery = true)
	List<User_Profile> get_user_by_id(@Param("userid") UUID user_id);

}
