package com.natnasolutions.ticketing.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;
import com.natnasolutions.ticketing.repository.UserRoleRepository;
import com.natnasolutions.ticketing.service.UserRoleService;

@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepository;

	public boolean addUserRole(UserRole userRole) {
		return userRoleRepository.save(userRole) != null;
	}
	/*
	 * public UserRole updateUserRole(UserRole userRole) { return
	 * userRoleRepository.updateUserRole(userRole); }
	 * 
	 * public void deleteUserRole(long id) {
	 * userRoleRepository.deleteUserRole(id);
	 * 
	 * }
	 */
	/*
	 * public List<UserRole> getAllUserRoles() { return
	 * userRoleRepository.getAllUserRoles(); }
	 */

	/*
	 * public UserRole getUserRole(long id) { return
	 * userRoleRepository.getUserRole(id); }
	 * 
	 * @Override public List<User> getAllUserRoles() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public boolean addUserRole(User user) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean updateUserRole(User user) { // TODO
	 * Auto-generated method stub return false; }
	 */

	/*
	 * @Override public void deleteUserRole(Long id) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public User getById(Long id) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public List<User> findByName(String name) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
