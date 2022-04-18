package com.example.fechas.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FechasModel {
	@JsonProperty("id")
	private Integer id = null;
	
	@JsonProperty("fechaCreacion")
	private LocalDate fechaCreacion = null;
	
	@JsonProperty("fechaFin")
	private LocalDate fechaFin = null;
	
	@JsonProperty("fechas")
	private List<String> fechas = null;
	
	@JsonProperty("fechasFaltantes")
	private List<String> fechasFaltantes = null;
	
	public FechasModel(Integer id, LocalDate fechaCreacion, LocalDate fechaFin, List<String> fechas, List<String> fechasFaltantes) {
		this.id = id;
		this.fechaCreacion = fechaCreacion;
		this.fechaFin = fechaFin;
		this.fechas = fechas;
		this.fechasFaltantes = fechasFaltantes;
	}
	
	public FechasModel() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<String> getFechas() {
		return fechas;
	}
	public void setFechas(List<String> fechas) {
		this.fechas = fechas;
	}
	public List<String> getFechasFaltantes() {
		return fechasFaltantes;
	}
	public void setFechasFaltantes(List<String> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}
}
