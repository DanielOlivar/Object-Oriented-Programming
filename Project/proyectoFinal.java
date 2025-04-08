/**
 * @author Becerril Olivar Axel Daniel
 * @author Hernández Alejo Ximena Gizel
 * @author Solorio Garduño Alexis Jair
 * @author Olguín Ramirez Azul
 * */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.*;
import javax.swing.JFileChooser;
public class proyectoFinal{
	/**
	 * @param args
	 * Recibe como parámetro una cadena de texto
	 * */
	public static void main(String[] args) throws IOException,FileNotFoundException, Exception {
		boolean salir = false;
		do{
			Scanner men = new Scanner(System.in);
			int opcion;
			System.out.println("\n\n\tDiario electronico.");
			System.out.println("\nMenu principal.");
			System.out.println("\n1. Comando Vi");
			System.out.println("2. Comando Tree");
			System.out.println("3. Comando Cat");
			System.out.println("4. Comando Find");
			System.out.println("5. Comando Grep");
			System.out.println("6. Salir");
			System.out.println("\nEscribe una opcion: ");
			opcion = men.nextInt();
			/**
			 * @param opcion
			 * Recie como parámetro el valor ingresado por el usuario para desplegar el menú
			 * */
			if(opcion==1){
				System.out.println("\n\n1. Comando Vi");
				/*Objeto creado de la clase Comando*/
        		Comando vi = new Comando();
        		/*Objeto creado de la clase Archivos*/
        		Archivos a = new Archivos();
        		/*Objeto creado de la clase Datos*/
        		Datos d = new Datos();
        		File ruta=new File("Diario");
        		System.out.println("Nombre usuario: " + d.nombreUsuario());
        		System.out.println("\nDireccion actual: " + ruta.getAbsolutePath());
       			String nombreArchivo;
        		Scanner teclado = new Scanner(System.in);
        		System.out.println("\nIngrese el nombre de su archivo con el siguiente formato dd_mm_aaaa");
        		nombreArchivo = teclado.nextLine();
        		vi.comandoVi(nombreArchivo, ruta.getAbsolutePath());
			}else if(opcion==2){
				System.out.println("\n\n2. Comando Tree");
				/**
				 * @param proyectoFinal.java
				 * Es el archivo al cual obtendremos la ruta
				 * */
				File archivo=new File("proyectoFinal.java");
				System.out.println("\nLa ruta absoluta del codigo es: "+archivo.getAbsolutePath());
                /**
                 * @param Diario
                 * Es la carpeta a la cual obtendremos la ruta
                 * */
				File ruta=new File("Diario");
				System.out.println("\nLa ruta absoluta de la carpeta es la siguiente: ");
				System.out.println(ruta.getAbsolutePath());
				System.out.println("\n\nLos archivos que hay dentro de la carpeta son los siguientes: ");
				String[] nombre_archivos= ruta.list();
				int contador1=0;
				int contador2=0;
				int total=0;
				for(int i=0; i<nombre_archivos.length;i++){
					System.out.println("\nArchivo "+(i+1)+". "+nombre_archivos[i]);
					contador1+=1;
					/**
					 * @param ruta.getAbsolutePath()
					 * Obtiene la ruta en la cual se trabaja
					 * @param nombre_archivos[i]
					 * Recibe el nombre del archivo de la carpeta
					 * */
					File arch_carpeta = new File(ruta.getAbsolutePath(), nombre_archivos[i]);
					if (arch_carpeta.isDirectory()){
						String[] arch_subcarpeta=arch_carpeta.list();
						System.out.println("\nSe encontro una carpeta, en esta carpeta se encontraron los siguientes archivos: ");
						for (int j=0; j<arch_subcarpeta.length;j++){
							contador2+=1;
							//System.out.println("\nSe encontro una carpeta, en esta carpeta se encontraron los siguientes archivos: ");
							System.out.println("\nArchivo "+(j+1)+". "+arch_subcarpeta[j]);
						}
						System.out.println("\n\tFin del contenido de la carpeta.");
					}
				}
				total=contador1+contador2;
				/**
				 * @param total
				 * Es el numero de archivos que hay en la carpeta.
				 * */
				System.out.println("\nEn total hay "+total+" archivos.");
				System.out.println("\n\nEsos fueron todos los archivos encontrados incluyendo carpetas.");
			}else if(opcion==3){
				System.out.println("\n\n3. Comando Cat\n");
				Pr f = new Pr();
        		f.cat("archivo.txt","archivo2.txt",'a');
			}else if(opcion==4){
				System.out.println("\n\n4. Comando Find");
				String entradaABuscar;
        		Scanner sc=new Scanner(System.in);
        		File ruta = new File("Diario");
        		System.out.println("De quE dIa quiere buscar la entrada de su diario? Recuerde quue debe ir de la forma dd_mm_aaaa.txt");
           		entradaABuscar=sc.next();
        		File f = new File(ruta, entradaABuscar);
        		System.out.println(f.getAbsolutePath());
        		System.out.println(ruta.getAbsolutePath());
        		if (!f.exists()) {  //se comprueba si la entrada de ese día existe o no
            		System.out.println("La entrada del dia " + f.getName() + " no existe");
            		if (!ruta.exists()) {  //se comprueba si la ruta existe o no
                		System.out.println("El directorio " + ruta.getName() + " no existe");
                		} else {
                    		System.out.println("No se ha creado aUn" + ruta.getName());
                		}
        		} else { //la entrada existe. Mostramos el tamaño
            		System.out.println("La entrada del dIa " + f.getName() + " existe");
            		System.out.println("Tiene un tamaNio de " + f.length() + " bytes");
        		}
					}else if (opcion==5){
						System.out.println("5. Comando Grep");
						Scanner entrada = null;
        				String linea;
        				int numeroDeLinea = 1;
        				boolean contiene = false;
        				Scanner sc = new Scanner(System.in);
        				JFileChooser j = new JFileChooser(); //Linea para seleccionar el archivo
        				j.showOpenDialog(j);
        				System.out.print("Introduce texto a buscar: ");//Introducimos la palabra que queramos buscar
        				String texto = sc.nextLine();
        				try {
            				String ruta = j.getSelectedFile().getAbsolutePath();//guardamos el path de la entrada en la variable ruta
            				File f = new File(ruta);//creamos un objeto File asociado a la entrada seleccionada
										entrada = new Scanner(f);
            				System.out.println("Entrada: " + f.getName()); //mostramos el día de la entrada
            				System.out.println("Texto a buscar ''" + texto + "'' en la entrada del dIa " + f.getName()); //mostramos el texto a buscar
            				while (entrada.hasNext()) { //mientras no se llegue al final de la entrada
		                		linea = entrada.nextLine();  //se lee una línea
        		        		if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
                		    		System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    				contiene = true;
                				}
                				numeroDeLinea++; //se incrementa el contador de líneas
            				}
            				if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
                				System.out.println(texto + " no se ha encontrado en la entrada");
            				}
        				} catch (FileNotFoundException e) {
            				System.out.println(e.toString());
        				} catch (NullPointerException e) {
            				System.out.println(e.toString() + "No ha seleccionado ninguna entrada");
        				} catch (Exception e) {
            				System.out.println(e.toString());
        				} finally {
            				if (entrada != null) {
                				entrada.close();
            				}
        				}
			}else if (opcion==6){
				System.out.println("\n\n!!!Gracias por utilizar el diario electronico!!!");
				salir = true;
			}
		}
		while(!salir);
	}
}
class Comando{
    /**
     * @param nombreArchivo
     * @param ruta
     * @throws IOException
     * @throws Exception
     * */
    void comandoVi(String nombreArchivo, String ruta)throws IOException,Exception{
        /*Objeto creado de la clase Archivos*/
        Archivos a = new Archivos();
        /*Objeto para leer desde consola*/
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        int uso = 0;
        System.out.println("\nPara salir sin guardar el texto escriba ':q!'");
        System.out.println("\nPara guardar cambios y salir escriba ':wq'");
        System.out.println("\nRedacte su texto:");
        for(int i=0; i<100; i++){
            str[i] = bR.readLine();
            if(str[i].equals(":wq")||str[i].equals(":q!")){
                if(str[i].equals(":q!"))
                    uso = i;
                break;
            }
        }
        if(str[uso].compareTo(":q!") != 0){
            for(int i=0; i<100; i++){
                if(str[i].equals(":wq"))
                    break;
                if(i == 0)
                    a.escribirArchivo(nombreArchivo, ruta, str[i], 'w');
                else
                    a.escribirArchivo(nombreArchivo, ruta, str[i], 'a');
            }
        }
    }

}
class Archivos{
    /**
     * @param ruta
     * @param nombre
     * @throws IOException
     * @throws Exception
     *
     * */
    public void crearArchivo(String nombre, String ruta)throws IOException, Exception{
        /*Objeto de tipo File */
        File f = new File(nombre + ".txt");
        if(f.exists()){
            f.createNewFile();
            System.out.println("");
        }else{
            if(!f.exists()){
            f.createNewFile();
            System.out.println("");
            }
            else
                throw new ArchivosError();
        }
    }
    /**
     * @param nombre
     * @param texto
     * @param ruta
     * @param modo
     * @throws IOException
     * */
    public void escribirArchivo(String nombre, String ruta, String texto, char modo)throws IOException{
        /*Objeto de tipo File */
        File f = new File(nombre + ".txt");
        if(modo == 'a'){
            /*Objeto Tipo FileWriter*/
            FileWriter fW = new FileWriter(f,true);
            /*Objeto Tipo BufferedWriter*/
            BufferedWriter bW = new BufferedWriter(fW);
            /*Objeto Tipo PrintWriter*/
            PrintWriter pW = new PrintWriter(bW);
            pW.append(texto + "\n");
            pW.close();
            bW.close();
            fW.close();
        }
        else{
            if(modo == 'w'){
                /*Objeto Tipo FileWriter*/
                FileWriter fW = new FileWriter(f);
                /*Objeto Tipo BufferedWriter*/
                BufferedWriter bW = new BufferedWriter(fW);
                /*Objeto Tipo PrintWriter*/
                PrintWriter pW = new PrintWriter(bW);
                pW.append(texto + "\n");
                pW.close();
                bW.close();
                fW.close();
            }
        }

    }
}

