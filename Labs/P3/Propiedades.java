/**
*@author Axel Daniel Becerril Olivar
*/
//package Propiedades;
import java.util.*;
public class Propiedades{
/**
* Esta es una delcaración de una clase llamada Propiedades con nivel de protección publica
* @param args es una cadena de arreglos que recibe la función como parámetros
* @return void no regresa nada porque es vacío
*/
	public static void main(String[] args){
		Properties propiedades = System.getProperties();
		System.out.println("Las propiedades del sistema son las siguientes:");
		System.out.println(propiedades);
	}

}
