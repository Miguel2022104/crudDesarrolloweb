package com.desarrolloWeb.crudDesarrolloweb.dao;


import com.desarrolloWeb.crudDesarrolloweb.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {

}
