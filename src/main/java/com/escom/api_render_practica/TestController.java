package com.escom.api_render_practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String home() {
		return "¡Hola! La API está funcionando correctamente en la raíz.";
	}

	@GetMapping("/api/status")
	public String status() {
		return "El estatus de la API es: ACTIVO y listo para la evaluación.";
	}
}