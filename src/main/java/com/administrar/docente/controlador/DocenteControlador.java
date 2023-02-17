package com.administrar.docente.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.administrar.docente.excepciones.ResourceNotFoundException;
import com.administrar.docente.modelo.Docente;
import com.administrar.docente.repositorio.DocenteRepositorio;

@RestController
@RequestMapping("/administrar")
@CrossOrigin(origins = "http://localhost:4200") //Esto nos permite intercambiar los recursos entre backend y fronted
public class DocenteControlador {

	@Autowired
	private DocenteRepositorio repositorio;

	//Listar Docentes
	@GetMapping("/docente")
	public List<Docente> listarDocentes() {
		return repositorio.findAll();
	}
	
	//Guardar Docente
	@PostMapping("/docente")
	public Docente guardarDocente(@RequestBody Docente docente) {
		return repositorio.save(docente);
	}
    
	//Buscar Docente
	@GetMapping("/docente/{id}")
	public ResponseEntity<Docente> obtenerDocentePorId(@PathVariable Long id){
		Docente docente = repositorio.findById(id)
					            .orElseThrow(() -> new ResourceNotFoundException("No se encuentra registro : " + id));
			return ResponseEntity.ok(docente);
	}
	
	//Actualizar Docente
	@PutMapping("/docente/{id}")
	public ResponseEntity<Docente> actualizarDocente(@PathVariable Long id,@RequestBody Docente detallesDocente){
		Docente docente = repositorio.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No se encuentra registro : " + id));
		
		docente.setClave(detallesDocente.getClave());
		docente.setNombre(detallesDocente.getNombre());
		docente.setApellidos(detallesDocente.getApellidos());
		docente.setEmail(detallesDocente.getEmail());
		docente.setTelefono(detallesDocente.getTelefono());
		docente.setBlog(detallesDocente.getBlog());
		docente.setProfesional(detallesDocente.getProfesional());
		docente.setEscalaron(detallesDocente.getEscalaron());
		docente.setIdioma(detallesDocente.getIdioma());
		docente.setAnosExperiencia(detallesDocente.getAnosExperiencia());
		
	
		Docente docenteActualizado = repositorio.save(docente);
		return ResponseEntity.ok(docenteActualizado);
    }
	
	//Eliminar Docente
	@DeleteMapping("/docente/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarDocente(@PathVariable Long id){
		Docente docente = repositorio.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No se encuentra registro : " + id));
		
		repositorio.delete(docente);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
    }
}














