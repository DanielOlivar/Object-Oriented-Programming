import java.io.File;
class listDir{
	public static void main(String[] args) {
		String dirname = "../File";
		File f1=new File (dirname);
		if(f1.isDirectory()){
			System.out.println("Carpeta" +f1.getName());
			String s[]=f1.list();
			for (int i=0;i<s.lenght ;i++ ) {
				File f= new File(dirname + "/"+s[i]);
				if(f.isDirectory()){
					System.out.println(s[i]+ "es carpeta");
				} 	else {
					System.out.println(s[i]+" es un archivo");
				}
			} 
		}else{
			System.out.println(dirname+"no es una carpeta");
		}
	}
}