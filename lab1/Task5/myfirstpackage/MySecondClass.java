package myfirstpackage;
public class MySecondClass{

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
