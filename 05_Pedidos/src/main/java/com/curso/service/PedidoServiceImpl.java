package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.curso.entity.Pedido;
import com.curso.entity.ProductoPedido;
import com.curso.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	PedidoRepository repository;

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8000/";

	@Override
	@Transactional
	public void altaPedido(int idProducto, int unidades) {
		Double precioProducto = template.getForObject(url+"productos/"+idProducto, Double.class);
		java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		Pedido pedido = new Pedido(idProducto, unidades, unidades * precioProducto,
				sqlDate);
		repository.save(pedido);
		
		template.put(url+"productos/"+idProducto+"/"+unidades, null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pedido> verPedidos() {
		return repository.findAll();
	}

	@Override
	public List<ProductoPedido> verProductos() {
		return Arrays.asList(template.getForObject(url+"productos", ProductoPedido[].class));
	}
}
