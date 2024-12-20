package com.health.patient.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.models.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	public List<Patient> findBySexe(String sexe);
	public List<Patient> findByAgeBetween(int min,int max);
	

}
