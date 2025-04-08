import java.util.Scanner;
/**
*@author Axel Daniel Becerril Olivar
*/
public class Numero{
/**
* Esta es una delcaración de una clase llamada Numero con nivel de protección publica 
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
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
			System.out.println("Ingrese el tercer número: ");
			z.c = numero.nextInt();
			//System.out.println("a: " +x.a +" b: "+y.b+" c: "+z.c);
			if(x.a==y.b && y.b==z.c){
				System.out.println("Son iguales los tres números");
			}else if(x.a<=y.b){
				if(y.b<=z.c){
					System.out.println(x.a + " <= " + y.b + " <= " + z.c);
				}else{
					System.out.println(x.a+" <= "+z.c+" <= "+y.b);
				}
			}else if(x.a>=z.c){
				if(z.c>=y.b){
					System.out.println(y.b+" <= "+z.c+" <= " + x.a);
				}else{
					System.out.println(z.c+" <= "+y.b+" <= " + x.a);
				}
			}else{
				System.out.println(y.b+" <= "+x.a+" <= " + z.c);
			}
	}
}