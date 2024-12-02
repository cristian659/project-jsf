/**
 * 
 */
package com.cristian.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.cristian.projectjsf.Entity.Empleado;
import com.cristian.projectjsf.services.EmpleadoService;


/**
 * @author velas Clase Controller que se encarga de procesar la informacion para
 *         la pantalla principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Lista de empleados filtrados
	 */
	private List<Empleado> empleadosFiltrados;
	/**
	 * Servicio que realiza la logica de empleados para la tabla
	 */
	private EmpleadoService empleadoService = new EmpleadoService();

	/**
	 * Metodo qque consulta la lista de empleado
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();

	}

	/**
	 *  Metodo se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
	
	

	
}
