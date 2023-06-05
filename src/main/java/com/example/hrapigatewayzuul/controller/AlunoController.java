package com.example.hrapigatewayzuul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrapigatewayzuul.dto.AlunoDTO;
import com.example.hrapigatewayzuul.model.Aluno;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;
import com.example.hrapigatewayzuul.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl service;
	
	@GetMapping
	public List<Aluno> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public Aluno create(@RequestBody AlunoDTO aluno) {
		return service.create(aluno);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaId(id);
	}
	
	

}
