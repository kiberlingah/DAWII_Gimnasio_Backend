package com.dawii.GimnasioDAWII.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.Rol;
import com.dawii.GimnasioDAWII.Model.User;
import com.dawii.GimnasioDAWII.Repo.UsuarioRepository;
import com.dawii.GimnasioDAWII.Service.UsuarioService;
import com.dawii.GimnasioDAWII.bean.UserRequest;
import com.dawii.GimnasioDAWII.bean.UserResponse;
import com.dawii.GimnasioDAWII.dto.UsuarioDTO;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepo;
	
	@Override
	public List<User> list() {
		return usuarioRepo.findAll();

	}

	@Override
	public User add(User u) {
		return usuarioRepo.save(u);

	}

	@Override
	public User update(User u) {
		return usuarioRepo.save(u);

	}

	@Override
	public void delete(int id) {
		usuarioRepo.deleteById(id);		

	}
	
	/*@Override
	@Transactional
    public UserResponse updateUser(UserRequest userRequest) {
       
		User user = User.builder()
        .usuarioId(userRequest.id)
        .nombre(userRequest.getNombre())
        .apellido(userRequest.getApellido())
        .rol(Rol.USER)
        .build();
        
        usuarioRepo.updateUser(user.usuarioId, user.nombre, user.apellido);

        return new UserResponse("El usuario se registró satisfactoriamente");
    }*/

	@Override
    public UsuarioDTO getUser(Integer id) {
		User user= usuarioRepo.findById(id).orElse(null);
       
        if (user!=null)
        {
            UsuarioDTO userDTO = UsuarioDTO.builder()
            .usuarioId(user.usuarioId)
            .nombre(user.nombre)
            .apellido(user.apellido)
            .build();
            return userDTO;
        }
        return null;
    }

}
