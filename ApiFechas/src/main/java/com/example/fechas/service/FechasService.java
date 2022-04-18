package com.example.fechas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.fechas.model.FechasModel;

@Service
public class FechasService {
	 @Autowired
	 RestTemplate restTemplate;
	
	 public String getFechas(){
		  ResponseEntity<String> response =  restTemplate.getForEntity("http://127.0.0.1:8080/periodos/api", String.class);
		  String fecha = response.getBody();
		  //System.out.println ("->GIAD_fecha: "+fecha);
		  return  fecha;
	 }
}
