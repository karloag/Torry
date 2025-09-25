package com.javarevolutions.ws.service;

import com.javarevolutions.ws.bean.BeanLogin;

public class ImpLogin implements IfaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {
		BeanLogin bean=new BeanLogin();
		if(obj.getUsuario().equals("Sirios")&& obj.getPassword().equals("rios")) {
			bean.setMensaje("Usuario Correcto...");
			bean.setStatus(true);	
		} else {
			bean.setMensaje("El usuaio no se encontro...");
			bean.setStatus(false);
		}
		return bean;
	}

	

	
	
}

