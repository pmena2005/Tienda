package Tienda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Tienda {
	protected ArrayList <Producto> productos;
	
	public Tienda() throws IOException, ParseException {
		this.productos = new ArrayList<Producto>();
		this.setProductos(this.generarListado());
	}

	public ArrayList <Producto> generarListado() throws IOException, ParseException {
		ArrayList <Producto> pro =  new ArrayList<Producto>();
		Producto p;
		JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\pmena\\eclipse-workspace\\Tienda\\productos.JSON");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray listado = (JSONArray)pJsonObj.get("productos");
        
        for(int i = 0; i < listado.size(); i++){
        	
            JSONObject productoJson = (JSONObject)listado.get(i);
            
            int id = Math.toIntExact((long) productoJson.get("id"));
            String nombre = (String) productoJson.get("nombre");
            double precio = (Double)productoJson.get("precio");
            
            p = new Producto(nombre,precio,id);
            pro.add(p);
       
        }
        return pro;
	}
	private void setProductos(ArrayList<Producto> pro) {
		this.productos = pro;
	}

	public ArrayList <Producto> getProductos(){
		return this.productos;
	}
	
	public void imprimirArticulos(){
		ArrayList <Producto> productos = this.getProductos();
		for(Producto p : productos) {
			System.out.println(p.toString());
		}
	}
	
	public void añadirCliente(String nombre) {
	        try {
	            @SuppressWarnings("resource")
				BufferedWriter w = new BufferedWriter(new FileWriter("C:\\Users\\pmena\\eclipse-workspace\\Tienda\\cliente.csv" , true));
	            w.write(nombre);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	@SuppressWarnings("unchecked")
	public void añadirProducto(Producto p) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("nombre", p.getNombre() );
		obj.put("precio", p.getPrecio() );
		FileWriter file = new FileWriter("C:\\Users\\pmena\\eclipse-workspace\\Tienda\\productos.JSON" , true);
		file.write(obj.toJSONString());
		file.close();
	}
	
	public Producto buscarPorId(int id) {
		Producto pro = null;
		for(Producto p : this.getProductos()) {
			if (p.getId() == id) {
				pro = p;
			}
		}
		return pro;
	}
	
}
