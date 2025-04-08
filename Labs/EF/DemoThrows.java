public class PropagaExcepcion2{
	public static int miMetodo(int a, int b)throws ArithmeticException{
		if(b==0)throw new ArithmeticException

		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		int resultado=miMetodo(10,0)
		System.out.println("R="+ resultado);	
	}
}