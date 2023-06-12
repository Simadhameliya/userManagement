package com.user.UsersManagement.service;

import java.util.List;

import com.user.UsersManagement.Dto.UserDto;
import com.user.UsersManagement.Model.User;

public interface UserService {

	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
