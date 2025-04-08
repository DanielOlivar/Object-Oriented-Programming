/**
 * @author Axel Daniel Becerril Olivar
 * */
public class Cuenta extends Thread{
	private static long saldo=0;
	/**
	 * @param nombre
	 * Le da nombre a los hilos creados
	 * */
	public Cuenta(String nombre){
		super(nombre);
	}
	public void run(){
		if(getName().equals("Deposito 1 ")||getName().equals("Deposito 2")){
			this.depositarDinero(100);
		}else{
			this.extraerDinero(50);
		}
		System.out.println("Termina el "+getName());
	}
	/**
	 * @param cantidad
	 * Recibe la cantidad que se depositará o se extraerá
	 * */
	public synchronized void depositarDinero(int cantidad){
		saldo+=cantidad;
		System.out.println("Se depositaron "+cantidad+" pesos");
		notifyAll();
	}
	public synchronized void extraerDinero(int cantidad){
		try{
			if(saldo<=0){
				System.out.println(getName()+" espera deposito \n\tSaldo "+saldo);
				sleep(5000);
			}
		/**
	 	* @param ie
	 	* Parámetro que se utiliza para indicar si hay alguna excepción
	 	* */
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
		saldo-=cantidad;
		System.out.println(getName()+" extrajo "+cantidad+" pesos.\n\t Saldo restane: "+saldo);
		notifyAll();
	}
	/**
	* @param args
	* Es una cadena de texto que se recibe como parámetro
	* */
	public static void main(String[] args) {
			new Cuenta("Acceso 1").start();
			new Cuenta("Acceso 2").start();
			new Cuenta("Deposito 1").start();
			new Cuenta("Deposito 2").start();
			System.out.println("Termina el hilo principal.");
		}
}