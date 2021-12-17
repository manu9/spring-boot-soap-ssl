package com.manu.springbootsoapssl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.manu.servicio_saludar.ws.SaludarRequest;
import com.manu.servicio_saludar.ws.SaludarResponse;

@Endpoint
public class SaludarEndpoint {

	private static final String NAMESPACE_URI = "http://manu.com/servicio-saludar/ws";

	@Autowired
	private SaludarServices saludarServices;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SaludarRequest")
	@ResponsePayload
	public SaludarResponse insertTrade(@RequestPayload SaludarRequest request) {
		SaludarResponse response = new SaludarResponse();
		response.setSaludo(saludarServices.saludar(request));

		return response;
	}
}
