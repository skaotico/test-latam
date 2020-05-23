package com.test.saludo.util;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.saludo.dto.Poema;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientePoemistTest {

	@Test
	public void generarPoemaTest() {
		Poema objPoema = new Poema();
		objPoema = ClientePoemist.generarPoema();
		assertNotNull(objPoema);

	}
	
	
	
}
