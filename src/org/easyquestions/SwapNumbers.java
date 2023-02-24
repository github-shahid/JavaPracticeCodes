package org.easyquestions;

//Date: 24-02-2023 
//Swap two numbers without using 3rd variable is three-step process 
//that’s better visualized in code:
/**
 * b = b + a; // now b is sum of both the numbers 
 * a = b - a; // b - a = (b + a)- a = b (a is swapped) 
 * b = b - a; // (b + a) - b = a (b is swapped)
 * @author Shahid;
 */

public class SwapNumbers {
	public static void main(String[] args) {	
		int a = 10;
		int b = 20;
		System.out.printf("a = %d\nb = %d\n",a ,b);
		
		a = b + a;
		System.out.printf("First approch: a = b + a\na = %d\nb = %d\n",a ,b);
		b = a - b;
		System.out.printf("Second approch:  b = b - a\na = %d\nb = %d\n",a ,b);
		a = a - b;
		System.out.printf("Third approch:	a = a - b\na = %d\nb = %d\n\n",a ,b);
		System.out.printf("After swapping: \na = %d\nb = %d\n",a ,b);
	}
}
