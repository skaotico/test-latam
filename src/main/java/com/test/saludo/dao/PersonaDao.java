package com.test.saludo.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.saludo.api.SaludoApi;
import com.test.saludo.dto.Persona;
import com.test.saludo.repo.PersonaRepo;
import com.test.saludo.util.ClientePoemist;
import com.test.saludo.util.UtilidadesFecha;

@Service
public class PersonaDao {

	private static Logger LOGGER = LoggerFactory.getLogger(PersonaDao.class);

	@Autowired
	private PersonaRepo objPersonaRepo;

	public Persona savePersona(Persona personaEntrada) {

		try {
			personaEntrada.setEdad(UtilidadesFecha.calcularEdad(personaEntrada.getNacimineto()));
			if (UtilidadesFecha.isCumple(personaEntrada.getNacimineto())) {
				personaEntrada.setFelicitacion(ClientePoemist.generarPoema().getContent());
			}
			objPersonaRepo.save(personaEntrada);

			return personaEntrada;
		} catch (Exception e) {
			LOGGER.error("error al [savePersona]. causado por " + e);
			return null;
		}

	}

	public List<Persona> listarPersonas() {
		try {
			return objPersonaRepo.findAll();

		} catch (Exception e) {
			LOGGER.error("error al [listarPersonas]. causado por " + e);
			return null;
		}
	}

}
