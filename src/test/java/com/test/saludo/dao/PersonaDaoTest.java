package com.test.saludo.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.saludo.dto.Persona;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
@SpringBootTest
public class PersonaDaoTest {

	@Autowired
	PersonaDao objPersonaDao = new PersonaDao();

	@Test
	public void savePersonaTest() {

		Persona objPersona = new Persona();

		objPersona.setApellidos("prueba prueba");
		objPersona.setNombres("pruebas pruebas");
		objPersona.setNacimineto(new Date());

		Persona test = objPersonaDao.savePersona(objPersona);

		assertNotNull(test);
		assertEquals(objPersona.getApellidos(), test.getApellidos());

	}

	@Test
	public void listarPersonasTest() {

		Persona objPersona = new Persona();

		objPersona.setApellidos("prueba prueba");
		objPersona.setNombres("pruebas pruebas");
		objPersona.setNacimineto(new Date());
		objPersonaDao.savePersona(objPersona);

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas = objPersonaDao.listarPersonas();
		assertNotNull(lstPersonas);

		Persona objPersonaLi = lstPersonas.get(0);

		assertEquals(objPersona.getApellidos(), objPersonaLi.getApellidos());
	}

}
