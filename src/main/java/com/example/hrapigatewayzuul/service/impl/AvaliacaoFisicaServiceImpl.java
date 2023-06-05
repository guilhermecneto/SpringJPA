package com.example.hrapigatewayzuul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrapigatewayzuul.dto.AvaliacaoFisicaDTO;
import com.example.hrapigatewayzuul.dto.AvaliacaoFisicaUpdateDTO;
import com.example.hrapigatewayzuul.model.Aluno;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;
import com.example.hrapigatewayzuul.repository.AlunoRepository;
import com.example.hrapigatewayzuul.repository.AvaliacaoFisicaRepository;
import com.example.hrapigatewayzuul.service.AvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService{

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(avaliacaoFisicaDTO.getAlunoId()).get();
		
		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(avaliacaoFisicaDTO.getPeso());
		avaliacaoFisica.setAltura(avaliacaoFisicaDTO.getAltura());
		
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
