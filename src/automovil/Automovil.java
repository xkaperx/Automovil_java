package automovil;

public class Automovil {

	int puertas = 0;
	String marca="neon";
	boolean encendido = false;
	
	public Automovil(){
		
	}
	
/*	public  Automovil(int puertas, String marca){
		this.puertas = puertas;
		this.marca = marca;
	}
	*/
	public void arrancar() {
		if (encendido =  true) { 
			System.out.println("El auto esta encendido");
		}else {
			System.out.println("El auto esta apagado");
		}
	}
}