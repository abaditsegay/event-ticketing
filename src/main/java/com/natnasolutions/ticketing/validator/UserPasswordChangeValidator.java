package com.natnasolutions.ticketing.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ethionews.model.User;
import com.ethionews.service.UserService;
import com.ethionews.util.EthioUtil;

@Component("userPasswordChangeValidator")
public class UserPasswordChangeValidator implements Validator {

	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;

		if (user.getPasswordOld().isEmpty() || user.getPasswordOld() == null) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordOld", "NotEmpty");
		} else if (userService.findLoggedInUser().getPassword() != TicketUtil.passwordEncoder(user.getPasswordOld())) {
			errors.rejectValue("passwordOld", "user.passwordOld.wrong");
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
