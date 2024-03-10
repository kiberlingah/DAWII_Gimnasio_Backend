package com.dawii.GimnasioDAWII.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dawii.GimnasioDAWII.Model.Membresia;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;

public interface MembresiaRepo extends JpaRepository<Membresia, Integer> {
	@Query("SELECT new com.dawii.GimnasioDAWII.projections.BuscarMiembro("
	        + "miembroId, "
	        + "nombre, "
	        + "apellido) "
	        + "FROM Miembro "
	        + "WHERE nrodoc = :nrodoc")
	public List<BuscarMiembro> getBuscarMiembro(@Param("nrodoc") String nrodoc);

}
