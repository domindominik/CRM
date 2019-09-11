package com.main.services;

import com.main.dto.UserDto;
import com.main.model.UserModel;
import com.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static com.main.mapper.UserMapper.toEntity;

@Service
public class UserServices
{
    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<UserModel> getAll()
    {
        return this.userRepository.findAll();
    }

    @Transactional
    public UserModel getById(Long id)
    {
        return this.userRepository.findById(id).get();
    }

    @Transactional
    public void addUser(UserDto userDto)
    {
        this.userRepository.save(toEntity(userDto));
    }

    @Transactional
    public void deleteById(Long id)
    {
        this.userRepository.deleteById(id);
    }
}
