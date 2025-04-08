/**
*@author Hernández Alejo Ximena Gizell
*@version 2.0_25.06.2021
*
*/
public class Human{
	/**
	* El método main es el método que contiene la interacción entre los objetos que componen un programa en Java
	* debe ser público, debido a que será accesado por la JVM para su ejecución, es estático lo que lo convierte
	* en un método que pertenece a toda la clase, por lo tanto no se crea una copia para cada objeto y para su
	* invocación no requiere la creación de un objeto. No se necesita que retorne ningún valor, debido a que el
	* el manejo de errores se hace mediante excepciones en tiempo de compilación y ejecución.
	* 
	*	
	*	
	*/
	public static void main(String[] args) {
		Chequeo ximena = new Chequeo();
		Medico medico = new Medico();

		AparatoCirculatorio aC = new AparatoCirculatorio();
		AparatoRespiratorio aR = new AparatoRespiratorio();
		AparatoDigestivo aD = new AparatoDigestivo();
		SistemaSensorial sS = new SistemaSensorial();
		
		ximena.setDoliente(true);
		ximena.dolor();
		aC.setDolorCorazon(false);
		aR.setNoRespiro(false);
		aD.setDolorEstomago(true);
		sS.setNoVeo(true);
		medico.consultaHumano(ximena);
		medico.chequeoCorazon(aC);
		medico.chequeoPulmones(aR);
		medico.chequeoEstomago(aD);
		medico.chequeoOjos(sS);
	}
}

class Chequeo{
	private boolean doliente;

	public void setDoliente(boolean d){
		doliente = d;
	}

	public boolean getDoliente(){
		return doliente;
	}

	public void dolor(){
		if(doliente) System.out.println("Me siento enfermo....");
		else System.out.println("Estoy sano");
	}
}

class AparatoCirculatorio{
	private boolean corazon;
	
	public void setDolorCorazon(boolean c){
		corazon = c;
	}

	public boolean getDolorCorazon(){
		return corazon;
	}
	
}

class AparatoRespiratorio{
	private boolean pulmones;

	public void setNoRespiro(boolean p){
		pulmones = p;
	}

	public boolean getNoRespiro(){
		return pulmones;
	}	
}

class AparatoDigestivo{
	private boolean estomago;
	
	public void setDolorEstomago(boolean e){
		estomago = e;
	}

	public boolean getDolorEstomago(){
		return estomago;
	}

}

class SistemaSensorial{
	private boolean ojos;

	public void setNoVeo(boolean o){
		ojos = o;
	}

	public boolean getNoVeo(){
		return ojos;
	}


}

class Medico{
	public void consultaHumano(Chequeo a){
		if(!a.getDoliente()){
			System.out.println("\nUsted esta sano :)");
		}
		else{
			a.setDoliente(true);
			System.out.println("\nUsted esta enfermo :)");
		}
	}

	/////////////////////////
	public void chequeoCorazon(AparatoCirculatorio a){
		if(!a.getDolorCorazon()){
			System.out.println("\nEl problema no es su corazon :)");
		}
		else{
			a.setDolorCorazon(true);
			System.out.println("\nSu corazon esta enfermo :)");
		}

	}
	///////////
	public void chequeoPulmones(AparatoRespiratorio a){
		if(!a.getNoRespiro()){
			System.out.println("\nEl problema no esta en sus pulmones :)");
		}
		else{
			a.setNoRespiro(true);
			System.out.println("\nUsted es asmatico :)");
		}
	}
	//////
	public void chequeoEstomago(AparatoDigestivo a){
		if(!a.getDolorEstomago()){
			System.out.println("\nEl problema no esta en su estomago :)");
		}
		else{
			a.setDolorEstomago(true);
			System.out.println("\nTiene gastritis :)");
		}
	}
	public void chequeoOjos(SistemaSensorial a){
		if(!a.getNoVeo()){
			System.out.println("\nSus ojos estan sanos :)");
		}
		else{
			a.setNoVeo(true);
			System.out.println("\nNecesita lentes :)");
		}
	}	
	
}