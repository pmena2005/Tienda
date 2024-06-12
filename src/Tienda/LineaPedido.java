package Tienda;

public class LineaPedido{
	
	Producto producto;
	int cant;
	double precioLinea;
	
	public LineaPedido(Producto p , int num) {
		setProducto(p);
		setCant(num);
		setPrecioLinea(p.getPrecio()*num);
	}

	private void setPrecioLinea(double p) {
		this.precioLinea = p;
	}

	private void setCant(int num) {
		this.cant = num;
	}

	private void setProducto(Producto p2) {
		this.producto = p2;
	}
	
	public Producto getProducto(){
		return this.producto;
	}
	
	public int getCantidad() {
		return this.cant;
	}
	
	public double getPrecioLinea() {
		return this.precioLinea;
	}
	
	@Override
	public String toString() {
		Producto p = this.getProducto();
		return String.format("%s | %d | %f | %f",p.getNombre(), this.getCantidad(), p.getPrecio(), this.getPrecioLinea());
	}
	
	
}
