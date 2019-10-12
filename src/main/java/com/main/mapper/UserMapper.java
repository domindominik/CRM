package com.main.mapper;

import com.main.dto.UserDto;
import com.main.model.UserModel;

public class UserMapper
{
    public static UserDto toDto(UserModel userModel)
    {
        UserDto userDto = new UserDto();
        userDto.setName(userModel.getName());
        userDto.setSurname(userModel.getSurname());
        userDto.setEmail(userModel.getEmail());
        userDto.setPassword(userModel.getPassword());
        userDto.setType(userModel.getType().getId());
        return userDto;
    }

    public static UserModel toEntity(UserDto userDto)
    {
        UserModel userModel = new UserModel();
        userModel.setName(userDto.getName());
        userModel.setSurname(userDto.getSurname());
        userModel.setEmail(userDto.getEmail());
        userModel.setPassword(userDto.getPassword());
        userModel.setType(userDto.getType());
        return userModel;
    }
}