class Datos{
    /*Metodo que nos devuelve el usuario*/
    public String nombreUsuario(){
        return System.getProperty("user.name");
    }
    /*Metodo que devuelve la direccion donde se guarda el archivo*/
    public String dir(){
        return System.getProperty("user.dir");
    }
}
/*Excepcion en caso de haber un error al crear el archivo*/
class ArchivosError extends Exception{
    ArchivosError(){
         super("No se creo el archivo");
    }
}




/**
 * @param nombreArch , este es el nombre del primer archivo
 * @param nombreArch2, este es el nombre del segundo archivo
 * @param mode , una variable que nos yuda para saber si el documento contien informacion o no
 * @throws IOException
 *
 *
*/
class Pr{

	void cat(String nombreArch,String nombreArch2,char mode)throws IOException{
        Utilidades a = new Utilidades(); // se crea un objeto de la clase Utilidades
        String texto = ""; // la variable en donde se va a guardar el contenido del primer archivo.
        String texto2 = ""; // la variable en donde se va a fuardar la informacion del segundo archivo
        a.crearArchivo("archivo3.txt");// se crra un archivo
        texto = a.leerArchivo(nombreArch); //  hace uso del metodo leerArchivo definido dentro de la clase Utilidades , recibe el nombre del archivo.
        a.escribirArchivo(nombreArch2,texto,mode); // para concatenar lo que se encuentra en el texto nombreArch al archivo destino nombreArch2
        texto2 = a.leerArchivo(nombreArch2);  // comprobar que en realidad si se concateno el archivo
        a.escribirArchivo("archivo3.txt",texto2,mode); // se concatenan los dos archivos en uno nuevo
    }

}

