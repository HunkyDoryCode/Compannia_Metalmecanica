package com.HunkyDoryCode;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HunkyDoryCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HunkyDoryCodeApplication.class, args);
		Empleado emp1 = new Empleado("Alejandro Garcia", "alejo@gmail.com", "Mecanicas Garcia",
				"Administrador", null);

		Empresa ep1 = new Empresa("Mecanicas Garcia", "calle 1 # 1-10",
				3113502, "900789879-8", emp1);

	}

}
