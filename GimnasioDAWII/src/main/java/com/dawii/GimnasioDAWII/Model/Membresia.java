package com.dawii.GimnasioDAWII.Model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="membresia")
public class Membresia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int membresiaId;    
    private LocalDate fechaInicio;       
    private LocalDate fechaVencimiento;   
    private Integer estado;
    
    @ManyToOne
	@JoinColumn(name="miembro_id",referencedColumnName = "miembroId")
    private Miembro miembros;
    
    @ManyToOne
	@JoinColumn(name="planes_id",referencedColumnName = "planesId")
    private Planes planes;
    
    @ManyToOne
	@JoinColumn(name="usuario_ID",referencedColumnName = "usuario_ID")
    private User usuarios;
    
    @JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "membresia", fetch = FetchType.LAZY)
	private Set<Pago> pagos;

    
    
}
