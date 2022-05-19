package UD_24.service;

import java.util.List;

import UD_24.dto.Trabajadores;

public interface ITrabajadoresService {
	
	//Lista de Trabajadores
	public List<Trabajadores> listarTrabajadores();
	
	//Guardar
	public Trabajadores guardarTrabajo(Trabajadores trabajador);
	
	//Leer
	public Trabajadores trabajadoresXID(Long id);
	
	//List Trabajadores campo nombre
	public List <Trabajadores>listarTrabajadoresNombre (String nombre);
	
	//Actualizar datos del trabajador UPDATE
	public Trabajadores actualizarTrabajador(Trabajadores trabajador);
	
	//Elimina el trabajador DELETE
	public void eliminarTrabajadores(Long id);
	

}
