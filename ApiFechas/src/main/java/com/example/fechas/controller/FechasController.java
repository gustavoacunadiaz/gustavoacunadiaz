package com.example.fechas.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fechas.model.FechasModel;
import com.example.fechas.service.FechasService;

@RestController
@RequestMapping("/fechas")
public class FechasController {
	@Autowired
	FechasService fechasService;

	@GetMapping()
	public FechasModel obtenerFechas() throws ParseException {
		String stringFechas = fechasService.getFechas();
		ArrayList<String> lf = new ArrayList<String>();
		JSONObject myJson = new JSONObject(stringFechas);
		   		    
		LocalDate fc = LocalDate.parse((CharSequence) myJson.get("fechaCreacion"));
		LocalDate ff = LocalDate.parse((CharSequence) myJson.get("fechaFin"));
		JSONArray f =  myJson.getJSONArray("fechas");		
		
		for (int i = 0; i < f.length(); i++) {
			String date = f.get(i).toString();
		    lf.add(date);
		}
		
		FechasModel fm = new FechasModel();
		fm.setId((Integer) myJson.get("id"));
		fm.setFechaCreacion(fc);
		fm.setFechaFin(ff);
		fm.setFechas(lf);

		String inicioAux = fc.toString();
		String finAux = ff.toString();
		Date inicioDate = new SimpleDateFormat("yyyy-MM-dd").parse(inicioAux);
		Date finDate = new SimpleDateFormat("yyyy-MM-dd").parse(finAux);
		
		ArrayList<String> fechasAllArray = new ArrayList<String>();
		ArrayList<String> fechasFaltantesArray = new ArrayList<String>();
		
		Date current = inicioDate;
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateInicio = simpleDateFormat2.format(current);
		fechasAllArray.add(dateInicio);
		
		while (current.before(finDate)) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(current);
			calendar.add(Calendar.MONTH, 1);
			current = calendar.getTime();
					
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = simpleDateFormat.format(current);
			fechasAllArray.add(date);
		}
	
		Integer i;
		for (i = 0; i < fechasAllArray.size(); i++) {
			if (lf.contains(fechasAllArray.get(i))) {
				System.out.println(fechasAllArray.get(i));				
			}else {
				fechasFaltantesArray.add(fechasAllArray.get(i));
			}			
		}		
		fm.setFechasFaltantes(fechasFaltantesArray);
	return fm;
	}
}
