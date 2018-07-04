package com.hdfc.loans.businessloans;

public class BusinessClass {
	public void m()
	{
		int p=10;
		int c=20;
		int m=0;
		m=c+p;
		System.out.println("p,c,m are medicines");
	}
	public void g()
	{
		int a=50;
		int b=60;
		int c=80;
		int d=0;
		d=a+b+c;
		System.out.println("d is addition of a,b,c:" +d);
		
	}
	public void f()
	{
		int a=5;
		int b=6;
		int g=7;
		int w=0;
		int h=3;
		int i=0;
		i=g-h;
		 w=g+a+b;
		 System.out.println("w is add of a,b,g:" +w+" ,i is sub of g,h:"+i);
		
	}
	public static void main(String[] args) {
		System.out.println("business loans");
		BusinessClass obj = new BusinessClass();
		obj.f();
		obj.g();
		obj.m();
		

	}

}
