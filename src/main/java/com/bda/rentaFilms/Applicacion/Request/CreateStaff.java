package com.bda.rentaFilms.Applicacion.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStaff {
    private String firstName;

    private String lastName;
    private long storeId;

    private long address;



    private String email;

    private long active;

    private String username;
    private String password;

}
