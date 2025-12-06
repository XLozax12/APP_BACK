package com.PLO.app.controller;

import com.PLO.app.model.Prueba;
import com.PLO.app.service.PruebaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pruebas")
public class PruebaController {

	private final PruebaService service;

	public PruebaController(PruebaService service) {
		this.service = service;
	}

	@GetMapping
	public List<Prueba> getAll() {
		return service.findAll();
	}
}
