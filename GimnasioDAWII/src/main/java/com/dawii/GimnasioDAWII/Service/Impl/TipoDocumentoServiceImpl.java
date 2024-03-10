package com.dawii.GimnasioDAWII.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.GimnasioDAWII.Model.TipoDocumento;
import com.dawii.GimnasioDAWII.Repo.TipoDocumentoRepo;
import com.dawii.GimnasioDAWII.Service.TipoDocumentoService;


@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService{

	@Autowired
	TipoDocumentoRepo tipodocRepo;
	
	
	@Override
	public List<TipoDocumento> list() {
		// TODO Auto-generated method stub
		return tipodocRepo.findAll();
	}

	@Override
	public TipoDocumento add(TipoDocumento td) {
		// TODO Auto-generated method stub
		return tipodocRepo.save(td);
	}

	@Override
	public TipoDocumento update(TipoDocumento td) {
		// TODO Auto-generated method stub
		return tipodocRepo.save(td);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		tipodocRepo.deleteById(id);
	}

}
