/**
*@author Axel Daniel Becerril Olivar
*/
public class Rinon extends Pulmon{
	public int _rinon=0;
	public Rinon(){ //Constructor de rinon
		rinon=_rinon;
		System.out.println("\nAnalizando rinon...\nDebe decirle al doctor que en sus estudios obtuvo: "+rinon);
	}
	public static void main(String[] args){
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		Rinon rin = new Rinon();
	}
}