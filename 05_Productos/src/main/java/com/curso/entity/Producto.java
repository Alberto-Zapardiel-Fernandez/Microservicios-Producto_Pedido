package com.curso.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7690045251260460798L;
	@Id
	@Column(name = "codigoProducto", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoProducto;
	@Column(name = "nombreProducto", nullable = false)
	private String nombreProducto;
	@Column(name = "precioUnitario", nullable = false)
	private Double precioUnitario;
	@Column(name = "stock", nullable = false)
	private int stock;
	public Producto(int codigoProducto, String nombreProducto, Double precioUnitario, int stock) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
	}
	public Producto() {
		super();
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombreProducto + ", precioUnitario="
				+ precioUnitario + ", stock=" + stock + "]";
	}
	
	
}
