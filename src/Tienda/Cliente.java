package Tienda;

public class Cliente {
	
	private String nombre;
	
	public Cliente(String nombre) {
		setNombre(nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
		
	@Override
	public String toString() {
		return String.format(this.getNombre());
	}
}
