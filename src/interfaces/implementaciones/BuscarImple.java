package interfaces.implementaciones;

import java.util.ArrayList;
import java.util.List;

import interfaces.IBuscar;
import modelos.Producto;

public class BuscarImple implements IBuscar {

	@Override
	public List<Producto> buscarPorColor(List<Producto> productos, String color) {
		List<Producto> zapatosEncontrados = new ArrayList<Producto>();
		for (Producto producto: productos) {
			if (producto.getColor().toUpperCase().equals(color.toUpperCase())) {
				zapatosEncontrados.add(producto);
			}
		}
		return zapatosEncontrados;
	}

	@Override
	public List<Producto> buscarPorTalle(List<Producto> productos, int talle) {
		List<Producto> zapatosEncontrados = new ArrayList<Producto>();
		for (Producto producto: productos) {
			if (producto.getTalla() == talle) {
				zapatosEncontrados.add(producto);
			}
		}
		return zapatosEncontrados;
	}

	@Override
	public List<Producto> buscarPorGenero(List<Producto> productos, char genero) {
		List<Producto> zapatosEncontrados = new ArrayList<Producto>();
		for (Producto producto: productos) {
			if (Character.toUpperCase(producto.getGenero()) == Character.toUpperCase(genero)) {
				zapatosEncontrados.add(producto);
			}
		}
		return zapatosEncontrados;
	}

	@Override
	public List<Producto> buscarPorTipo(List<Producto> productos, String tipo) {
		List<Producto> zapatosEncontrados = new ArrayList<Producto>();
		for (Producto producto: productos) {
			if (producto.getTipo().toUpperCase().equals(tipo.toUpperCase())) {
				zapatosEncontrados.add(producto);
			}
		}
		return zapatosEncontrados;
	}

	@Override
	public List<Producto> buscarGeneroTipoTalle(List<Producto> productos, char genero, String tipo, int talle) {
		List<Producto> busquedaCombinada = new ArrayList<Producto>();
		for (Producto producto: productos) {
			if (producto.getGenero()==genero && producto.getTipo().toUpperCase().equals(tipo.toUpperCase()) && producto.getTalla()==talle) {
				busquedaCombinada.add(producto);
			}
		}
		return busquedaCombinada;
	}

	
}
