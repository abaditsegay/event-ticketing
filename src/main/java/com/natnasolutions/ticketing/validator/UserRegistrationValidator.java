package com.natnasolutions.ticketing.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.natnasolutions.ticketing.model.User;
import com.natnasolutions.ticketing.model.UserRole;
import com.natnasolutions.ticketing.service.UserService;
import com.natnasolutions.ticketing.util.TicketUtil;

@Component("userRegistrationValidator")
public class UserRegistrationValidator implements Validator {

	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> aClass) {
		return UserRole.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;

		if (user.getUsername().isEmpty() || user.getUsername() == null) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		} else if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
			errors.rejectValue("username", "user.username.size");
		} else if (userService.findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "user.username.duplicate");
		} else if (!TicketUtil.isValidEmailAddress(user.getUsername())) {
			errors.rejectValue("username", "user.username.email");
		}

		if (user.getPassword().isEmpty() || user.getPassword() == null) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		} else if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
			errors.rejectValue("password", "user.password.size");
		} else if (!user.getPasswordConfirm().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirm", "user.passwordConfirm.diff");
		}
	}
}
