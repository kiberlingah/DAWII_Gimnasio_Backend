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
import com.dawii.GimnasioDAWII.Model.Planes;
import com.dawii.GimnasioDAWII.Service.PlanesService;
import com.dawii.GimnasioDAWII.projections.ReportPlanes;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/planes")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class PlanesController {
	
	@Autowired
	PlanesService planesService;
	
	@GetMapping
	public ResponseEntity<List<Planes>> list(){
		return  new ResponseEntity<>(planesService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Planes> add(@RequestBody Planes p) {
		return new ResponseEntity<>(planesService.add(p), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Planes> update(@RequestBody Planes p) {
		return new ResponseEntity<>(planesService.update(p), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		planesService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//report
		@GetMapping("/report-planes")
		public ResponseEntity<List<ReportPlanes>> getReportClass(@RequestParam("nombreplan") String nombreplan){
		    return new ResponseEntity<>(planesService.getReportPlanes(nombreplan), HttpStatus.OK);
		}

}
