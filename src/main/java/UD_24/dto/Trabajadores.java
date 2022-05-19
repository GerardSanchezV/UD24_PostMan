package UD_24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trabajadores")//en caso que la tabala sea diferente
public class Trabajadores {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "puesto")
	private String trabajo;
	@Column(name = "salario")
	private double salario;
	
	
	//Constructores
	/**
	 * 
	 */
	public Trabajadores(Long id, String nombre, Trabajos trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo.toString();
		this.salario = salarioTrabajo(trabajo.toString());
	}
		


	public Trabajadores() {
		// TODO Auto-generated constructor stub
	}


	public double salarioTrabajo(String trabajo) {
		double salario = 0.0;
		
		switch (trabajo) {
		case "Comercial":
			salario = 2234;
			break;
		case "Electricista":
			salario = 1580;
			break;
		case "Programador":
			salario = 1280;
			break;
		case "Marketing":
			salario = 3234;
			break;
		case "Mecanico":
			salario = 2234;
			break;
		
			
		}
		
		return salario;
	
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String puesto, String trabajo) {
		this.trabajo = trabajo;
		setSalario(this.salarioTrabajo(trabajo));
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo +", salario=" + salario + "]";
	}

	

	
	
	
	
	
}