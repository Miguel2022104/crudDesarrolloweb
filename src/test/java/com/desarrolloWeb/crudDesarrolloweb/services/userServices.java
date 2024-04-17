package com.desarrolloWeb.crudDesarrolloweb.services;

import com.desarrolloWeb.crudDesarrolloweb.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getUsers();
}
