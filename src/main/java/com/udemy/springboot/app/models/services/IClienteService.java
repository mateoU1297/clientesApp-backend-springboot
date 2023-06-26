package com.udemy.springboot.app.models.services;

import java.util.List;

import com.udemy.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
