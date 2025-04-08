class AnimalAcuatico{
	private String color;
	private double tamaño;
	public void yoSoy(){
		System.out.println("Soy un animal acuatico");
	}
	public void nadar(){
		System.out.println("Nadando");
	}
}
class Delfin extends AnimalAcuatico{
		public void yoSoy(){
			System.out.println("sOY DELFIN");
		}
		public void usarRadar(){
			System.out.println("Busvando");
		}
}
class PruebaDelfin{
	public static void main(String[] args) {
		AnimalAcuatico flipper= new Delfin();
		flipper.yoSoy();
	}
}