package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.Clientes;

@CrossOrigin(origins = "https://aw-vendas.herokuapp.com")
@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping
	public List<Cliente> listar(){
		return clientes.findAll();
	}

}
