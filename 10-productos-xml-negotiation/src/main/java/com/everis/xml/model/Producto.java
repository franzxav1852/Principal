package com.everis.xml.model;

//Para que pueda soportar este modelo las rutas de la clase Ruta ResoureSupport
    public class Producto  {
	private int idProducto;
	private String nombre;
	
	public Producto(int id, String nombre) {
		this.idProducto = id;
		this.nombre = nombre;
	}

	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
