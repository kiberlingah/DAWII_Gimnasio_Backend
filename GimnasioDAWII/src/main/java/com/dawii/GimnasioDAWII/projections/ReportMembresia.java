package com.dawii.GimnasioDAWII.projections;

import java.time.LocalDate;

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
	private LocalDate fechaInicio;       
    private LocalDate fechaVencimiento; 
	private Integer estado;

}
