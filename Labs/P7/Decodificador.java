/**
 * @author Axel Daniel Becerril Olivar 
 * */
public class Decodificador extends AparatoElectronico{
/**
 * Esta es una clase llamada Decodificador que extiende de AparatoElectronico mediante la herencia.
 * */
	public Decodificador(){}
	public void prender(){
		System.out.println("\nPrendiendo codificador...");
	}
	public void tipoSenal(){
		System.out.println("\nObteniendo senal digital...");
	}
	public void apagarse(){
		System.out.println("\nApagando codificador...");
	}
	public static void main(String[] args){
/**
 * @param args es una cadena de arreglos que recibe la funcion
 * */
		Decodificador dec = new Decodificador();
		dec.prender();
		dec.tipoSenal();
		dec.apagarse();
	}
}