package com.natnasolutions.ticketing.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.natnasolutions.ticketing.models.User;

@Component("userRoleValidator")
public class UserRoleValidator implements Validator {

	@Override
	public boolean supports(Class<?> paramClass) {
		return User.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "roleType", "userRole.roleType");

	}
}
