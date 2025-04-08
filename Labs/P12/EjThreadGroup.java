/**
 * @author Axel Daniel Becerril Olivar
 * */
public class EjThreadGroup extends Thread{
	/**
	 * @param n 
	 * Recibe como parámetros el nombre del grupo
	 * @param g
	 * Recibe como parámetro el grupo con el que se va a trabajar
	 * */
	public EjThreadGroup(ThreadGroup g, String n){
		super(g,n);
	}
	public void run(){
		for(int i=0; i<10;i++){
			System.out.println("Iteracion: " +(i+1)+"del hilo "+getName());
		}
	}
	public static void listarHilos(ThreadGroup grupoActual){
		int numHilos;
		Thread [] listaDeHilos;
		numHilos=grupoActual.activeCount();
		listaDeHilos=new Thread[numHilos];
		/**
	 	* @param listaDeHilos 
	 	*Recibe como parámetros los hilos en funcionamiento
	 	* */
		grupoActual.enumerate(listaDeHilos);
		System.out.println("\nNumero de hilos activos: "+ numHilos+"\n");
		for(int i=0;i<numHilos;i++){
			System.out.println("\nHilo activo"+(i+1)+" = "+listaDeHilos[i].getName());
		}
	}
	/**
	 * @param args
	 * Recibe como parámetro una cadena de texto
	 * */
	public static void main(String[] args) {
		ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");
		Thread hilo1=new EjThreadGroup(grupoHilos, "Hilo 1 con prioridad maxima");
		Thread hilo2=new EjThreadGroup(grupoHilos, "Hilo 2 con prioridad normal");
		Thread hilo3=new EjThreadGroup(grupoHilos, "Hilo 3 con prioridad normal");
		Thread hilo4=new EjThreadGroup(grupoHilos, "Hilo 4 con prioridad normal");
		Thread hilo5=new EjThreadGroup(grupoHilos, "Hilo 5 con prioridad normal");

		hilo1.setPriority(Thread.MAX_PRIORITY);
		grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
		System.out.println("Prioridad del grupo: "+grupoHilos.getMaxPriority());
		System.out.println("Prioridad del Hilo 1 ="+hilo1.getPriority());
		System.out.println("Prioridad del Hilo 2 ="+hilo2.getPriority());
		System.out.println("Prioridad del Hilo 3 ="+hilo3.getPriority());
		System.out.println("Prioridad del Hilo 4 ="+hilo4.getPriority());
		System.out.println("Prioridad del Hilo 5 ="+hilo5.getPriority());
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		/**
	 	* @param grupoHilos 
	 	* Recibe como argumento los hilos creados anteriormente
	 	* */
		listarHilos(grupoHilos);
	}
}