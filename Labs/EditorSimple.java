import java.io.*;
class EditorSimple {
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)); 
        String str[] = new String[100];
        
        System.out.println("Escriba varias lineas de texto."); 
        System.out.println("Escriba 'stop' para salir."); 

        for(int i=0; i<100; i++) { 
            str[i] = br.readLine(); 
            if(str[i].equals("stop")) 
                break; 
        }
        /*FileWriter p11 = new FileWriter("prac11.txt"); 
        for (int i=0; i <= 50; i += 2) {
            p11.write(str[i]); 
        } 
        p11.close();*/

        System.out.println("\nEl archivo generado es:");
        for(int i=0; i<100; i++) { 
            if(str[i].equals("stop")) 
                break; 
            System.out.println(str[i]); 
        }
        FileWriter p11 = new FileWriter("prac11.txt"); 
        for (int i=0; i <= 50; i += 2) {
            p11.write(str[i]); 
        } 
        p11.close();
    }
}
