package com.curso.entity;


public class ProductoPedido{
	private int codigoProducto;
	private String nombreProducto;
	private Double precioUnitario;
	private int stock;
	public ProductoPedido(int codigoProducto, String nombreProducto, Double precioUnitario, int stock) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
	}
	public ProductoPedido() {
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
