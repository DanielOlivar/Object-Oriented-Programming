/**
*@author Axel Daniel Becerril Olivar
*/
public class Medico extends Rinon{
	private String nombre; 
	private int edad;
	private int numIdentificacion;


	public Medico(String _nombre, int _edad, int _numIdentificacion){ // Constructor
		/**
		* Esta es una declaración de una clase llamada Medico con nivel de protección publica
		* @param _nombre recibe el nombre del doctor
		* @param _edad recibe la edad del doctor
		* @param _numIdentifiacion recibe el numero de identificacion del doctor
		*/
		nombre= _nombre;
		edad= _edad;
		numIdentificacion=_numIdentificacion;
	}

	public void revisarHumano(){
		/**
		* Esta es una delcaración de una clase llamada revisarHumano con nivel de protección publica
		* @param args es una cadena de arreglos que recibe la función como parámetros
		* @return void va a determinar si el paciente tiene algo o no
*/
		System.out.println("\nHola, soy el doctor "+nombre+" y mi numero de identificacion es: "+numIdentificacion+".");
		if(corazon==1){
			System.out.println("\nRevisando corazon... Usted tiene la presion normal.\n");
		}if(corazon==0){
			System.out.println("\nRevisando cora... Necesitamos una reanimacion!!!\n");
		}if(pulmon==1){
			System.out.println("\nRevisando pulmones... Usted tiene buena oxigenacion\n");
		}if(pulmon==0){
			System.out.println("\nRevisando pulmones... Usted necesita tanque de oxigeno.\n");
		}if(higado==1){
			System.out.println("\nRevisando higado... Usted tiene su higado en buen estado\n");
		}if(higado==0){
			System.out.println("\nRevisando higado... Oh no, necesita operacion de urgencia!!!\n");
		}if(rinon==1){
			System.out.println("\nRevisando rinon... Usted tiene su rinon en buen estado, siga tomando agua.\n");
		}if(rinon==0){
			System.out.println("\nRevisando rin... Deje de tomar refresco!!!\n");
		}
	}

	public static void main(String[] args){
		/**
		* @param args es una cadena de arreglos que recibe la función como parámetros
		*/
		Medico med = new Medico("Jesus Maldonado", 68, 190826);	
		med.revisarHumano();
	}
}