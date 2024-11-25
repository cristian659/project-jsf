/**
 * 
 */
package com.cristian.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.cristian.projectjsf.Entity.Empleado;

/**
 * @author velas
 * Clase que permite realizar la logica del negocio para empleado
 */
public class EmpleadoService {
	/**
	 * metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados
	 */
public List<Empleado> consultarEmpleados() {
	
	//Generar lista de empleados a consultar
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	Empleado empleadoIBM = new Empleado();
	Empleado empleadoMicrosoft = new Empleado();
	Empleado empleadoApple = new Empleado();
	
	empleadoIBM.setNombre("Diego");
	empleadoIBM.setPrimerApellido("Paniagua");
	empleadoIBM.setSegundoApellido("Lopez");
	empleadoIBM.setEstatus(true);
	empleadoIBM.setPuesto("Senior Developer Java");
	
	empleadoMicrosoft.setNombre("Luis jesus");
	empleadoMicrosoft.setPrimerApellido("Lopez");
	empleadoMicrosoft.setSegundoApellido("Romero");
	empleadoMicrosoft.setEstatus(true);
	empleadoMicrosoft.setPuesto("CEO");
	
	empleadoApple.setNombre("Cristian David");
	empleadoApple.setPrimerApellido("velasco");
	empleadoApple.setSegundoApellido("Rubiano");
	empleadoApple.setEstatus(true);
	empleadoApple.setPuesto("Junior Developer Java");
	
	empleados.add(empleadoIBM);
	empleados.add(empleadoMicrosoft);
	empleados.add(empleadoApple);
	
	return empleados;
}
}
