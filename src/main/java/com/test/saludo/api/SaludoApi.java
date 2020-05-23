package com.test.saludo.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.saludo.dao.PersonaDao;
import com.test.saludo.dto.Persona;

@RestController
@RequestMapping("/api/persona")
public class SaludoApi {

	@Autowired
	PersonaDao objPersonaDTO;

	private static Logger LOGGER = LoggerFactory.getLogger(SaludoApi.class);

	/*
	 * servicio encargado de almacenar las personas ingresadas
	 */
	@RequestMapping(value = "/saludo", method = RequestMethod.POST)
	public ResponseEntity<?> getById(@RequestBody Persona persona) {

		Persona objPersona = new Persona();
		try {

			LOGGER.debug("persona ingreso " + persona.toString());

			objPersona = objPersonaDTO.savePersona(persona);

		} catch (Exception ex) {
			LOGGER.error("error al ejecutar el servicio " + ex);
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Persona>(objPersona, HttpStatus.CREATED);
	}

	
	/*
	 * 
	 */
	@RequestMapping(value = "/ListSaludo", method = RequestMethod.GET)
	public ResponseEntity<?> getById() {

		List<Persona> lstPersonas;

		try {

			lstPersonas = objPersonaDTO.listarPersonas();

		} catch (Exception ex) {
			LOGGER.error("error al ejecutar el servicio " + ex);
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Persona>>(lstPersonas, HttpStatus.CREATED);
	}

}
