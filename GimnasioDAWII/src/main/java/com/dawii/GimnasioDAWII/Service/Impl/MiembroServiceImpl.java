package com.dawii.GimnasioDAWII.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.Miembro;
import com.dawii.GimnasioDAWII.Repo.MiembroRepo;
import com.dawii.GimnasioDAWII.Service.MiembroService;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;
import com.dawii.GimnasioDAWII.projections.ReportMembresia;


@Service
public class MiembroServiceImpl implements MiembroService{

	@Autowired
	MiembroRepo miembroRepo;
	
	@Override
	public List<Miembro> list() {
		// TODO Auto-generated method stub
		return miembroRepo.findAll();
	}

	@Override
	public Miembro add(Miembro m) {
		// TODO Auto-generated method stub
		return miembroRepo.save(m);
	}

	@Override
	public Miembro update(Miembro m) {
		// TODO Auto-generated method stub
		return miembroRepo.save(m);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		miembroRepo.deleteById(id);
	}
	
	
//report getBuscarMiembro
	public List<ReportMembresia> getReportMiembros(String nrodoc) {
		List<ReportMembresia> list = miembroRepo.getReportMiembros(nrodoc);
	    return list;
	}


}
