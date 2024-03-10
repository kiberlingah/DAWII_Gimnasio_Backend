package com.dawii.GimnasioDAWII.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name="planes")
public class Planes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planesId;
	
	private String nombreplan;
	private String tiempo;
	private String diaMes;
	private double precio;
}
