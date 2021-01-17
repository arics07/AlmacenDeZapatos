package interfaces;

import java.util.List;
import modelos.Producto;

public interface IDescuento {

	boolean aplicarDescuento(List<Producto> productos);
	
}
