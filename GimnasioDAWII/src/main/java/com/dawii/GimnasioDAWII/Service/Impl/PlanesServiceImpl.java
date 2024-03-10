package com.dawii.GimnasioDAWII.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.Planes;
import com.dawii.GimnasioDAWII.Repo.PlanRepo;
import com.dawii.GimnasioDAWII.Service.PlanesService;
import com.dawii.GimnasioDAWII.projections.ReportPlanes;

@Service
public class PlanesServiceImpl implements PlanesService{

	@Autowired
	PlanRepo planesRepo;
	
	@Override
	public List<Planes> list() {
		// TODO Auto-generated method stub
		return planesRepo.findAll();
	}

	@Override
	public Planes add(Planes p) {
		// TODO Auto-generated method stub
		return planesRepo.save(p);
	}

	@Override
	public Planes update(Planes p) {
		// TODO Auto-generated method stub
		return planesRepo.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		planesRepo.deleteById(id);
	}
	
	public List<ReportPlanes> getReportPlanes(String nombreplan) {
		List<ReportPlanes> list = planesRepo.getReportPlanes(nombreplan);
		return list;
	}

}
