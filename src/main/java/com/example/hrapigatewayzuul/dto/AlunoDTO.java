package com.example.hrapigatewayzuul.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.hrapigatewayzuul.model.AvaliacaoFisica;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AlunoDTO {

	private String nome;
	private String cpf;
	private String bairro;
	private LocalDate dataDeNascimento;
	
	public AlunoDTO() {
		
	}
	
	public AlunoDTO(Long id, String nome, String cpf, String bairro, LocalDate dataDeNascimento,
			AvaliacaoFisica avaliacaoFisica) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.bairro = bairro;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
}
