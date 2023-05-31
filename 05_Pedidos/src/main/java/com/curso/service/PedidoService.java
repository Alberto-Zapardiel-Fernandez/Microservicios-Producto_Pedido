package com.curso.service;

import java.util.List;

import com.curso.entity.Pedido;
import com.curso.entity.ProductoPedido;

public interface PedidoService {

	public void altaPedido(int idProducto,int unidades);
	public List<Pedido> verPedidos();
	public List<ProductoPedido> verProductos();
	
}
