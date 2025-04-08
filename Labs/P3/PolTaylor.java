/**
*@author Axel Daniel Becerril Olivar
*/
import java.util.Scanner; //Para recibir datos del teclado
import static java.lang.Math. *; //Para calcular senos y cosenos
public class PolTaylor{
/**
* Esta es una delcaración de una clase llamada PolTaylor con nivel de protección publica
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
	float valor;
	float x1;
	public static void main(String[] args){
		PolTaylor val = new PolTaylor();
		Scanner valor1 = new Scanner(System.in);


		System.out.println("Paso 1. ");
		System.out.println("\nPoliniomio de Taylor del sen x para x = ");
		val.valor= valor1.nextFloat(); // Valor sobre el que se calcularan las derivadas
		System.out.println("\nEl valor de x que ingresaste es: "+val.valor);

		System.out.println("\n\nPaso 2.");
		System.out.println("\nSe calcularan las primeras 3 derivadas del seno de "+val.valor);
		double sen1= Math.sin(Math.toRadians(val.valor));
		System.out.println("f(x) = sen " + val.valor+ " = " + sen1);
		double cos1= Math.cos(Math.toRadians(val.valor));
		System.out.println("f'(x)= cos " + val.valor+" = " + cos1);
		double sen2= Math.sin(Math.toRadians(val.valor))*(-1);
		System.out.println("f''(x) = -sen " + val.valor+ " = " + sen2);
		double cos2= Math.cos(Math.toRadians(val.valor))*(-1);
		System.out.println("f'''(x)= -cos " + val.valor + " = " + cos2);


		System.out.println("\n\nPaso 3.");
		System.out.println("\nCalcular el factorial.");
		int inicio =0;
		double taylor=0;
		int f=1;
		int []factorial={0,0,0,0,0,0};
		for(inicio=1;inicio<=5;inicio++){
				f*=inicio;
				factorial[inicio]=f; 
				System.out.println("\nValor " + inicio +", factorial "+ factorial[inicio]);
			}


		System.out.println("\n\nPaso 3.");
		System.out.println("\nHaciendo operaciones ...");

		double v1= Math.pow((val.valor-val.valor),2);
		double v2= Math.pow((val.valor-val.valor),3);
		double v3= Math.pow((val.valor-val.valor),4);




		System.out.println("\n\nPaso 4.");
		System.out.println("\nRealizar el método de Taylor.");
		double pT=0;
		pT=(sen1)+(cos1*(val.valor-val.valor))+((sen2*v1)/factorial[2])+	((cos2*v2)/factorial[3])+((sen1*v3)/factorial[4]);
		System.out.println("\nEl resultado es aproximadamente igual a: "+pT);
		
}
}
