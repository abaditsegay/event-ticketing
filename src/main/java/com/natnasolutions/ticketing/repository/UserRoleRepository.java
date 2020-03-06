package com.natnasolutions.ticketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
	public long createUserRole(UserRole userRole);

	public UserRole updateUserRole(UserRole userRole);

	public void deleteUserRole(long id);

	public List<UserRole> getAllUserRoles();

	public UserRole getUserRole(long id);

}
