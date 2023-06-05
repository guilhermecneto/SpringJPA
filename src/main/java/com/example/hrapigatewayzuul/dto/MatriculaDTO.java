package com.example.hrapigatewayzuul.dto;

import java.time.LocalDateTime;

import com.example.hrapigatewayzuul.model.Aluno;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatriculaDTO {

	private Aluno aluno;
	private LocalDateTime dataDaMatricula;
	
	public MatriculaDTO() {
		
	}
	
	public MatriculaDTO(Long id, Aluno aluno, LocalDateTime dataDaMatricula) {
		super();
		this.aluno = aluno;
		this.dataDaMatricula = dataDaMatricula;
	}
	
	
	
}
