package com.dawii.GimnasioDAWII.Service;

import java.util.List;
import com.dawii.GimnasioDAWII.Model.Planes;
import com.dawii.GimnasioDAWII.projections.ReportPlanes;

public interface PlanesService {
	
	public List<Planes> list();
	public Planes add(Planes p);
	public Planes update(Planes p);
	public void delete(int id);

	List<ReportPlanes> getReportPlanes(String nombreplan);
}
