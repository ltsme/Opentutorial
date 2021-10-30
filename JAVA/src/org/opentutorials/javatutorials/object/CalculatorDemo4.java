package org.opentutorials.javatutorials.object;

class C1{

	static int static_variable = 1; // 클래스 변수
	int instance_variable = 2; // 인스턴스 변수
	
	static void static_static() { // 클래스 메소드
		System.out.println(static_variable); // 클래스 메소드에서 클래스 변수 접근.
	}
	
	static void static_instance() { // 클래스 메소드
		// System.out.println(instance_variable); // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
	}
	
	void instance_static() { // 인스턴스 메소드
		System.out.println(static_variable); // 인스턴스 메소드에서 클래스 변수에 접근 할 수 있다.
	}
	
	void instance_instance() { // 인스턴스 메소드
		System.out.println(instance_variable); // 인스턴스 메소드에서 인스턴스 변수에 접근 할 수 있다.
	}	
}

public class CalculatorDemo4 {
	
	public static void main(String[] args) {
		C1 c = new C1();
		
		c.static_static();
		c.static_instance();
		
		c.instance_static();
		c.instance_instance();
		
		
		C1.static_static();
		C1.static_instance();	
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		// C1.instance_static(); 
	}
}
