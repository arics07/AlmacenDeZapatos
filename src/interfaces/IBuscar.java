package interfaces;

import java.util.List;
import modelos.Producto;

public interface IBuscar {
	
	List<Producto> buscarPorColor(List<Producto> productos, String color);
	
	List<Producto> buscarPorTalle(List<Producto> productos, int talle);

	List<Producto> buscarPorGenero(List<Producto> productos, char genero);

	List<Producto> buscarPorTipo(List<Producto> productos, String tipo);

	List<Producto> buscarGeneroTipoTalle(List<Producto> productos, char genero, String tipo, int talle);	

}
