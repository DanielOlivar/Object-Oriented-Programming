/**
*@author Axel Daniel Becerril Olivar
*/
public class Hum{
	public static void main(String[] args) {
		Paciente axel = new Paciente();
		Medico karla = new Medico();
		Corazon cora = new Corazon();
		Higado hig = new Higado();
		Rinon rin = new Rinon();
		Pulmon pul = new Pulmon();
		axel.setEnfermo(true);
		axel.malito();
		cora.setCorazonenfermo(true);
		hig.setHigadoEnfermo(true);
		rin.setRinonenfermo(true);
		pul.setPulmonenfermo(true);
		karla.revisarPaciente(axel);
		karla.revisarCora(cora);
		karla.revisarHigado(hig);
		karla.revisarRinon(rin);
		karla.revisarPulmon(pul);
	}
}
class Paciente{
	public boolean enfermo;
	public void setEnfermo(boolean e){
		enfermo = e;
	}
	public void getEnfermo(){
		return enfermo;
	}
	public void malito(){
		if(malito){
			System.out.println("Necesito consulta con la doctora Karla.");
		} 
		else {
			System.out.println("No necesito consulta.");
	}
}
class Corazon{
	private boolean coraz;
	public void setCorazonEnfermo(boolean c){
		coraz = c;
	}
	public boolean getCorazonEnfermo(){
		return coraz;
	}

}
class Higado{
	private boolean higado;
	public void setHigadoEnfermo(boolean h){
		higado = h;
	}
	public boolean getHigadoEnfermo(){
		return higado;
	}
}
class Rinon{
	private boolean rinon;
	public void setRinonEnfermo(boolean r){
		rinon = r;
	}
	public boolean getRinonEnfermo(){
		return rinon;
	}
}
class Pulmon{
	private boolean pulmones;
	public void setPulmonEnfermo(boolean p){
		pulmones = p;
	}
	public boolean getPulmonEnfermo(){
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
			System.out.println("\nUsted necesita estudios médicos para saber de donde proviente el dolor...");
		}
	}
	public void revisarCora(Corazon a){
		if(!a.getCorazonEnfermo()){
			System.out.println("\nRevisando corazón... Usted tiene la presion normal.");
		}
		else{
			a.setCorazonEnfermo(true);
			System.out.println("\nRevisando cor... Necesitamos una reanimación!!!");
		}
	}
	public void revisarHigado(Higado a){
		if(!a.getHigadoEnfermo()){
			System.out.println("\nRevisando hígado... Usted tiene su hígado en buen estado.");
		}
		else{
			a.setHigadoEnfermo(true);
			System.out.println("\nRevisando hígado... Deje de tomar refresco!!!");
		}
	}
	public void revisarRinon(Rinon a){
			if(!a.getRinonEnfermo()){
				System.out.println("\nUsted tiene su riñon en buen estado.");
			}
			else{
				a.setRinonEnfermo(true);
				System.out.println("\nRevisando rin... Oh no, necesita operación de urgencia!!!");
			}
	}
	public void revisarPulmon(Pulmon a){
			if(!a.getPulmonEnfermo()){
				System.out.println("\nRevisando pulmones... Usted tiene buena oxigenación");
			}
			else{
				a.setPulmonEnfermo(true);
				System.out.println("\nRevisando pulmones... Usted necesita tanque de oxigeno.");
			}
	}
	}
}