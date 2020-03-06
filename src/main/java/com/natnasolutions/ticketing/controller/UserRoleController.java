package com.natnasolutions.ticketing.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;
import com.natnasolutions.ticketing.service.UserRoleService;

@Controller
public class UserRoleController {

	private static final Logger logger = LogManager.getLogger(UserRoleController.class);

	/*@Autowired
	private UserRoleService userRoleService;*/

	/*@GetMapping(path = "/userRole")
	public List<UserRole> getAll() {
		return userRoleService.getAllUserRoles();
	}

	@PostMapping(path = "/userRole")
	public HttpStatus insertUserRole(@RequestBody UserRole userRole) {
		return userRoleService.addUserRole(userRole) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@PutMapping(path = "/userRole")
	public HttpStatus updateUserRole(@RequestBody UserRole userRole) {
		return userRoleService.updateUserRole(userRole) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

	@PatchMapping(path = "/userRole")
	public HttpStatus patchUserRole(@RequestBody UserRole userRole) {
		return userRoleService.updateUserRole(userRole) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}*/

	/*@DeleteMapping(path = "/user/{id}")
	public HttpStatus deleteUserRole(@PathVariable Long id) {
		userRoleService.deleteUserRole(id);
		return HttpStatus.NO_CONTENT;
	}

	@GetMapping(path = "/user/{id}")
	public User getAllUserRoles(@PathVariable Long id) {
		return userRoleService.getById(id);
	}

	@GetMapping(path = "/userByName/{name}")
	public List<User> getUsereRoleByName(@PathVariable String name) {
		return userRoleService.findByName(name);
	}
*/
	/*
	 * @Autowired
	 * 
	 * @Qualifier("userRoleValidator") private Validator validator;
	 * 
	 * @InitBinder private void initBinder(WebDataBinder binder) {
	 * binder.setValidator(validator); }
	 * 
	 * @RequestMapping("createUserRole")
	 * 
	 * @ResponseBody public String createUserRole(@ModelAttribute UserRole
	 * userRole) { logger.info("Creating UserRole. Data: " + userRole); return
	 * "userRoleForm"; }
	 * 
	 * @RequestMapping("editUserRole")
	 * 
	 * @ResponseBody public UserRole editUserRole(@RequestParam long
	 * id, @ModelAttribute UserRole userRole) {
	 * logger.info("Updating the UserRole for the Id " + id); userRole =
	 * userRoleService.getUserRole(id); return userRole; }
	 * 
	 * @RequestMapping("saveUserRole")
	 * 
	 * @ResponseBody public String saveUserRole(Model model, @Validated UserRole
	 * userRole, BindingResult result) {
	 * logger.info("Saving the UserRole. Data : " + userRole); // if userRole id
	 * is 0 then creating the userRole other updating the // userRole String
	 * returnVal = "redirect:getAllUserRoles"; if (result.hasErrors()) { return
	 * "userRoleForm"; } else { if (userRole.getId() == 0) {
	 * userRoleService.createUserRole(userRole); } else {
	 * userRoleService.updateUserRole(userRole); } } return returnVal; }
	 * 
	 * @RequestMapping("deleteUserRole")
	 * 
	 * @ResponseBody public String deleteUserRole(@RequestParam long id) {
	 * logger.info("Deleting the UserRole. Id : " + id);
	 * userRoleService.deleteUserRole(id); return "redirect:getAllUserRoles"; }
	 * 
	 * @RequestMapping("getAllUserRoles")
	 * 
	 * @ResponseBody public List<UserRole> getAllUserRoles() {
	 * logger.info("Getting the all UserRoles."); List<UserRole> userRoleList =
	 * userRoleService.getAllUserRoles(); return userRoleList; }
	 * 
	 * @RequestMapping("searchUserRole")
	 * 
	 * @ResponseBody public List<UserRole>
	 * searchUserRole(@RequestParam("roleType") String roleType) {
	 * logger.info("Searching the UserRole. UserRole Names: " + roleType);
	 * List<UserRole> userRoleList = userRoleService.getAllUserRoles(roleType);
	 * return userRoleList; }
	 */
}
