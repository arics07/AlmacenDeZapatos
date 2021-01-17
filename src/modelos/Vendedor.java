package modelos;

public class Vendedor extends Persona {
	
	private int idVendedor;

	public Vendedor(String nombre, String apellido, int idVendedor) {
		super(nombre, apellido);
		this.idVendedor = getNumPedido();
	}

	public int getNumPedido() {
		return idVendedor;
	}

	public void setNumPedido(char numPedido) {
		this.idVendedor = numPedido;
	}

	@Override
	public String toString() {
		return "Vendedor [numPedido=" + idVendedor + "]";
	}
	
	

}
