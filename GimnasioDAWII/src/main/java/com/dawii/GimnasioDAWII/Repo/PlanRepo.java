package com.dawii.GimnasioDAWII.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dawii.GimnasioDAWII.Model.Planes;
import com.dawii.GimnasioDAWII.projections.ReportPlanes;

public interface PlanRepo extends JpaRepository<Planes, Integer>{
	@Query("SELECT new com.dawii.GimnasioDAWII.projections.ReportPlanes(p.planesId, p.nombreplan, p.tiempo, p.diaMes, p.precio) "
            + "FROM Planes p "
            + "WHERE p.nombreplan = :nombreplan")
public List<ReportPlanes> getReportPlanes(@Param("nombreplan") String nombreplan);

}
