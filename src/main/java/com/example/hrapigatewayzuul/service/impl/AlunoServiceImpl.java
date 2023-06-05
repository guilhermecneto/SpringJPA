package com.example.hrapigatewayzuul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrapigatewayzuul.dto.AlunoDTO;
import com.example.hrapigatewayzuul.dto.AlunoUpdateDTO;
import com.example.hrapigatewayzuul.model.Aluno;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;
import com.example.hrapigatewayzuul.repository.AlunoRepository;
import com.example.hrapigatewayzuul.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	@Override
	public Aluno create(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno();
		aluno.setNome(alunoDTO.getNome());
		aluno.setCpf(alunoDTO.getCpf());
		aluno.setBairro(alunoDTO.getBairro());
		aluno.setDataDeNascimento(alunoDTO.getDataDeNascimento());
		
		return repository.save(aluno);
		
	}

	@Override
	public Aluno get(Long id) {
		return null;
	}

	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO) {
		return null;
	}

	@Override
	public void delete(Long id) {		
	}


	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno.getAvaliacoes();
		
	}
	
	

}
