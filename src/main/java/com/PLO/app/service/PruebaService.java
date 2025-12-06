package com.PLO.app.service;

import com.PLO.app.model.Prueba;
import com.PLO.app.repository.PruebaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PruebaService {

	private final PruebaRepository repository;

	public PruebaService(PruebaRepository repository) {
		this.repository = repository;
	}

	public List<Prueba> findAll() {
		return repository.findAll();
	}

}
