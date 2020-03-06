package com.natnasolutions.ticketing.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.service.UserService;


@RestController
public class UserController {
	private static final Logger logger = LogManager.getLogger(UserController.class);

	/*@Autowired
	private UserRegistrationValidator userRegistrationValidator;
	@Autowired
	private UserPasswordResetValidator userPasswordResetValidator;
	@Autowired
	private UserPasswordChangeValidator userPasswordChangeValidator;*/
	@Autowired
	private UserService userService;

	/*@GetMapping(path = "/user")
	public List<User> getAll() {
		return userService.getAllUsers();
	}

	@PostMapping(path = "/user")
	public HttpStatus insertUser(@RequestBody User user) {
		return userService.addUser(user) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@PutMapping(path = "/user")
	public HttpStatus updateUser(@RequestBody User user) {
		return userService.updateUser(user) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

	@PatchMapping(path = "/user")
	public HttpStatus patchUser(@RequestBody User user) {
		return userService.updateUser(user) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping(path = "/user/{id}")
	public HttpStatus deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return HttpStatus.NO_CONTENT;
	}

	@GetMapping(path = "/user/{id}")
	public User getAllUsers(@PathVariable Long id) {
		return userService.getById(id);
	}

	@GetMapping(path = "/userByName/{name}")
	public List<User> getUsereByName(@PathVariable String name) {
		return userService.findByName(name);
	}*/

	/*
	 * @RequestMapping(value = "/createUser", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public User createUser(User user) {
	 * logger.info("Creating User. Data: " + user); return user; }
	 */
	/*
	 * @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String saveUser(User user) {
	 * logger.info("Saving the Media. Data : " + user); // if media id is 0 then
	 * creating the media other updating the // media
	 * 
	 * userRegistrationValidator.validate(user, result);
	 * 
	 * if (result.hasErrors()) { return new ModelAndView("userForm"); }
	 * 
	 * 
	 * if (user.getId() == 0) { userService.createUser(user); } else {
	 * userService.updateUser(user); }
	 * 
	 * // userService.autologin(user.getUsername(), user.getPassword());
	 * 
	 * return user.getUsername(); }
	 * 
	 * @RequestMapping(value = "/userCreated", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public ModelAndView userCreated() { return new
	 * ModelAndView("userCreated"); }
	 * 
	 * @RequestMapping(value = "/userLoginDisplay", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String userLoginDisplay() { return "userLogin"; }
	 * 
	 * @RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String userLogin(@RequestParam(value = "error",
	 * required = false) String error,
	 * 
	 * @RequestParam(value = "logout", required = false) String logout) {
	 * 
	 * ModelAndView model = new ModelAndView(); if (error != null) { return
	 * "Invalid Credentials provided."; }
	 * 
	 * if (logout != null) { return "Logged out from ethioNews successfully.";
	 * 
	 * }
	 * 
	 * return "userLogin"; }
	 * 
	 * @RequestMapping(value = "/userLogout")
	 * 
	 * @ResponseBody public String userLogout(Model model, String error, String
	 * logout) { return "news"; }
	 * 
	 * @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String accessDenied() { return "accessDenied"; }
	 * 
	 * @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public List<User> getAllUsers() {
	 * logger.info("Getting all Users."); List<User> userList =
	 * userService.getAllUsers(); return userList; }
	 * 
	 * @RequestMapping(value = "/getEnabledUsers", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public List<User> getEnabledUsers() {
	 * logger.info("Getting  all enabled Users."); List<User> userList =
	 * userService.getAllUsers(); List<User> filteredUserList =
	 * userList.stream().filter(user -> user.isEnabled() == true)
	 * .collect(Collectors.toList()); return filteredUserList; }
	 * 
	 * @RequestMapping(value = "/getDisabledUsers", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public List<User> getDisabledUsers() {
	 * logger.info("Getting all disabled Users."); List<User> userList =
	 * userService.getAllUsers(); List<User> filteredUserList =
	 * userList.stream().filter(user -> user.isEnabled() == false)
	 * .collect(Collectors.toList()); return filteredUserList; }
	 * 
	 * @RequestMapping(value = "/enableUser", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String enableUser(@RequestParam String
	 * id, @RequestParam boolean action) { logger.info("Getting all Users.");
	 * User user = userService.findByUsername(id); user.setEnabled(action);
	 * userService.enableOrDisableUser(user);
	 * 
	 * return "redirect:getAllUsers"; }
	 * 
	 * @RequestMapping(value = "/disableUser", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String disableUser(@RequestParam String
	 * id, @RequestParam boolean action) { logger.info("Getting all Users.");
	 * User user = userService.findByUsername(id); user.setEnabled(action);
	 * userService.enableOrDisableUser(user);
	 * 
	 * return "redirect:getAllUsers"; }
	 * 
	 * @RequestMapping("searchUser")
	 * 
	 * @ResponseBody public List<User> searchUser(@RequestParam("username")
	 * String username) { logger.info("Searching the User. User Names: " +
	 * username); List<User> userList = userService.getAllUsers(username);
	 * return userList; }
	 * 
	 * @RequestMapping(value = "/sessionExpired", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String sessionExpired() { return "sessionExpired"; }
	 * 
	 * @RequestMapping(value = "/invalidSession", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String invalidSession() { return "invalidSession"; }
	 * 
	 * @RequestMapping(value = "/passwordReset", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String passwordEmailVerify(@ModelAttribute User
	 * user) { return "passwordReset"; }
	 * 
	 * @RequestMapping(value = "/passwordReset", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String passwordEmailVerify(Model model, @Validated
	 * User user, BindingResult result) {
	 * userPasswordResetValidator.validate(user, result);
	 * 
	 * if (result.hasErrors()) { return "passwordReset"; }
	 * 
	 * // update the user with the new password String newPassword =
	 * TicketUtil.generatePassword(); // update old password with the new one
	 * User updatedUser = userService.findByUsername(user.getUsername());
	 * updatedUser.setPassword(newPassword);
	 * userService.updateUser(updatedUser);
	 * 
	 * // send password reset instruction mail to user //
	 * mailService.sendPasswordResetEmail(user, newPassword);
	 * 
	 * return user.getUsername(); }
	 * 
	 * @RequestMapping(value = "/passwordChange", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String passwordChange(@ModelAttribute User user) {
	 * logger.info("Change Password form rendered"); return "passwordChange"; }
	 * 
	 * @RequestMapping(value = "/passwordChange", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String passwordChange(Model model, @Validated User
	 * user, BindingResult result) { logger.info("Updating password for : " +
	 * user);
	 * 
	 * userPasswordChangeValidator.validate(user, result);
	 * 
	 * if (result.hasErrors()) { return "passwordChange"; }
	 * 
	 * String username = userService.findLoggedInUser().getUsername(); if (null
	 * == username) { return
	 * "Your session has been expired. Please Login again"; } // User loggedUser
	 * = userService.findByUsername(username); User loggedUser =
	 * userService.findLoggedInUser();
	 * loggedUser.setPassword(user.getPassword());
	 * 
	 * userService.updateUser(loggedUser);
	 * 
	 * return "Your password has been updated succesfully"; }
	 * 
	 * @RequestMapping(value = "/newPassword", method = RequestMethod.GET)
	 * public String resetPassword(@RequestParam String newPassword, Map<String,
	 * String> model) { String emailId =
	 * TicketUtil.getDecodedFromBase64(newPassword); User loggedUser =
	 * userService.findByUsername(emailId); if (null == loggedUser) { return
	 * "The Link has been expired. Please try to reset your password again"; }
	 * // model.put("emailid", emailId); return "passwordChange"; }
	 */
}
