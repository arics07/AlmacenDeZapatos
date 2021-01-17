package interfaces.implementaciones;

import java.util.List;

import interfaces.IDescuento;
import modelos.Producto;

public class DescuentoImple implements IDescuento{

	@Override
	public boolean aplicarDescuento(List<Producto> productosComprados) {
		double precioTotal = 0;
		for (Producto producto: productosComprados) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		System.out.println("El precio total es " + precioTotal);
		if (productosComprados.size() >= 3) {
			System.out.println("Se aplica descuento!! El precio con desuento es " + precioTotal*0.9);
			return true;
		} else {
			System.out.println("Mínimo 3 productos para acceder al descuento.");
			return false;
		}
	}

}
