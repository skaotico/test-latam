package com.test.saludo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull(message = "los nombre son requerido")
	private String nombres;

	@NotNull(message = "los apellidos son requerido")
	private String apellidos;

	@NotNull(message = "la fecha de nacimiento requerido")
	@Temporal(TemporalType.DATE)
	private Date nacimineto;

	private int edad;

	@Column(columnDefinition = "TEXT")
	private String felicitacion;

	public Persona() {
		super();
	}

	public Persona(long id, @NotNull @NotBlank(message = "los nombre son requerido") String nombres,
			@NotNull @NotBlank(message = "los apellidos son requerido") String apellidos,
			@NotNull @NotBlank(message = "la fecha de nacimiento requerido") Date nacimineto, int edad,
			String felicitacion) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nacimineto = nacimineto;
		this.edad = edad;
		this.felicitacion = felicitacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getNacimineto() {
		return nacimineto;
	}

	public void setNacimineto(Date nacimineto) {
		this.nacimineto = nacimineto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFelicitacion() {
		return felicitacion;
	}

	public void setFelicitacion(String felicitacion) {
		this.felicitacion = felicitacion;
	}

}
