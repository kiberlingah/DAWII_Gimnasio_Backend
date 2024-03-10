package com.dawii.GimnasioDAWII.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dawii.GimnasioDAWII.Model.Membresia;
import com.dawii.GimnasioDAWII.Model.Pago;
import com.dawii.GimnasioDAWII.Service.MembresiaService;
import com.dawii.GimnasioDAWII.Service.PagoService;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ventamenbresia")
@RequiredArgsConstructor
@CrossOrigin(origins = { "http://localhost:4200" })
public class VentaMembresiaController {

	@Autowired
	MembresiaService membresiaService;

	@Autowired
	PagoService pagoService;

	@PostMapping
	public ResponseEntity<String> crearMembresiaYPago(@RequestBody Membresia membresia) {
		try {
			Membresia nuevaMembresia = membresiaService.crearMembresia(membresia);
			int membresiaId = nuevaMembresia.getMembresiaId();

			Pago pago = membresia.getPagos().iterator().next();
			pago.setMembresia(nuevaMembresia);

			pagoService.crearPago(pago);

			return new ResponseEntity<>("Membresía y pago creados exitosamente con ID de membresía: " + membresiaId,
					HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al crear membresía y pago: " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/buscarmiembrobynrodoc")
	public ResponseEntity<List<BuscarMiembro>> getBuscarMiembroDoc(@RequestParam("nrodoc") String nrodoc) {
		return new ResponseEntity<>(membresiaService.getBuscarMiembro(nrodoc), HttpStatus.OK);
	}

}
