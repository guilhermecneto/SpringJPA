package com.example.hrapigatewayzuul.service;

import java.util.List;

import com.example.hrapigatewayzuul.dto.AvaliacaoFisicaDTO;
import com.example.hrapigatewayzuul.dto.AvaliacaoFisicaUpdateDTO;
import com.example.hrapigatewayzuul.model.AvaliacaoFisica;

public interface AvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaDTO AvaliacaoFisica);
	AvaliacaoFisica get(Long id);
	List<AvaliacaoFisica> getAll();
	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO);
}
