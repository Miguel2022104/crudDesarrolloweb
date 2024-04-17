package com.desarrolloWeb.crudDesarrolloweb.services;
import com.desarrolloWeb.crudDesarrolloweb.dto.UserDTO;

public interface userServices {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getUsers();
}
