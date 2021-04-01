package com.juaracoding.ujiankeempat.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "mataKuliah")

public class MataKuliah {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_mata_kuliah;
	private String namamatakuliah;
	
	@ManyToMany
	@JoinTable (
			name = "PlotMataKuliah",
			joinColumns=@JoinColumn(name="id_mata_kuliah", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="id_dosen", referencedColumnName="id"))
	private List<Dosen> dosen = new ArrayList<Dosen>();
	
	@ManyToMany
	@JoinTable (
			name = "PlotMataKuliah",
			joinColumns=@JoinColumn(name="id_mata_kuliah", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="nim", referencedColumnName="id"))
	private List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

}
