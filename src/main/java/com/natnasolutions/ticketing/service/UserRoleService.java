package com.natnasolutions.ticketing.service;

import java.util.List;
import java.util.Optional;

import com.natnasolutions.ticketing.model.UserRole;

public interface UserRoleService {

	public List<UserRole> getAllUserRoles();

	boolean addUserRole(UserRole userRole);

	public boolean updateUserRole(UserRole userRole);

	public void deleteUserRole(Long id);

	public Optional<UserRole> getUserRole(Long id);

	public List<UserRole> getUsereRoleByType(String roletype);

}
