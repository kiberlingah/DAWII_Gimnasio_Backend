package com.dawii.GimnasioDAWII.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="tipo_documento")
public class TipoDocumento {
	
	@Id
	private String tipodocumentoId;
	private String descripcion;

}
