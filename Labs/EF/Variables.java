class Variables{
	public static void main(String[] args) {
		float x=3f;
		float y=2.6f;
		for (int i=0;i<=3 ;i++ ) {
			float z=0;
			z-=(x*i)+(y/i);
		}
		System.out.println("z= "+z);
	}
}