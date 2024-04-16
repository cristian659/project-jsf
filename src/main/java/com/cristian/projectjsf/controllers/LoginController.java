package com.cristian.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginController {
private String usuario; 
private String password;

public void ingresar() {
	System.out.println("usuario : " + usuario + password);
	
	if(usuario.equals("cristian") && password.equals("1234")) {
		try {
			this.redireccionar("principal.xhtml");
		} catch (IOException e) {
			FacesContext.getCurrentInstance().addMessage("fomLogin: txtusuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "la pagina no existe", ""));
			
		}
		FacesContext.getCurrentInstance().addMessage("fomLogin: txtusuario", new FacesMessage(FacesMessage.SEVERITY_INFO, "usuario correcto", ""));
		
	}else {
		FacesContext.getCurrentInstance().addMessage("fomLogin: txtusuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuario y/o contraseña incorrecto", ""));
	}
}

private void redireccionar(String pagina) throws IOException {
	ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	ec.redirect(pagina);
}

public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
