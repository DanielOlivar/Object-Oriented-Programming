/**
 * @author Axel Daniel Becerril Olivar 
 * */
public class Hilo extends Thread{
	/**
	 * @param nombre 
	 * Es el nombre de los hilos
	 * */
	public Hilo (String nombre){
		super(nombre);
	}
	public void run(){
		for (int i=0; i<5; i++){
			System.out.println("Iteracion: "+(i+1)+" de "+getName());
		}
		System.out.println("Termina el " + getName());
	}
	public static void main(String[] args) {
	/**
	 * @param args recibe una cadena de carácteres
	 * */
		new Hilo("Primer hilo").start();
		new Hilo("Segundo hilo").start();
		System.out.println("Termina el hilo principal");
	}
}