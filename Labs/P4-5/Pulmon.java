/**
*@author Axel Daniel Becerril Olivar
*/
public class Pulmon extends Higado{
	public int _pulmon=1;
	public Pulmon(){ //Constructor de pulmon
		pulmon=_pulmon;
		System.out.println("\nAnalizando pulmon...\nDebe decirle al doctor que en sus estudios obtuvo: "+pulmon);
	}
	public static void main(String[] args){
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		Pulmon pul = new Pulmon();
	}
}