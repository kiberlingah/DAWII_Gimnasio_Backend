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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawii.GimnasioDAWII.Model.TipoDocumento;
import com.dawii.GimnasioDAWII.Service.TipoDocumentoService;

import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("/tipodocumento")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class TipoDocumentoController {
	
	@Autowired
	TipoDocumentoService tipdocService;
	
	@GetMapping
	public ResponseEntity<List<TipoDocumento>> list(){
		return  new ResponseEntity<>(tipdocService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<TipoDocumento> add(@RequestBody TipoDocumento tp) {
		return new ResponseEntity<>(tipdocService.add(tp), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") String id) {
		tipdocService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
