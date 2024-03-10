package com.dawii.GimnasioDAWII.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuscarMiembro {
	private Integer miembroId;
	private String nombre;
	private String apellido;	
}