/**
 * @param nombre, el nombre que quieres que tenga el archivo nuevo
 * @throws IOException
*/

class Utilidades{

    public void crearArchivo(String nombre)throws IOException{
        try{
            File f = new File(nombre); //objeto de tipo file
            if (!f.exists()) { // para saber que el archivo no existe para crearlo
                f.createNewFile();
                System.out.println("Su archivo ha sido creado\n");  // una bandera para saber que en realidad ya existe el archivo
            }
        }catch(IOException e){}
    }

/**
 * @param nombre, el nombre del archivo que quieres que lea
*/
     public String leerArchivo(String nombre)throws FileNotFoundException,IOException{


        /* se crea un objeto de tipo file , FileReader y BufferedReader; los cuales se van a encargar de poder hacer una
         lercuta eficiente y mostrarla en pantalla
        */
            File f=new File(nombre);
            FileReader r  = new FileReader(f);
            BufferedReader br=new BufferedReader(r);

        /* Se crea otro objeto de las mismas clases de la de arriba esto para no interferir es su funcionamineto , solo que esta no va a ser
        precisamente para leer si no para conseguir la infprmacion del documento y gusradarla en una variable */

            File ff=new File(nombre);
            FileReader rr  = new FileReader(f);
            BufferedReader bbr= new BufferedReader(rr);


            String t= bbr.readLine();// para guardar la informacion en la variable


            String texto=br.readLine(); // para llevar a cabo la lectura

            while(texto != null){
                System.out.println(texto);
                texto = br.readLine();
            }
            br.close();
            r.close();

            return t;  // retornamos la variable en donde se supone se guarda la informacion del archivo

    }

/**
 * @param nombre , nombre del archivo en el que quieres escribir
 * @param texto , la variable que guarda la informacion del archivo
 * @param mode , una variable que nos yuda para saber si el documento contien informacion o no
 * @throws IOException
 */

    public void escribirArchivo(String nombre,String texto,char mode)throws IOException{
        File archivo=new File(nombre); // se crea un objeto de tipo file
        if(mode=='a'){ //archivo contiene informacion
            /* se usan las clases FileWriter, BufferedWriter y PrintWriter ; utilizamos estas clases para poder hacer una
            eficiente escritura  */
                FileWriter w=new FileWriter(archivo,true);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
                wr.append(texto+"\n");// con el metodo append anexamos la información que queremos escribir
                wr.close();
                bw.close();
                w.close();//cerramos el modo escritura del archivo
        }else if(mode =='w'){ //archivo no contien informacion
                FileWriter w=new FileWriter(archivo);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
                wr.write(texto+"\n");
                wr.close();
                bw.close();
                w.close();//cerramos el modo escritura del archivo
        }
    }

}
