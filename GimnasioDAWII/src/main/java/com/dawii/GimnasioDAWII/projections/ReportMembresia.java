package com.dawii.GimnasioDAWII.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportMembresia {
	
	private Integer miembroId;
	private String nombre;
	private String apellido;
	private String nombreplan;
	private Integer estado;

}
