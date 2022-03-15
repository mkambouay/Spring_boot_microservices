package com.springboot.app.servicio.productos.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2677371029481410503L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private Double precio;
	
	@Transient
	private Integer port;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
}
