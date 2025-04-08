/**
*@author Axel Daniel Becerril Olivar
*/
public class Higado extends Corazon{
	public int _higado=1;
	public Higado(){ //Constructor de higado
		higado=_higado;
		System.out.println("\nAnalizando higado...\nDebe decirle al doctor que en sus estudios obtuvo: "+higado);
	}

	public static void main(String[] args){
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		Higado hig = new Higado();
	}
}