package interfaces.implementaciones;

import java.util.ArrayList;
import java.util.List;

import interfaces.IPoblar;
import modelos.Almacen;
import modelos.Comprador;
import modelos.Producto;
import modelos.Vendedor;

public class PoblarImple implements IPoblar {

	@Override
	public List<Vendedor> crearVendedor() {
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		Vendedor vendedor1 = new Vendedor("Juan", "Perez", 101);
		vendedores.add(vendedor1);
		Vendedor vendedor2 = new Vendedor("María", "Costa", 102);
		vendedores.add(vendedor2);
		return vendedores;
	}

	@Override
	public List<Comprador> crearComprador() {
		List<Comprador> compradores = new ArrayList<Comprador>();
		Comprador comprador1 = new Comprador("Ana", "García", 501);
		compradores.add(comprador1);
		Comprador comprador2 = new Comprador("Lucas", "Castro", 502);
		compradores.add(comprador2);
		return compradores;
	}

	@Override
	public List<Producto> crearProducto() {
		List<Producto> productos = new ArrayList<Producto>();
		Producto sandalias1 = new Producto(0001, "Azul", 37, 'f', "Sandalias", 2500);
		productos.add(sandalias1);
		Producto zapatos1 = new Producto(1001, "Beige", 38, 'f', "Zapatos", 3000);
		productos.add(zapatos1);
		Producto zapatillas1 = new Producto(2001, "Negro", 39, 'f', "Zapatillas", 3500);
		productos.add(zapatillas1);
		Producto sandalias2 = new Producto(0002, "Rojo", 38, 'f', "Sandalias", 4000);
		productos.add(sandalias2);
		Producto zapatos2 = new Producto(1002, "Azul", 39, 'm', "Zapatos", 4500);
		productos.add(zapatos2);
		Producto zapatillas2 = new Producto(2002, "Blanco", 39, 'f', "Zapatillas", 5000);
		productos.add(zapatillas2);
		Producto zapatillas3 = new Producto(2003, "Rojo", 39, 'f', "Zapatillas", 5000);
		productos.add(zapatillas3);
		Producto sandalias3 = new Producto(1003, "Amarillo", 38, 'f', "Sandalias", 5000);
		productos.add(sandalias3);
		Producto sandalias4 = new Producto(1004, "Dorado", 38, 'f', "Sandalias", 6000);
		productos.add(sandalias4);
		return productos;
	}

	@Override
	public List<Almacen> crearAlmacen() {
		List<Almacen> almacenes = new ArrayList<Almacen>();
		Almacen almacen1 = new Almacen("Tienda1");
		almacenes.add(almacen1);
		Almacen almacen2 = new Almacen("Tienda2");
		almacenes.add(almacen2);
		return almacenes;
	}

}
