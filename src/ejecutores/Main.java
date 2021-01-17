package ejecutores;

import java.util.ArrayList;
import java.util.List;

import interfaces.IPoblar;
import interfaces.IBuscar;
import interfaces.IDescuento;
import interfaces.implementaciones.PoblarImple;
import interfaces.implementaciones.BuscarImple;
import interfaces.implementaciones.DescuentoImple;
import modelos.Producto;

public class Main {

	public static void main(String[] args) {
		IPoblar poblar = new PoblarImple();
		IBuscar buscar = new BuscarImple();
		
		List<Producto> productos = poblar.crearProducto();
		
		List<Producto> zapatosPorColor = buscar.buscarPorColor(productos, "Azul");
		System.out.println(zapatosPorColor);
		
		List<Producto> zapatosPorTalle = buscar.buscarPorTalle(productos, 37);
		System.out.println(zapatosPorTalle);
		
		List<Producto> zapatosPorGenero = buscar.buscarPorGenero(productos, 'f');
		System.out.println(zapatosPorGenero);
		
		List<Producto> zapatosPorTipo = buscar.buscarPorTipo(productos, "Zapatillas");
		System.out.println(zapatosPorTipo);
		
		List<Producto> productosComprados = new ArrayList<Producto>();
		
		List<Producto> busquedaCombinada = buscar.buscarGeneroTipoTalle(productos, 'f', "Zapatillas", 39);
		System.out.println("Los productos disponibles son \n" + busquedaCombinada);
		productosComprados.add(busquedaCombinada.get(0));
    	productosComprados.add(busquedaCombinada.get(1));
     	productosComprados.add(busquedaCombinada.get(2));
		System.out.println("La compra es " + productosComprados);
		
		//Descuento
		IDescuento precioFinal = new DescuentoImple();
		precioFinal.aplicarDescuento(productosComprados);
		
	}

}
