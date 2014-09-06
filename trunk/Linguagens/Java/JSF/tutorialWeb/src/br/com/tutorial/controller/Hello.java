package br.com.tutorial.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Hello {

	private void init() {
		System.out.println(" Bean executado!");

	}

	public String getMessage() {
		return "Hello World JSF!";
	}
	

}
