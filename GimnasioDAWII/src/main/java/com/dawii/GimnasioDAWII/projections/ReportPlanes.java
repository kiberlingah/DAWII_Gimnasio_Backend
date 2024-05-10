package com.dawii.GimnasioDAWII.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportPlanes {
	
	private Integer planesId;
	private String nombreplan;
	private Integer tiempo;
	private Double precio;
	private String url_img;

}
