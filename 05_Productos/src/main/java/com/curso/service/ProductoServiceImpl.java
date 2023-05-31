package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.curso.entity.Producto;
import com.curso.repository.ProductoRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.UnknownHttpStatusCodeException;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> verProductos() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public void actualizarProducto(int codigoProducto, int unidades) {
		Optional<Producto> producto = repository.findById(codigoProducto);
		if (producto.isPresent() && producto.get().getStock() > unidades) {
			producto.get().setStock(producto.get().getStock() - unidades);
			repository.save(producto.get());
		} else {
			System.out.println("No puedo dejar en negativo el stock");
			throw new ErrorResponseException(HttpStatus.IM_USED, null, null, "Tiene menor stock", null);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Double verPrecioDeProducto(int codigoProducto) {
		Optional<Producto> producto = repository.findById(codigoProducto);
		return (producto.isPresent() ?producto.get().getPrecioUnitario()  : 0);
		/*
		 * if (producto.isPresent()) {
			return producto.get().getPrecioUnitario();
		}else {
			return (double) 0;
		}
		 */
		
	}
}
