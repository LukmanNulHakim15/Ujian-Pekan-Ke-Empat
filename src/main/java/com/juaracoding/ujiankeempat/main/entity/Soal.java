package com.juaracoding.ujiankeempat.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "soal")
public class Soal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_soal;
	private int id_plot_mk;
	private String nama_soal;
	private int status;
	
	  @ManyToOne
	  @JoinColumn(name="id_plot_mk", nullable=false)
	  private PlotMataKuliah plot_mata_kuliah;

	
	

	

	public void setListPlotMataKuliah(List<PlotMataKuliah> listPmk) {
		// TODO Auto-generated method stub
		
	}

	public void setListPertanyaan(List<Pertanyaan> listTanya) {
		// TODO Auto-generated method stub
		
	}

	public void setListNilai(List<Nilai> listNilai) {
		// TODO Auto-generated method stub
		
	}
}
