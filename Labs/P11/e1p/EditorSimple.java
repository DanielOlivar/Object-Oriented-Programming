import java.io.*;
/**
 * @author Axel Daniel Becerril Olivar
 * */
public class EditorSimple{
    /**
    * @param leer son los datos que recibe la función principal main 
    * */
    public static void main(String [] leer) throws IOException { 
        String str[] = new String[100];
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Escriba varias lineas de texto."); 
            System.out.println("Escriba 'stop' para salir."); 

            for(int i=0; i<100; i++) { 
            str[i] = br.readLine(); 
            if(str[i].equals("stop")) 
                break; 
            }
            System.out.println("\nEl archivo generado es:");
            for(int i=0; i<100; i++) { 
                if(str[i].equals("stop")) 
                    break;
                System.out.println(str[i]); 
            }
            
            FileWriter p11 = new FileWriter("Practica11.txt");
            /**
             * @param p11 
             * Es nuestro archivo creado como objeto
             * */
            BufferedWriter bw = new BufferedWriter(p11);
            /**
             * @param bw
             * Es el buffer que se utiliza para el texto
             * */
            PrintWriter salida = new PrintWriter(bw);

            for(int i=0; i<100; i++) { 
                if(str[i].equals("stop")) 
                    break;
                /**
                 * @param str[i]
                 * Es la cadena de texto que recibio del teclado
                 * */
                salida.println(str[i]);
            }
            salida.close();
        }catch(IOException ioe){
            System.out.println("\n\nError al abrir o guardar el archivo");
            ioe.printStackTrace();

        }catch(Exception e){
        /**
        *@param e 
        * Se utiliza para desplegar en pantalla que ocurrió un error al leer del teclado 
        * */
            System.out.println("\n\nError al leer de teclado");
            e.printStackTrace();
        }
    }


}