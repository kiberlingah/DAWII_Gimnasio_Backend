package com.dawii.GimnasioDAWII.Service;

import java.util.List;

import com.dawii.GimnasioDAWII.Model.TipoDocumento;


public interface TipoDocumentoService {
	public List<TipoDocumento> list();
	public TipoDocumento add(TipoDocumento td);
	public TipoDocumento update(TipoDocumento td);
	public void delete(String id);
}
