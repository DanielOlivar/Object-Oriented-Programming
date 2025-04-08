public class Main extends Television{
/**
 * @author Axel Daniel Becerril Olivar
 * */
	public static void main(String[] args){
/**
 * @param args es una cadena de arreglos que recibe la funcion
 * 
 * */
		Decodificador dec = new Decodificador();
		Television tele = new Television();
		dec.prender();
		dec.tipoSenal();
		tele.prender();
		tele.tipoSenal();
		tele.apps();
		tele.internet();
		tele.asistenteVirtual();
		tele.smartTv();
		tele.apagarse();
		dec.apagarse();
	}
}
	