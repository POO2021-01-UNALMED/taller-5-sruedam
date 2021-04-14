package gestion;
import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for(int i = 0; i < (zonas.size()); i++) {
			if(this.zonas.get(i).getZoo() == this) {
				total = total + this.zonas.get(i).cantidadAnimales();
			}
		}
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}
}
