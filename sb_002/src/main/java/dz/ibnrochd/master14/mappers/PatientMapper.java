package dz.ibnrochd.master14.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;


@Mapper
public interface PatientMapper  {
	
	Patient findByNom(String nom);
	// TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)

	
	public List<Patient> findAll();
	public void insertPatient(Patient pat );
	public List<Consultation> selectConsultationsDuPatient (int nama);
}
