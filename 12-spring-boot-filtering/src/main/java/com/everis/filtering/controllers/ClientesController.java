package com.everis.filtering.controllers;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.filtering.model.Cliente;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class ClientesController {

	@GetMapping("/cliente")
	public MappingJacksonValue consultar() {
		Cliente cliente = new Cliente(1, "Francisco","Pérez",25);
		//Filtro, o incluir o quitar propiedades en runtime.
		//serializeAllExcept vs filterOutAllExcept unos solo muestra un atraibuto y el otro muestra todo menos ese atributo
		
		SimpleBeanPropertyFilter filtro = SimpleBeanPropertyFilter.serializeAllExcept("nombre");
		FilterProvider filters = new SimpleFilterProvider().addFilter("ClienteModelFilter", filtro);
				
	    MappingJacksonValue mapping = new MappingJacksonValue(cliente);
		mapping.setFilters(filters);
		return mapping;
	}
}
