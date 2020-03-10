package com.natnasolutions.ticketing.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
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

	public List<UserRole> getAllUserRoles() {
		return userRoleRepository.findAll();
	}

	@Override
	public boolean updateUserRole(UserRole userRole) {
		return userRoleRepository.save(userRole) != null;
	}

	@Override
	public void deleteUserRole(Long id) {
		userRoleRepository.deleteById(id);

	}

	@Override
	public Optional<UserRole> getUserRole(Long id) {
		return userRoleRepository.findById(id);
	}

	@Override
	public List<UserRole> getUsereRoleByType(String roletype) {
		// TODO Auto-generated method stub
		return null;
	}

}
