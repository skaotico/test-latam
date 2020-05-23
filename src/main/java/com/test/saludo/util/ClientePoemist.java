package com.test.saludo.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.client.RestTemplate;

import com.test.saludo.dto.Poema;

public class ClientePoemist {

	/*
	 *
	 * 
	 * http://chuwiki.chuidiang.org/index.php?title=Cliente_Rest_con_Spring
	 */
	public static Poema generarPoema() {

		RestTemplate restTemplate = new RestTemplate();

		Poema[] lstPoemas = restTemplate.getForObject(Constantes.URL, Poema[].class);

		Random r = new Random();

		return lstPoemas[r.nextInt(lstPoemas.length)];
	}

	public static List<Poema> generarListaPoema() {
		RestTemplate restTemplate = new RestTemplate();

		Poema[] lstPoemas = restTemplate.getForObject(Constantes.URL, Poema[].class);

		return Arrays.asList(lstPoemas);
	}
}
