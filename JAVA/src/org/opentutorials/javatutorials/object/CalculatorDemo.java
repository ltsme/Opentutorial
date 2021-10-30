package org.opentutorials.javatutorials.object;

class Calculator{	
	static double PI = 3.14;
	static int base = 0;
	
	private int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
		Calculator.base = 100;
		c2.sum();
		c2.avg();
		
		System.out.println(Calculator.PI);
	}
}
