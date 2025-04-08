import java.util.Scanner;
/**
*@author Axel Daniel Becerril Olivar
*/
public class Palindromo{
/**
* Esta es una delcaración de una clase llamada Palindromo con nivel de protección publica 
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
	String p;
	public static void main(String[] args){
		int i=1;
		do{
			//int i=1;
			Palindromo pal = new Palindromo();
			Scanner palabra = new Scanner(System.in);
			System.out.println("Ingrese una palabra: ");
			pal.p=palabra.next();
			switch (pal.p){
				case "alto":
					i=2;
					break;
				case "Alto":
					i=2;
					break;
				case "Salta":
					continue;
				case "salta":
					continue;
				default:
				System.out.println("Ingresaste la palabra: "+pal.p);
				break;
			}
	}while(i<2);
}
}

