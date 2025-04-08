/**
 * @author Axel Daniel Becerril Olivar
 * */
public class HiloRunnable implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("Iteracion: "+(i+1)+" de "+Thread.currentThread().getName());
		}
		System.out.println("Termina el "+Thread.currentThread().getName());
	}
	/**
	 * @param args
	 * Recibe como argumento una cadena de texto
	 * */
	public static void main(String[] args) {
		new Thread(new HiloRunnable(), "Primer Hilo").start();
		new Thread(new HiloRunnable(), "Segundo Hilo").start();
		System.out.println("Termina el hilo principal");
	}
}