package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.SolicitanteService;
import com.example.demo.util.RestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SolicitanteController {
	
	@Autowired
	protected SolicitanteService solicitanteService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="saveOrUpdate", method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String solicitante Json) throws JsonParseException{
		Solicitante solicitante = this.mapper.readValue(solicitante Json, Solicitante.class);
		return null;
	}
}
