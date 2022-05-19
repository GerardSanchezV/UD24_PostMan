package UD_24.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD_24.dao.ITrabajadorDAO;
import UD_24.dto.Trabajadores;

@Service
public class TrabServiceImpl implements ITrabajadoresService {
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	@Override
	public List<Trabajadores> listarTrabajadores() {
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajadores guardarTrabajo(Trabajadores trabajador) {
		
		return iTrabajadorDAO.save(trabajador);
	}
	@Override
	public Trabajadores trabajadoresXID(Long id) {
		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajadores> listarTrabajadoresNombre(String nombre) {
		return iTrabajadorDAO.findByNombre(nombre);
	}

	@Override
	public Trabajadores actualizarTrabajador(Trabajadores trabajador) {
		return  iTrabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajadores(Long id) {
		iTrabajadorDAO.deleteById(id);
	}


}
