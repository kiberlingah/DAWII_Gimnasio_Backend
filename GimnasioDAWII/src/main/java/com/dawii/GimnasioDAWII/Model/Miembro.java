package com.dawii.GimnasioDAWII.Model;

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
@Table(name="miembro")

public class Miembro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int miembroId;
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private String nrodoc;
	private String razonsocial;
	private String correoelectronico;
	private String celular;
	
	@ManyToOne
	@JoinColumn(name="tipodocumento_id",referencedColumnName = "tipodocumentoId")
	private TipoDocumento tipodocumento;

}
