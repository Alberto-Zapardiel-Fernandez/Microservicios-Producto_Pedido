package com.curso.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6456034910125834139L;
	@Id
	@Column(name = "idPedido", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	@Column(name = "codigoProducto", nullable = false)
	private int codigoProducto;
	@Column(name = "unidades")
	private int unidades;
	@Column(name = "total")
	private double total;
	@Column(name = "fechaPedido")
	private Date fechaPedido;
	
	public Pedido(int codigoProducto, int unidades, double total, Date fechaPedido) {
		super();
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
		this.total = total;
		this.fechaPedido = fechaPedido;
	}
	public Pedido() {
		super();
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", codigoProducto=" + codigoProducto + ", unidades=" + unidades
				+ ", total=" + total + ", fechaPedido=" + fechaPedido + "]";
	}
	
	
}
