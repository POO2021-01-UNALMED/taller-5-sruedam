package zooAnimales;
import java.util.*;
import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		totalAnimales ++;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		Animal.totalAnimales ++;
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		Animal.totalAnimales ++;
		listado.add(this);
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil nuevoR = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return nuevoR;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil nuevoR = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		iguanas++;
		return nuevoR;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return this.zona;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
}
