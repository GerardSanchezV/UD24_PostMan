package UD_24.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import UD_24.dto.Trabajadores;

public interface ITrabajadorDAO  extends JpaRepository<Trabajadores, Long>{
	//Listar trabajadores or campo nombre
	public List<Trabajadores> findByNombre(String nombre);

}
