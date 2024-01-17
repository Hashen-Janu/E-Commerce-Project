package com.januOfficial.ecoms.services.auth;

import com.januOfficial.ecoms.dto.SignupRequest;
import com.januOfficial.ecoms.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
