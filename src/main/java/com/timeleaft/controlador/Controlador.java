package com.timeleaft.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.timeleft.entidad.Producto;



@Controller
public class Controlador {

	private Servicio servicio;
	
	@GetMapping("/saluda")
	public String saluda(Model modelo) {
		System.out.println(" 1-----------------------------------");
		String nombre= "Alejandro";
		modelo.addAttribute("nombre", nombre);
		return "saludo";
	}
	@GetMapping("/lista")
	public String listado(Model model) {
		List<Producto> listaProducto= new ArrayList<Producto>();
		Producto p1= new Producto("Pan", "Alimentacion", 1);
		Producto p2= new Producto("Pc", "Informatica", 1500);
		listaProducto.add(p1);
		listaProducto.add(p2);
		model.addAttribute("productos", listaProducto);
		return "lista";
		
	}
	@GetMapping("/productos")
	public String listado1(Model model) {
		model.addAttribute("listaproductos", servicio.obtenerProductos());
		return "lista";
	}
	
	@GetMapping("/Productos{id}")
	public String vistaProducto(@PathVariable int id, Model model) {
		Producto producto = servicio.buscarProductoPorId(id);
		model.addAttribute("producto",producto);
		return "vistaProducto";
		
	}
	
	@GetMapping("/form")
	public String formulario(Model model) {
		model.addAttribute("producto", new Producto());
		return "formulario";
		
	}
	
	@PostMapping("/form")
	public String formularioPost(Model model, Producto producto ) {
		System.out.println(producto.toString());
		servicio.agregarProducto(producto);
		return "vistaProducto";
	}
}
