package com.example.hrapigatewayzuul.service;

import java.util.List;

import com.example.hrapigatewayzuul.dto.MatriculaDTO;
import com.example.hrapigatewayzuul.model.Matricula;

public interface MatriculaService {

	Matricula create(MatriculaDTO matricula);
	Matricula get(Long id);
	List<Matricula> getAll();
	void delete(Long id);
}
