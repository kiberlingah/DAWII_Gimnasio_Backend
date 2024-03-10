package com.dawii.GimnasioDAWII.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
	int id;
    String username;
    String password;
    String nombre;
    String apellido;
    String email;
}

