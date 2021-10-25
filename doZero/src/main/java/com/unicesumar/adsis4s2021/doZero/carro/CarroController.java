package com.unicesumar.adsis4s2021.doZero.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
	@Autowired
	private CarroSerive service;
	
	@GetMapping
	public List<Carro> obterTodos(){
		return service.obterTodos();
	}

}
