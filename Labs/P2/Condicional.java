import java.util.Scanner;
/**
*@author Axel Daniel Becerril Olivar
*/
public class Condicional{
/**
* Esta es una delcaración de una clase llamada Condicional con nivel de protección publica 
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
		public int x; 
		public int y; 
		public int z;
		public static void main(String[] args){
			Condicional a = new Condicional();
			Condicional b = new Condicional();
			Condicional c = new Condicional();
			Scanner valor = new Scanner(System.in);
			System.out.println("Ingrese el primer valor: ");
			a.x = valor.nextInt();
			System.out.println("Ingrese el segundo número: ");
			b.y = valor.nextInt();
			int val1=0;
			val1= a.x<b.y ? a.x : b.y;
			System.out.println("Comparacion entre "+a.x+ " y "+b.y+", el valor mas chico es: "+val1);
			System.out.println("Ingrese el tercer número: ");
			c.z = valor.nextInt();
			int val2=0;
			val2= val1<c.z ? val1 : c.z;
			System.out.println("Comparacion entre "+val1+ " y "+c.z+", el valor mas chico es: "+val2);
}
}