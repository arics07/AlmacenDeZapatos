package modelos;

import enums.GeneroProducto;

public class Producto {

	private int idZapato;
	private String color;
	private int talla;
	private GeneroProducto genero;
	private String tipo;
	private int precio;
	
	public Producto(int idZapato, String color, int talla, GeneroProducto genero, String tipo, int precio) {
		super();
		this.idZapato = idZapato;
		this.color = color;
		this.talla = talla;
		this.genero = genero;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public int getIdZapato() {
		return idZapato;
	}
	
	public void setIdZapato(int idZapato) {
		this.idZapato = idZapato;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getTalla() {
		return talla;
	}
	
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public GeneroProducto getGenero() {
		return genero;
	}
	public void setGenero(GeneroProducto genero) {
		this.genero = genero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idZapato=" + idZapato + ", color=" + color + ", talla=" + talla + ", genero=" + genero
				+ ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	
}