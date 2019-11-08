import myfirstpackage.*;

class MyFirstClass {

	public static void main(String[] s) {
		int i, j;

		MySecondClass o = new MySecondClass(3,4);

		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {

				o.setA(i);
				o.setB(j);

				System.out.print(o.sumAB());

				System.out.print(" ");
			}	

			System.out.println();
		}
	}
}

