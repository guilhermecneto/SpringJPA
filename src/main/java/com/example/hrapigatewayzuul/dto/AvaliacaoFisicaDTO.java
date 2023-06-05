package com.example.hrapigatewayzuul.dto;

import java.time.LocalDateTime;

import com.example.hrapigatewayzuul.model.Aluno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO {

	private Long alunoId;
	private double peso;
	private double altura;
	
	
	
	
	
}
