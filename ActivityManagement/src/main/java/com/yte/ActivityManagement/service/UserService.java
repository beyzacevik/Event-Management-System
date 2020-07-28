package com.yte.ActivityManagement.service;

import com.yte.ActivityManagement.model.Users;
import com.yte.ActivityManagement.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Users save(UserRegistrationDto registrationDto);

}
