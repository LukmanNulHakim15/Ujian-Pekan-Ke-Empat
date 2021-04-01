package com.juaracoding.ujiankeempat.main;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.ujiankeempat.main.entity.Admin;
import com.juaracoding.ujiankeempat.main.entity.Dosen;
import com.juaracoding.ujiankeempat.main.entity.Mahasiswa;
import com.juaracoding.ujiankeempat.main.entity.MataKuliah;
import com.juaracoding.ujiankeempat.main.entity.Nilai;
import com.juaracoding.ujiankeempat.main.entity.Pertanyaan;
import com.juaracoding.ujiankeempat.main.entity.PlotMataKuliah;
import com.juaracoding.ujiankeempat.main.entity.Soal;
import com.juaracoding.ujiankeempat.main.repository.AdminRepository;
import com.juaracoding.ujiankeempat.main.repository.MataKuliahRepository;
import com.juaracoding.ujiankeempat.main.repository.SoalRepository;

@SpringBootApplication
public class UjiankeEmpatApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UjiankeEmpatApplication.class, args);
	}

	
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	MataKuliahRepository matakuliahRepository;
	@Autowired
	SoalRepository soalRepository;
	
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Admin admin = new Admin ();
		admin.setUsername("buluk");
		admin.setPassword("12345");
		
		Dosen dosen1 = new Dosen();
		dosen1.setId_dosen(1);
		dosen1.setUsename("Paus");
		dosen1.setPassword("12345");
		dosen1.setNama_dosen("Banu");
		
		Mahasiswa mahasiswa1 = new Mahasiswa();
		mahasiswa1.setNim(2010);
		mahasiswa1.setNama_mahasiswa("Joy");
		mahasiswa1.setJenis_kelamin("Wanita");
		mahasiswa1.setPassword("12345");
		
		MataKuliah matakuliah1 = new MataKuliah ();
		matakuliah1.setId_mata_kuliah(0);
		matakuliah1.setNamamatakuliah("Kalkulus");
	
		admin.setDosen(dosen1);
		this.adminRepository.save(admin); 
		admin.setMahasiswa(mahasiswa1);
		this.adminRepository.save(admin); 
		admin.setMata_kuliah(matakuliah1);
		this.adminRepository.save(admin); 
		
	}
	
	public void run2(String... args) throws Exception {
		
		MataKuliah matakuliah = new MataKuliah();
		//matakuliah.setId_mata_kuliah(0);
		matakuliah.setNamamatakuliah("Biologi");
		
		Dosen dosen2 = new Dosen();
		dosen2.setUsename("Martabak");
		dosen2.setPassword("12345");
		dosen2.setNama_dosen("Dodi");
		
		Dosen dosen3 = new Dosen();
		dosen3.setUsename("Cucur");
		dosen3.setPassword("12345");
		dosen3.setNama_dosen("Laura");
		
	    List<Dosen> dosen = new ArrayList<Dosen>();
	    dosen.add(dosen2);
	    dosen.add(dosen3);
		
		matakuliah.setDosen(dosen);
		this.matakuliahRepository.save(matakuliah);
		
	}

	public void run3(String... args) throws Exception {
		
		Soal soal = new Soal();
		soal.setNama_soal("Ujian");
		soal.setStatus(1);
		
		PlotMataKuliah pmk = new PlotMataKuliah();
		//comment1.setText("Wuihh keren banget");
		
		//Comment comment2 = new Comment();
		//comment2.setText("Upload lagi dunk");
		
		Pertanyaan tanya = new Pertanyaan();
		tanya.setPertanyaan("Yooo");
		tanya.setJawaban_1("Oke");
		tanya.setJawaban_2("Boleh");
		tanya.setJawaban_3("Asik");	
		tanya.setJawaban_4("Geboy");
		tanya.setJawaban_benar("Yeah");
		tanya.setStatus_gambar(1);
		
		Pertanyaan tanya2 = new Pertanyaan();
		tanya2.setPertanyaan("Makan");
		tanya2.setJawaban_1("Oke");
		tanya2.setJawaban_2("Boleh");
		tanya2.setJawaban_3("Yeho");	
		tanya2.setJawaban_4("Lets");
		tanya2.setJawaban_benar("Kuy");
		tanya2.setStatus_gambar(0);
		
		Nilai nilai = new Nilai();
		nilai.setNilai(20);
		
		Nilai nilai2 = new Nilai();
		nilai2.setNilai(40);
		
		
		List<PlotMataKuliah> ListPmk = new ArrayList<PlotMataKuliah>();
		//lstComment.add(comment1);
		//lstComment.add(comment2);
		List<Pertanyaan> ListTanya = new ArrayList<Pertanyaan>();
		ListTanya.add(tanya);
		ListTanya.add(tanya);
		
		List<Nilai> ListNilai = new ArrayList<Nilai>();
		ListNilai.add(nilai);
		ListNilai.add(nilai2);
		
		
		soal.setListPlotMataKuliah(ListPmk);
		soal.setListPertanyaan(ListTanya);
		soal.setListNilai(ListNilai);
		
		this.soalRepository.save(soal); 
		
	}



}
