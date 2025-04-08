class Estructuras{
	public static void main(String[] args){
		boolean opcion=true;
		uno:{
			dos:{
				tres:{
					System.out.println("B3");
					if(opcion) break dos;
					System.out.println("Break");
				}
				System.out.println("Desp b3");	
			}
			System.out.println("B1");
			return;
		}
	}
}