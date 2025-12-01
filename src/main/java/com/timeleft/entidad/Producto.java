package com.timeleft.entidad;

/**
 * 
 */
public class Producto {
	private String nombre;
	private String categoria;
	private int precio;
	private int id;
	public Producto(String nombre, String categoria, int precio ) {
		this.nombre= nombre;
		this.categoria= categoria;
		this.precio= precio;
		
	}
	public Producto() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
