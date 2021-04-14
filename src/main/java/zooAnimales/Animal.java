package zooAnimales;
import gestion.*;

public class Animal {
	static int totalAnimales = 0;
	String nombre;
	int edad;
	String habitat;
	String genero;
	Zona zona;
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		Animal.totalAnimales ++;
	}

	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		return "Provicional";
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
