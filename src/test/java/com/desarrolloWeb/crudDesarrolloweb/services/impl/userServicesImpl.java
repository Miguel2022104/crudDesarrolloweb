package com.desarrolloWeb.crudDesarrolloweb.services.impl;

import com.desarrolloWeb.crudDesarrolloweb.dao.UserDAO;
import com.desarrolloWeb.crudDesarrolloweb.dto.UserDTO;
import com.desarrolloWeb.crudDesarrolloweb.entity.UserEntity;
import com.desarrolloWeb.crudDesarrolloweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        UserEntity userEntity = UserEntity.builder()
                .idUser(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();
        return UserDAO.save(userDTO);

    }

    @Override
    public List<UserDTO> getUsers() {
        return List.of();
    }
}
