package com.natnasolutions.ticketing.service;

import java.util.List;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;

public interface UserRoleService {

	List<User> getAllUserRoles();

	boolean addUserRole(User user);

	boolean updateUserRole(User user);

	void deleteUserRole(Long id);

	User getById(Long id);

	List<User> findByName(String name);
	
	
	
}
	/*public long createUserRole(UserRole userRole);

	public UserRole updateUserRole(UserRole userRole);

	public void deleteUserRole(long id);

	public List<UserRole> getAllUserRoles();

	public UserRole getUserRole(long id);

	public List<UserRole> getAllUserRoles(String roleType);
}*/
