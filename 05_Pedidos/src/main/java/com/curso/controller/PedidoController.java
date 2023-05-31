package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Pedido;
import com.curso.entity.ProductoPedido;
import com.curso.service.PedidoService;

@RestController
public class PedidoController {

	@Autowired
	PedidoService service;

	@GetMapping(value = "productos")
	public List<ProductoPedido> verProductos() {
		return service.verProductos();
	}

	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> verPedidos() {
		return service.verPedidos();
	}

	@PostMapping("pedidos/{idProducto}/{unidades}")
	public void altaPedido(@PathVariable(value = "idProducto") int idProducto,
			@PathVariable(value = "unidades") int unidades) {
		service.altaPedido(idProducto, unidades);
	}

}
