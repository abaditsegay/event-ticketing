package com.natnasolutions.ticketing.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;
import com.natnasolutions.ticketing.repository.UserRepository;
import com.natnasolutions.ticketing.repository.UserRoleRepository;
import com.natnasolutions.ticketing.service.UserService;
import com.natnasolutions.ticketing.util.TicketUtil;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;

	/*
	 * @Autowired private AuthenticationManager authenticationManager;
	 */
	@Autowired
	private UserDetailsService userDetailsService;

	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 * 
	 */

	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	public List<User> findByName(String name) {
		return userRepository.findByFirstName(name);
	}

	public User getById(Long id) {
		return userRepository.findOne(id);
	}

	public void deleteUser(Long userId) {
		userRepository.delete(userId);
	}

	public boolean addUser(User user) {
		return userRepository.save(user) != null;
	}

	public boolean updateUser(User user) {
		return userRepository.save(user) != null;
	}

	/*
	 * @Override public long createUser(User user) { List<UserRole> roleList =
	 * userRoleDao.getAllUserRoles("ROLE_USER"); user.setEnabled(true);
	 * Set<UserRole> userRoles = new HashSet<UserRole>(roleList);
	 * user.setUserRoles(userRoles);
	 * user.setPassword(TicketUtil.passwordEncoder(user.getPassword()));
	 * 
	 * return userDao.createUser(user); }
	 */

	/*
	 * @Override public long createAdmin(User user) { List<UserRole> roleList =
	 * userRoleDao.getAllUserRoles("ROLE_ADMIN"); user.setEnabled(true);
	 * Set<UserRole> userRoles = new HashSet<UserRole>(roleList);
	 * user.setUserRoles(userRoles);
	 * user.setPassword(TicketUtil.passwordEncoder(user.getPassword()));
	 * 
	 * return userDao.createUser(user); }
	 */
	/*
	 * @Override public User updateUser(User user) {
	 * user.setPassword(TicketUtil.passwordEncoder(user.getPassword())); return
	 * userDao.updateUser(user); }
	 * 
	 * public User enableOrDisableUser(User user) { return
	 * userDao.updateUser(user); }
	 * 
	 * @Override public List<User> getAllUsers() { return userDao.getAllUsers();
	 * }
	 * 
	 * @Override public User findByUsername(String username) { return
	 * userDao.findByUsername(username); }
	 */

	/*
	 * public String findLoggedInUsername() { Authentication authentication =
	 * SecurityContextHolder.getContext().getAuthentication(); UserDetails
	 * userDetails = (UserDetails) authentication.getPrincipal();
	 * 
	 * return userDetails.getUsername(); }
	 */
	public User findLoggedUser() {
		String loggedUsername = findLoggedInUsername();
		User loggedUser = findByUsername(loggedUsername);
		return loggedUser;
	}

	/*
	 * public User findLoggedInUser() {
	 * 
	 * Authentication authentication =
	 * SecurityContextHolder.getContext().getAuthentication(); UserDetails
	 * userDetails = (UserDetails) authentication.getPrincipal(); if
	 * (userDetails instanceof UserDetails) { User user = new User(); //
	 * user.setId(userDetails.get); user.setUsername(userDetails.getUsername());
	 * user.setPassword(userDetails.getPassword());
	 * user.setEnabled(userDetails.isEnabled());
	 * 
	 * return user; } return null; }
	 */

	public void autologin(String username, String password) {
		/*
		 * try { UserDetails userDetails =
		 * userDetailsService.loadUserByUsername(username);
		 * UsernamePasswordAuthenticationToken
		 * usernamePasswordAuthenticationToken = new
		 * UsernamePasswordAuthenticationToken( userDetails, password,
		 * userDetails.getAuthorities());
		 * 
		 * authenticationManager.authenticate(
		 * usernamePasswordAuthenticationToken);
		 * 
		 * if (usernamePasswordAuthenticationToken.isAuthenticated()) {
		 * SecurityContextHolder.getContext().setAuthentication(
		 * usernamePasswordAuthenticationToken); logger.debug(String.format(
		 * "Auto login %s successfully!", username)); } } catch (Exception e) {
		 * logger.info("Exception: " + e.getMessage()); }
		 */
	}

	/*
	 * @Override public List<User> getAllUsers(String username) { return
	 * userDao.getAllUsers(username); }
	 */
}
