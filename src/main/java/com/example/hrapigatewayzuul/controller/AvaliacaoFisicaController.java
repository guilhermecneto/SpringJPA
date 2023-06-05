package com.example.hrapigatewayzuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrapigatewayzuul.dto.AvaliacaoFisicaDTO;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;
import com.example.hrapigatewayzuul.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
	
	@Autowired
	private AvaliacaoFisicaServiceImpl service;
	
	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO){
		
		
		return service.create(avaliacaoFisicaDTO);
	}
}
