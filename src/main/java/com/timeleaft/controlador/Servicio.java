package com.timeleaft.controlador;

import java.util.ArrayList;
import java.util.List;

import com.timeleft.entidad.Producto;

public class Servicio {
	private List<Producto>listaProductos;
	private int idUltimo=0;
	public Servicio() {
		listaProductos= new ArrayList<Producto>();
	}
	public List<Producto> obtenerProductos(){
		Producto p1= new Producto("pan","alimentacion",1);
		Producto p2= new Producto("Mojama","alimentacion",2);
		Producto p3= new Producto("picos","alimentacion",3);
		return listaProductos;
		
	}
	public void agregarProducto(Producto p) {
		idUltimo++;
		p.setId(idUltimo);
		listaProductos.add(p);
		
	}
	public Producto buscarProductoPorId( int id) {
		for	(Producto p: listaProductos) {
			if(p.getId()== id) {
				return p;
			}
		}
		return null;
	}
}
