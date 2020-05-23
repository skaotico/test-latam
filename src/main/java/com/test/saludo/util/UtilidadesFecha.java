package com.test.saludo.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilidadesFecha {

	private static Logger LOGGER = LoggerFactory.getLogger(UtilidadesFecha.class);

	public static int calcularEdad(Date fecha) {

		LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		Period p = Period.between(LocalDate.of(year, month, day), LocalDate.now());

		return p.getYears();
	}

	public static boolean isCumple(Date fechaNacimiento) {

		try {

			Date fechaActual = new Date();
			LocalDate localDate = fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate localDateNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			return localDate.getMonthValue() == localDateNac.getMonthValue()
					& localDate.getDayOfMonth() == localDateNac.getDayOfMonth() + 1;

		} catch (Exception e) {
			LOGGER.error("error al ejecutar [isCumple], causado por ", e);
			return false;
		}

	}

	public static String calcularEdadCompleta(Date fecha) {

		LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		Period p = Period.between(LocalDate.of(year, month, day), LocalDate.now());

		return p.getYears() + " años " + p.getMonths() + " meses " + p.getDays() + " días";
	}

}
