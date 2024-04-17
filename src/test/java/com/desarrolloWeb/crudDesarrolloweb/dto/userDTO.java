package com.desarrolloWeb.crudDesarrolloweb.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private  Integer idUser;
    private  String name;
    private String email;
    private Date birthdate;

}
