import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Axel Daniel Becerril Olivar
 * */
public class LeeTecladoCompleto{
	/**
 	* @param leer son los datos que recibe la función principal main
 	* 
 	* */
	public static void main(String [] leer){
		String texto="";
		try{
			BufferedReader br;
			/**
			 *@param texto 
			 * */
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribir texto:");
			texto = br.readLine();

			System.out.println("\n\nEl texto separado por espacios es: ");
			/**
			 * @param texto 
			 * Recibe como paramétro el texto que se ingresó a través del teclado
			 * */
			StringTokenizer st=new StringTokenizer(texto);
			while (st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
		/**
 		*@param e 
 		* Se utiliza para desplegar en pantalla que ocurrió un error al leer del teclado 
		* */
		}catch(Exception e){    
				System.out.println("\nError al leer del teclado");
				e.printStackTrace();
			}
	}
}