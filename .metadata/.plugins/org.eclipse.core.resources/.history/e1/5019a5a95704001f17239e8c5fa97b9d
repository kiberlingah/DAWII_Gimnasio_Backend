package com.dawii.GimnasioDAWII.Repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dawii.GimnasioDAWII.Model.User;

public interface UsuarioRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username); 
	
	/*@Modifying()
    @Query("update user u set u.nombre=:nombre, u.apellido=:apellido where u.usuario_id = :id")
    void updateUser(@Param(value = "id") Integer id,   @Param(value = "nombre") String nombre, @Param(value = "apellido") String apellido );*/
}
