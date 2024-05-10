package com.dawii.GimnasioDAWII.Repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dawii.GimnasioDAWII.Model.User;

public interface UsuarioRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username); 
	
	@Modifying
    @Query("UPDATE User u SET u.nombre = :nombre, u.apellido = :apellido, u.email = :email, u.password = :password WHERE u.usuarioId = :usuarioId")
    void updateUser(@Param("usuarioId") Integer usuarioId, @Param("nombre") String nombre, @Param("apellido") String apellido, @Param("email") String email, @Param("password") String password);
}
