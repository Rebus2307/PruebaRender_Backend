package com.escom.api_render_practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRenderPracticaApplication {

	// Este es el método crucial que le faltaba a Maven para arrancar la API
	public static void main(String[] args) {
		SpringApplication.run(ApiRenderPracticaApplication.class, args);
	}

	// Aquí están tus endpoints
	@GetMapping("/")
	public String home() {
		return "¡Hola! La API está funcionando correctamente en la raíz.";
	}

	@GetMapping("/api/status")
	public String status() {
		return "El estatus de la API es: ACTIVO y listo para la evaluación.";
	}
}