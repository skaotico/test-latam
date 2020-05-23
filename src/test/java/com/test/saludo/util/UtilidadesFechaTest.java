package com.test.saludo.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilidadesFechaTest {

	private UtilidadesFecha objUtilidadesFecha;

	/*
	 * test que valida que el calculo de edad sea correcto
	 */
	@Test
	public void calcularEdadTest() throws ParseException {

		/*
		 * al año 2020 son de 33 años
		 */
		String fechaTest = "1987-01-24";

		DateFormat objDateFormat = new SimpleDateFormat(Constantes.FORMATO_FECHA);

		Date objDateEdad = objDateFormat.parse(fechaTest);

		int edad = objUtilidadesFecha.calcularEdad(objDateEdad);

		assertNotNull(edad);
		assertTrue(edad == 33);

	}

	@Test
	public void isCumpleTest() throws ParseException {

		Date fechaActual = new Date();

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fechaActual);

		calendar.add(Calendar.DAY_OF_YEAR, -1);

		fechaActual = calendar.getTime();

		boolean iscumpleanos = objUtilidadesFecha.isCumple(fechaActual);

		assertNotNull(iscumpleanos);
		assertTrue(iscumpleanos);

	}

}
