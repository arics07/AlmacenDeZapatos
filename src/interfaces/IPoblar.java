package interfaces;

import java.util.List;

import modelos.Vendedor;
import modelos.Comprador;
import modelos.Producto;
import modelos.Almacen;

public interface IPoblar {
	
	List<Vendedor> crearVendedor();
	
	List<Comprador> crearComprador();
	
	List<Producto> crearProducto();
	
	List<Almacen> crearAlmacen();

}
