package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.SolicitanteRepositotio;

@Service
public class SolicitanteServiceImpl implements SolicitanteService {
	
	@Autowired
	protected SolicitanteRepositotio solicitanteRepositorio;
}
