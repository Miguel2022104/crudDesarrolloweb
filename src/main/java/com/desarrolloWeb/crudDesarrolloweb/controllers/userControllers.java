package com.desarrolloWeb.crudDesarrolloweb.controllers;

import com.desarrolloWeb.crudDesarrolloweb.dto.userDTO;
import com.desarrolloWeb.crudDesarrolloweb.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("7users")
@RestController
public class userControllers {
    @Autowired
    private userServices;

    public ResponseEntity<userDTO>;
