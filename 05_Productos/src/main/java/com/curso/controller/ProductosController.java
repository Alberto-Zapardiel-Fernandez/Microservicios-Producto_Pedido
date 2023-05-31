package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Producto;
import com.curso.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductosController {

	@Autowired
	private ProductoService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> verProductos(){
		return service.verProductos();
	}
	
	@GetMapping("/{id}")
	public Double verPrecioProducto(@PathVariable(value = "id") int codigoProducto) {
		return service.verPrecioDeProducto(codigoProducto);
	}
	
	@PutMapping("/{id}/{unidades}")
	public void actualizarProducto(@PathVariable(name = "id") int codigoProducto, @PathVariable(name = "unidades") int unidades) {
		service.actualizarProducto(codigoProducto, unidades);
	}
}
