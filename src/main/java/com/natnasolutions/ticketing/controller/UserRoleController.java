package com.natnasolutions.ticketing.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.UniqueConstraint;
import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;
import com.natnasolutions.ticketing.service.UserRoleService;
import com.natnasolutions.ticketing.util.RecordAlreadyFoundException;

@RestController
public class UserRoleController {

	private static final Logger logger = LogManager.getLogger(UserRoleController.class);

	@Autowired
	private UserRoleService userRoleService;

	@GetMapping(path = "/userrole")
	public List<UserRole> getAll() {
		return userRoleService.getAllUserRoles();
	}

	@PostMapping(path = "/userrole")
	public HttpStatus insertUserRole(@RequestBody @Valid UserRole userRole) {
		return userRoleService.addUserRole(userRole) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@PutMapping(path = "/userrole")
	public HttpStatus updateUserRole(@RequestBody UserRole userRole) {
		return userRoleService.updateUserRole(userRole) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping(path = "/userrole/{id}")
	public HttpStatus deleteUserRole(@PathVariable Long id) {
		userRoleService.deleteUserRole(id);
		return HttpStatus.NO_CONTENT;
	}

	@GetMapping(path = "/userrole/{id}")
	public Optional<UserRole> getUserRole(@PathVariable Long id) {
		return userRoleService.getUserRole(id);
	}

	@GetMapping(path = "/userrole/{roletype}")
	public List<UserRole> getUsereRoleByType(@PathVariable String roletype) {
		return userRoleService.getUsereRoleByType(roletype);
	}

}
