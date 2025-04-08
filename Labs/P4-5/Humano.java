/**
 * @author Becerril Olivar Axel Daniel
 * */
public class Humano{
/**
 * @param args
 * Recibe como parámetro una cadena de texto
 * */
	public static void main(String[] args){
		Paciente axel = new Paciente();
		Medico karla = new Medico();
		Corazon cora = new Corazon();
		Higado hig = new Higado();
		Rinon rin = new Rinon();
		Pulmon pul = new Pulmon();
/**
 * @param true 
 * Recibe como parámetro un boleano con valor verdadero
 * */
		axel.setEnfermo(true);
		axel.malito();
		cora.setCorazonenfermo(true);
		hig.setHigadoenfermo(true);
		rin.setRinonenfermo(true);
		pul.setPulmonenfermo(true);
/**
 * @param axel
 * Recibe como parámetro el objeto paciente
 * */
		karla.revisarPaciente(axel);
/**
 * @param corazón
 * Recibe como parámetro el objeto corazón
 * */
		karla.revisarCora(cora);
/**
 * @param hig
 * Recibe como parámetro el objeto higado
 * */
		karla.revisarHigado(hig);
/**
 * @param rin
 * Recibe como parámetro el objeto riñon
 * */
		karla.revisarRinon(rin);
/**
 * @param pul
 * Recibe como parámetro el objeto pulmon
 * */
		karla.revisarPulmon(pul);
	}
}
class Paciente{
	private boolean enfermo;
/**
 * @param e
 * Recibe como parámetro un boleano que hace referencia a enfermo
 * */
	public void setEnfermo(boolean e){
		enfermo = e;
	}
	public boolean getEnfermo(){
		return enfermo;
	}
	public void malito(){
		if(enfermo){
			System.out.println("Necesito consulta con la doctora Karla.");
		}
		else{
			System.out.println("No necesito consulta.");
		}
	}
}
class Corazon{
	private boolean coraz;
/**
 * @param c
 * Recibe como parámetro un boleano que hace referencia a coraz
 * */
	public void setCorazonenfermo(boolean c){
		coraz = c;
	}
	public boolean getCorazonenfermo(){
		return coraz;
	}
}
class Higado{
	private boolean higado;
/**
 * @param h
 * Recibe como parámetro un boleano que hace referencia a higado
 * */
	public void setHigadoenfermo(boolean h){
		higado = h; 
	}
	public boolean getHigadoenfermo(){
		return higado;
	}	
}
class Rinon{
	private boolean rinon;
/**
 * @param r
 * Recibe como parámetro un boleano que hace referencia a rinñon
 * */
	public void setRinonenfermo(boolean r){
		rinon = r;
	}
	public boolean getRinonenfermo(){
		return rinon;
	}
}
class Pulmon{
	private boolean pulmones;
/**
 * @param p
 * Recibe como parámetro un boleano que hace referencia a pulmon
 * */
	public void setPulmonenfermo(boolean p){
		pulmones = p;
	}
	public boolean getPulmonenfermo(){
		return pulmones;
	}
}
class Medico{
	public void revisarPaciente(Paciente a){
		if(!a.getEnfermo()){
			System.out.println("\nUsted no esta enfermo.");
		}
		else{
			a.setEnfermo(true);
			System.out.println("\nUsted necesita estudios medicos para saber de donde proviente el dolor...");
		}
	}
	public void revisarCora(Corazon a){
		if(!a.getCorazonenfermo()){
			System.out.println("\nRevisando corazón... Usted tiene la presion normal.");
		}
		else{
			a.setCorazonenfermo(true);
			System.out.println("\nRevisando cor... Necesitamos una reanimacion!!!");
		}
	}
	public void revisarHigado(Higado a){
		if(!a.getHigadoenfermo()){
			System.out.println("\nRevisando higado... Usted tiene su higado en buen estado.");
		}
		else{
			a.setHigadoenfermo(true);
			System.out.println("\nRevisando higado... Deje de tomar refresco!!!");
		}
	}
	public void revisarRinon(Rinon a){
		if(!a.getRinonenfermo()){
			System.out.println("\nUsted tiene su rinon en buen estado.");
		}
		else{
			a.setRinonenfermo(true);
			System.out.println("\nRevisando rin... Oh no, necesita operacion de urgencia!!!");
		}
	}
	public void revisarPulmon(Pulmon a){
		if(!a.getPulmonenfermo()){
			System.out.println("\nRevisando pulmones... Usted tiene buena oxigenacion");
		}
		else{
			a.setPulmonenfermo(true);
			System.out.println("\nRevisando pulmones... Usted necesita tanque de oxigeno.");
		}
	}	
	
}