package com.dawii.GimnasioDAWII.Service;



import java.util.List;

import com.dawii.GimnasioDAWII.Model.Membresia;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;


public interface MembresiaService {
	//crear membresia
	public Membresia crearMembresia(Membresia membresia);
	
	List<BuscarMiembro> getBuscarMiembro(String nrodoc);

}
