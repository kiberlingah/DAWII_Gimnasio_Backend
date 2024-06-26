package com.dawii.GimnasioDAWII.Model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer pagoId;
	
	private LocalDate fechaPago;	
	private Double monto;	
	private Integer metodoPago;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="membresia_id",referencedColumnName = "membresiaId")
	private Membresia membresia;
}
