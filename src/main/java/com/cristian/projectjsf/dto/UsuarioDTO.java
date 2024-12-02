/**
 * 
 */
package com.cristian.projectjsf.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.cristian.projectjsf.controllers.SessionController;

/**
 * @author velas
 *Clase que permitira contener la informacion del usuario en sesion
 */
@ManagedBean
public class UsuarioDTO {
	
	private String usuario;
	
	private String password; 
	
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	
	


	

}
