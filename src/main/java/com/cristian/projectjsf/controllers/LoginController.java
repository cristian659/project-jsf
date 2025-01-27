package com.cristian.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.cristian.projectjsf.dto.UsuarioDTO;

/**
 * @author cristian Clase que permite controlar el funcionamiento con la
 *         pantalla de login.xhtml
 */

@ManagedBean()
public class LoginController {
	/**
	 * usuario que ingresan en el login
	 */
	private String usuario;
	/**
	 * contraseña que ingresan en el login
	 */
	private String password;
	
	/**
	 * Bean que mantiene la informacion en session
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	


	/**
	 * Metodo que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario " + usuario);

		if (usuario.equals("cristian") && password.equals("12345")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (Exception e) {
				// TODO: handle exception
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
			}

		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario o Contraseña erroneos", ""));
		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

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
	
	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}


}
