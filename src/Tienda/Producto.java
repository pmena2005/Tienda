package Tienda;

public  class Producto {

	private String nombre;
	private double precio;
	private int id;
	
	public Producto(String nombre , double precio, int id){
		setNombre(nombre);
		setPrecio(precio);
		setId(id);
	}

	private void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %f",this.getId(), this.getNombre(),this.getPrecio());
	}
	
}