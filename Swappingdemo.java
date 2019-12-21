package javaproject;

public class Swappingdemo {

	public static void main(String[] args) {
		System.out.println("Before swapping");
		int x =10;
		int y=20;
		System.out.println("VALUE OF X:" +x);
		System.out.println("VALUE OF y:" +y);
		System.out.println("After Swapping");
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("VALUE OF X:" +x);
		System.out.println("VALUE OF y:" +y);
		

	}

}
