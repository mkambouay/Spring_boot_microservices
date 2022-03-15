package com.springboot.app.servicio.item.models;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Producto {
	
	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	private Integer port;

}
