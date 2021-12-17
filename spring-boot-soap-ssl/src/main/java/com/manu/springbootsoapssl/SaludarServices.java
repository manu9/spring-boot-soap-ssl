package com.manu.springbootsoapssl;

import org.springframework.stereotype.Component;
import com.manu.servicio_saludar.ws.SaludarRequest;

@Component
public class SaludarServices {

	public String saludar(SaludarRequest request) {
		String saludo = "Hola " + request.getNombre() + " !!!";
		System.out.println(saludo);
		return saludo;
	}
}