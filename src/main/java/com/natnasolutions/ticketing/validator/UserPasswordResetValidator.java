package com.natnasolutions.ticketing.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ethionews.model.User;
import com.ethionews.service.UserService;
import com.ethionews.util.EthioUtil;

@Component("userPasswordResetValidator")
public class UserPasswordResetValidator implements Validator {

	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");

		if (!TicketUtil.isValidEmailAddress(user.getUsername())) {
			errors.rejectValue("username", "user.username.email");
		}

		if (userService.findByUsername(user.getUsername()) == null) {
			errors.rejectValue("username", "user.username.emailNotExist");
		}

	}
}
