package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		// Este método sirve para ver las variables de entorno
		// Key: Clave (nombre de la variable)
		// Value: Valor (nombre de la carpeta/ruta de la carpeta)
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
