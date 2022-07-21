package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.errors.NotFoundException;
import com.example.demo.models.Element;
import com.example.demo.models.ElementRepository;

@RestController
public class ElementsController {
	
	@Autowired
	private ElementRepository elementsRepo;
	
	@GetMapping("/elements/all")
	public List<Element> getElements() {
		List<Element> elements = elementsRepo.findAll();
		return elements;
	}
	
	@GetMapping("/elements/find-by-id/{id}")
	public Element getElementById(@PathVariable Integer id) {
		Optional<Element> element = elementsRepo.findById(id);
		if(element.isEmpty()) 
			throw new NotFoundException(String.format("No element found with id: %s", id));
		return element.get();
	}
	
	@GetMapping("/elements/find-by-group/{group}")
	public List<Element> getElementsByGroup(@PathVariable String group) {
		List<Element> elements = elementsRepo.findByGroup(group);
		return elements;
	}

}
