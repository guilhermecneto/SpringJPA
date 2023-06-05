package com.example.hrapigatewayzuul.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.hrapigatewayzuul.dto.AlunoDTO;
import com.example.hrapigatewayzuul.dto.AlunoUpdateDTO;
import com.example.hrapigatewayzuul.model.Aluno;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;

public interface AlunoService {

	Aluno create(AlunoDTO aluno);
	Aluno get(Long id);
	List<Aluno> getAll();
	Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO);
	void delete(Long id);
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
