/**
*@author Axel Daniel Becerril Olivar
*/
public class Corazon extends humano{
	public int _corazon=1;
	public Corazon(){ //Metodo constructor de corazón
		corazon=_corazon; 
		System.out.println("\nAnalizando corazon...\nDebe decirle al doctor que en sus estudios obtuvo: "+corazon);

	}
	public static void main(String[] args) {
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		Corazon cor = new Corazon();
	}
}