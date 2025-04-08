/**
*@author Axel Daniel Becerril Olivar
*/
public class humano{ 
	public int corazon;
	public int pulmon;
	public int rinon;
	public int higado;

	public humano(){ //Constructor de humano
		System.out.println("\nHumano listo para revisar...");
		higado=0;
		rinon=0;
		pulmon=0;
		corazon=0;
	}
	public static void main(String[] args) {
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		humano hum = new humano();
	}
}

