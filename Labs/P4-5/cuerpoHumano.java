/*public class Humano{
	public int corazon;
	public int pulmon;
	public int rinon;
	public int higado;

	public humano(){
		System.out.println("Constructor de Humano.");
		higado=0;
		rinon=0;
		pulmon=0;
		corazon=0;
	}
}*/


/*public class Higado extends Humano{
	int higado=1;

	public Higado(){
		this.higado=higado;
		System.out.println("Debe decirle al doctor que en sus estudios obtuvo 1...");
	}

	public static void main(String[] args){
		Higado hig = new Higado();
	}
}*/



/*public class Rinon extends Humano{
	int rinon=0;
	public Rinon(){
		this.rinon=rinon;
		System.out.println("Debe decirle al doctor que en sus estudios obtuvo 0...");
	}
}*/

/*public class Pulmon extends Humano{
	int pulmon=1;
	public Pulmon(){
		this.pulmon=pulmon;
		System.out.println("Debe decirle al doctor que en sus estudios obtuvo 1...");
	}
}*/

/*public class Corazon extends Humano{
	int higado=0;
	public Corazon(){
		this.corazon=corazon;
		System.out.println("Debe decirle al doctor que en sus estudios obtuvo 0...");
	}
}*/

/*public class revisarPasiente extends Humano{
	
	
}*/
public class Medico extends revisarPasiente{
	String nombre;
	int edad;
	int numIdentificacion;
	public Medico(String nombre, int edad, int numIdentificacion){
		this.nombre= nombre;
		this.edad= edad;
		this.numIdentificacion=numIdentificacion;
	}


	public static void main(String[] args){
		Medico med = new Medico("Jesus Maldonado", 68, 190826);
		if(corazon==1){
		System.out.println("Revisando corazón... Usted tiene la presion normal.\n");
		}else{
			System.out.println("Necesitamos una reanimación...");
		}
		if(pulmon==1){
			System.out.println("Revisando pulmones... Usted tiene buena oxigenación");
		}else{
			System.out.println("Revisando pulmones... Usted necesita tanque de oxigeno.\n");
		}
		if(higado==1){
			System.out.println("Revisando hígado... Usted tiene su hígado en buen estado, tome más agua.\n");
		}else{
			System.out.println("Revisando hígado... Deje de tomar refresco!!!");
		}
		if(rinon==1){
			System.out.println("Usted tiene su riñon en buen estado.");
		}else{
			System.out.println("Revisando riñ... Oh no, necesita operación de urgencia!!!\n");
		}	
	}
}
