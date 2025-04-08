/**
*@author Axel Daniel Becerril Olivar
*/
public class Criba{
/**
* Esta es una delcaración de una clase llamada Criba con nivel de protección publica
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
public static void main(String[] args){
	System.out.println("Criba de Erastotenes.");
	System.out.println("\nEl conjunto de numeros dados son del 0 al 50");
	int i=0; int j=0; int x=0; int z=0;
	int []numeros=new int[52];
	int []primos= new int [52];
	for (i=0; i<=50; i++){
		numeros[i]=i;
		System.out.println("Posicion "+i+": " + numeros[i]);
	}
	if((Math.pow(2,2))<=numeros[50]){ //Primera pasada, 2*2
		System.out.println("\n¿2^2 <= 50? Si, eliminando multiplos de 2.");// Imprime que 2*2 es menor que 50
		for(i=2;i<=50;i++){
			if(i%2==0 && i!=2){
				System.out.println("Eliminando el numero: "+i+" de la lista.");
			}
			else{
				x=i;
				primos[j]= x;
				j+=1;
			}
		}
	}
	if((Math.pow(3,2))<=numeros[50]){
			System.out.println("\n¿3^3 <= 50? Si, eliminando multiplos de 3.");		
			for(j=4;j<=24;j++){
				if(primos[j]%3==0){
					System.out.println("Eliminando el numero: "+primos[j]+" de la lista.");
				}
			}
			System.out.println("\n");
			for(i=0; i<=24;i++){
				j=i;
				if(j==4 || j==7 ||j==10 || j==13 || j==13 || j==16 || j==19 || j==22){
					primos[j]=0;
					j+=1;
				}else{
					continue;
				}
			}
	}
	if((Math.pow(5,2))<=numeros[50]){
			System.out.println("\n¿5^2 <= 50? Si, eliminando multiplos de 5.");
			for(j=12;j<=18;j=j+5){
				if(primos[j]%5==0){
					System.out.println("Eliminando el numero: "+primos[j]+" de la lista.");
				}
			}
			System.out.println("\n");
			for(i=0; i<=24;i++){
				j=i;
				if(j==12 || j==17 || j==7){
					primos[j]=0;
					j+=1;
				}else{
					continue;
				}
			}
	}
	if((Math.pow(7,2))<=numeros[50]){
			System.out.println("\n¿5^2 <= 50? Si, eliminando multiplos de 7.");
			for(j=23;j<=24;j++){
				if(primos[j]%7==0){
					System.out.println("Eliminando el numero: "+primos[j]+" de la lista.");
				}
			}
			System.out.println("\n");
			for(i=0; i<=24;i++){
				j=i;
				if(j==24){
					primos[j]=0;
					j+=1;
				}else{
					if(j==4 || j==7 || j==10 || j==12 || j==13 || j==16 || j== 17 || j==19 || j==22){
						continue;
					}else{
						System.out.println("Numero primo: "+primos[j]);
					}
				}
			}
	}
}
} 