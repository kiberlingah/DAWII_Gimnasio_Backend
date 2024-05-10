package com.dawii.GimnasioDAWII.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawii.GimnasioDAWII.Model.User;
import com.dawii.GimnasioDAWII.Service.UsuarioService;
import com.dawii.GimnasioDAWII.bean.UserRequest;
import com.dawii.GimnasioDAWII.bean.UserResponse;
import com.dawii.GimnasioDAWII.dto.UsuarioDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping // Listar
    public ResponseEntity<List<User>> list() {
        List<User> usuarios = usuarioService.list();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping // Guardar
    public ResponseEntity<User> add(@RequestBody User usuario) {
    	User createdUsuario = usuarioService.add(usuario);
        return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);
    }

    @PutMapping // Actualizar
    public ResponseEntity<User> update(@RequestBody User usuario) {
    	User updatedUsuario = usuarioService.update(usuario);
        return new ResponseEntity<>(updatedUsuario, HttpStatus.OK);
    }

    @DeleteMapping("/{id}") // Eliminar
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
       usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping(value = "{id}")
    public ResponseEntity<UsuarioDTO> getUser(@PathVariable Integer id)
    {
        UsuarioDTO userDTO = usuarioService.getUser(id);
        if (userDTO==null)
        {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDTO);
    }

    /*@PutMapping()
    public ResponseEntity<UserResponse> updateUser(@RequestBody UserRequest userRequest)
    {
        return ResponseEntity.ok(usuarioService.updateUser(userRequest));
    }*/

}

