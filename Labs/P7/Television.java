/** @author Axel Daniel Becerril Olivar
 * 
 * 
 * 
 */
public class Television extends Decodificador implements Roku{
/**
* Esta es una delcaración de una clase llamada Television con nivel de protección publica
* que extiende mediante herencia de la clase decodificador y a su vez implementa la interfaz Roku
* para hacer inteligente la Tv
*/
	public Television(){}
	public void prender(){
		System.out.println("\nPrendiendo television...");
	}
	public void tipoSenal(){
		System.out.println("\nObteniendo senal del codificador...");
	}
	public void apagarse(){
		System.out.println("\nApagando television...");
	}

	public void apps(){
		System.out.println("\nDescargando aplicaciones en la memoria de Roku TV...");
		System.out.println("\nAplicaciones descargadas correctamente.");
	}

	public void internet(){
		System.out.println("\nAccediendo a su red wifi...");
		System.out.println("\nLa television ahora tiene acceso a internet.");
	}

	public void asistenteVirtual(){
		System.out.println("\nPuedes decir 'ok google' y el asistente virtual se activara automaticamente.");
	}

	public void smartTv(){
		System.out.println("\nListo, tu television se ha convertido en una smart tv, que lo disfrutes!");
	}
	public static void main(String[] args){
/**
 * @param args es una cadena de arreglos que recibe la funcion
 * 
 * */
		Television tele = new Television();
		tele.prender();
		tele.tipoSenal();
		tele.apps();
		tele.internet();
		tele.asistenteVirtual();
		tele.smartTv();
		tele.apagarse();
	}
}