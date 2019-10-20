class MyFirstClass {

	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(5, 5);
		
		int i, j;
		
		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				o.setA(i);
				o.setB(j);

				System.out.print(o.sum());

				System.out.print(" ");
			}
			System.out.println();
		}
	}
} 	


class MySecondClass {
	private int a;	 	 
	private int b;
	
	public MySecondClass(int a, int b) {	
		this.a = a; 
		this.b = b; 
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a; 
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b; 
	}

	public int sum() {
		return a + b;	
	}
}   
