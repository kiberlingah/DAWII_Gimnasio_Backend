package com.dawii.GimnasioDAWII.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dawii.GimnasioDAWII.Model.Miembro;
import com.dawii.GimnasioDAWII.Service.MiembroService;
import com.dawii.GimnasioDAWII.projections.BuscarMiembro;
import com.dawii.GimnasioDAWII.projections.ReportMembresia;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/miembro")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class MiembroController {
	
	@Autowired
	MiembroService miembroService;
	
	@GetMapping
	public ResponseEntity<List<Miembro>> list(){
		return  new ResponseEntity<>(miembroService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Miembro> add(@RequestBody Miembro m) {
		return new ResponseEntity<>(miembroService.add(m), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Miembro> update(@RequestBody Miembro m) {
		return new ResponseEntity<>(miembroService.update(m), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		miembroService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	//report
	
		@GetMapping("/report-miembros")
		public ResponseEntity<List<ReportMembresia>> getReportClass(@RequestParam("nrodoc") String nrodoc){
		    return new ResponseEntity<>(miembroService.getReportMiembros(nrodoc), HttpStatus.OK);
		}
		
}
