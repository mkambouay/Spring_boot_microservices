package com.springboot.app.servicio.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.servicio.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
