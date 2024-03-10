package com.dawii.GimnasioDAWII.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.Membresia;
import com.dawii.GimnasioDAWII.Repo.MembresiaRepo;
import com.dawii.GimnasioDAWII.Service.MembresiaService;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;

@Service
public class MembresiaServiceImpl implements MembresiaService {
	
	
	 @Autowired MembresiaRepo membresiaRepository;
	 
	 //crear membresia
	@Override
	public Membresia crearMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		return membresiaRepository.save(membresia);
	}
	
	//busqueda Miembro
		public List<BuscarMiembro> getBuscarMiembro(String nrodoc) {
			List<BuscarMiembro> list = membresiaRepository.getBuscarMiembro(nrodoc);
		    return list;
		}


}