package com.unicesumar.adsis4s2021.doZero.carro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarroSerive {

	@Autowired
	private CarroRepository repo;

	public List<Carro> obterTodos() {
		return repo.findAll();
	}

}
