package UD_24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD_24.dto.Trabajadores;
import UD_24.service.TrabServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadoresController {
	
	@Autowired
	TrabServiceImpl trabServideImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajadores> listarTrabajadores(){
		return trabServideImpl.listarTrabajadores();
	}
	
	
	@PostMapping("/trabajadores")
	public Trabajadores salvarTrabajadores(@RequestBody Trabajadores trabajador) {
		
		return trabServideImpl.guardarTrabajo(trabajador);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajadores trabajadorXID(@PathVariable(name="id") Long id) {
		
		Trabajadores trabajador_xid= new Trabajadores();
		
		trabajador_xid=trabServideImpl.trabajadoresXID(id);
		
		System.out.println("TrabajadoresXID: "+trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajadores actualizarTrabajadores(@PathVariable(name="id")Long id,@RequestBody Trabajadores trabajador) {
		
		Trabajadores trabajador_seleccionado= new Trabajadores();
		Trabajadores trabajador_actualizado= new Trabajadores();
		
		trabajador_seleccionado= trabServideImpl.trabajadoresXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.salarioTrabajo(trabajador.getTrabajo());
		trabajador_seleccionado.setSalario(trabajador.getSalario());
	
		
		trabajador_actualizado = trabServideImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("el trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajadores(@PathVariable(name="id")Long id) {
		trabServideImpl.eliminarTrabajadores(id);
	}
	
	
}