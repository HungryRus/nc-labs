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
	class MySecondClass{

	private int a;
	private int b;

public MySecondClass(int a, int b){
	this.a=a;
	this.b=b;
} 	

public int getA(){

	return a;
}

public void setA(int a){
	if (a>0)

	this.a=a;
else
	System.out.println("Ошибка");
	}

public int getB(){

	return b;
}

public void setB(int b){
	if (b > 0)

	this.b=b;
else
	System.out.println("Ошибка");
}

public int sumAB(){

	return this.a+this.b;
		}
}


