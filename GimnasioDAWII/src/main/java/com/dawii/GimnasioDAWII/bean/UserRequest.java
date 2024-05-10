package com.dawii.GimnasioDAWII.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
	public int usuarioId;
    String username;
    String nombre;
    String apellido;
    String email;
    String password;
}
