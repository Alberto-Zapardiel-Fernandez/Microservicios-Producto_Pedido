package com.curso.service;

import java.util.List;

import com.curso.entity.Producto;

public interface ProductoService {

	public List<Producto> verProductos();
	public void actualizarProducto(int codigoProducto, int unidades);
	public Double verPrecioDeProducto(int codigoProducto);
}
