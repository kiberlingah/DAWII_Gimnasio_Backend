package com.dawii.GimnasioDAWII.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.Pago;
import com.dawii.GimnasioDAWII.Repo.PagoRepo;
import com.dawii.GimnasioDAWII.Service.PagoService;

@Service
public class PagoServiceImpl implements PagoService{
	@Autowired
	PagoRepo pagoRepository;

   
	@Override
    public Pago crearPago(Pago pago) {

        return pagoRepository.save(pago);
    }

}
