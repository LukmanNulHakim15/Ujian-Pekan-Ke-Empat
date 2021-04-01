package com.juaracoding.ujiankeempat.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "mataKuliah")

public class Admin {
	
	private String username;
	private String password;
	
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="dosen_detail_id")
	 private Dosen dosen;
	 
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="mahasiswa_detail_id")
	 private Mahasiswa mahasiswa;
	 
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="mata_kuliah_detail_id")
	 private MataKuliah mata_kuliah;



}
