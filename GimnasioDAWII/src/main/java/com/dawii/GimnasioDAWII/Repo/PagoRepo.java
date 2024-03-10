package com.dawii.GimnasioDAWII.Repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dawii.GimnasioDAWII.Model.Pago;

public interface PagoRepo extends JpaRepository<Pago, Integer> {

	Pago save(Set<Pago> pago);

}
