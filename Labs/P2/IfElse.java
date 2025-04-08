import java.util.Scanner;
/**
*@author Axel Daniel Becerril Olivar
*/
public class Numero{
		public int a; 
		public int b; 
		public int c;
		public static void main(String[] args){
			Numero x = new Numero();
			Numero y = new Numero();
			Numero z = new Numero();
			Scanner numero = new Scanner(System.in);
			System.out.println("Ingrese el primer número: ");
			x.a = numero.nextInt();
			System.out.println("Ingrese el segundo número: ");
			y.b = numero.nextInt();
			System.out.println("Ingrese el tercerer número: ");
			z.c = numero.nextInt();
			System.out.println("a: " +x.a +"b: "+y.b+"c: "+z.c);
	}
}