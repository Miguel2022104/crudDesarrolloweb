package com.desarrolloWeb.crudDesarrolloweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

public class userEntity implements Serializable {
    @Id
    @Column(name = "id_user")

    private  Integer idUser;

    private  String name;

    private String email;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
}
