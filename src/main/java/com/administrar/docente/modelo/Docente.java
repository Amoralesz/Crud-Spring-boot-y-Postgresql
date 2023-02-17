package com.administrar.docente.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "clave", nullable = false)
	private String clave;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellidos", length = 60, nullable = false)
	private String apellidos;
	
	@Column(name = "email", length = 60, nullable = false)
	private String email;
	
	@Column(name = "telefono", nullable = false)
	private int telefono;
	
	@Column(name = "blog", length = 60, nullable = false)
	private String blog;
	
	@Column(name = "profesional", length = 60, nullable = false)
	private String profesional;
	
	@Column(name = "escalaron", length = 10, nullable = false)
	private String escalaron;
	
	@Column(name = "idioma", length = 60, nullable = false)
	private String idioma;
	
	@Column(name = "anosExperiencia", length = 60, nullable = false)
	private String anosExperiencia;
	
	@Column(name = "areaTrabajo", length = 60, nullable = false)
	private String areaTrabajo;
	
	
	public Docente() {

	}

	public Docente(Long id, String clave, String nombre, String apellidos, String email, int telefono, String blog,
			String profesional, String escalaron, String idioma, String anosExperiencia, String areaTrabajo) {
		super();
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.blog = blog;
		this.profesional = profesional;
		this.escalaron = escalaron;
		this.idioma = idioma;
		this.anosExperiencia = anosExperiencia;
		this.areaTrabajo = areaTrabajo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getProfesional() {
		return profesional;
	}

	public void setProfesional(String profesional) {
		this.profesional = profesional;
	}

	public String getEscalaron() {
		return escalaron;
	}

	public void setEscalaron(String escalaron) {
		this.escalaron = escalaron;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(String anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public String getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

}