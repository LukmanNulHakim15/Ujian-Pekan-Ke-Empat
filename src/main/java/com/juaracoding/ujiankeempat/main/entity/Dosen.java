package com.juaracoding.ujiankeempat.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "dosen")

public class Dosen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_dosen;
	private String usename;
	private String password;
	private String nama_dosen;
	
	@ManyToMany(mappedBy="dosen")
	private List<Dosen> Listdosen= new ArrayList<Dosen>();

}
