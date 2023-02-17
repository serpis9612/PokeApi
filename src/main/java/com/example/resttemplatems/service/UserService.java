package com.example.resttemplatems.service;

import com.example.resttemplatems.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Value("${sping.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;

    public List<UserDto> getUsers(){
        UserDto[] response = restTemplate.getForObject(basePath+"/isers",UserDto[].class);
        return Arrays.asList(response);
    }

    public void saveUser(UserDto use){

    }

    public void updateUser(Integer name, UserDto user){

    }

    public void  deleteUser(Integer name){

    }

}
