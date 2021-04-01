package com.juaracoding.ujiankeempat.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "nilai")

public class Nilai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_soal;
	private int nilai;
	
	  @ManyToOne
	  @JoinColumn(name="id_soal", nullable=false)
	  private Pertanyaan pertanyaan;
}
