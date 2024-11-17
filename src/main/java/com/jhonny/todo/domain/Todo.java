package com.jhonny.todo.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {
	
	private Integer id;
	private String titulo;
	private String Descricao;
	private LocalDateTime dataPraFinalizar;
	private Boolean finalizado = false;
	public Todo() {
		super();
	}
	public Todo(Integer id, String titulo, String descricao, LocalDateTime dataPraFinalizar, Boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		Descricao = descricao;
		this.dataPraFinalizar = dataPraFinalizar;
		this.finalizado = finalizado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public LocalDateTime getDataPraFinalizar() {
		return dataPraFinalizar;
	}
	public void setDataPraFinalizar(LocalDateTime dataPraFinalizar) {
		this.dataPraFinalizar = dataPraFinalizar;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}
	
	

}