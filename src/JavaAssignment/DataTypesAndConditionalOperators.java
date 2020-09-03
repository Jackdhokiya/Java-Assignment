package JavaAssignment;

public class DataTypesAndConditionalOperators {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Naveen K";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("***********");
		int c = 74;
		int d = 36;
		
		System.out.println(c+d);
		
		System.out.println("***********");
		
		int e = 50;
		int f = 3;
		System.out.println(e/f);
		
		System.out.println("***********");
		
		int g = -5;
		int h = 8;
		int i = 6;
		int j = 9;
		int k = 55;
		int l = 2;
		int m = 15;
		
		System.out.println(g+h*i);
		System.out.println("***********");
		
		System.out.println((k+j)%j);
		System.out.println("***********");
	
		System.out.println(20+-3*5/h);
		System.out.println("***********");
		
		System.out.println(5+m/3*l-8%3);
		System.out.println("***********");
		
		double b1 = 25.5;
		double b2 = 3.5;
		double b3 = 40.5;
		double b4 = 4.5;
		
		System.out.println((b1*b2-b2*b2)/(b3-b4));
		System.out.println("***********");
		
		char c1 ='t';
		
		System.out.println("Hello Selenium: "+c1);
		
		System.out.println("***********");
		
		int a2= 100;
		int a3 = 200;
		int a4 = 3400;
		
		System.out.println("Your total amount is: " + (a2+a3+a4));
		System.out.println("***********");
		
		
		byte b5 = 065;
		System.out.println(b5);	
		System.out.println("***********");
		
		
		int a5 = 25;
		int a6 = 78;
		int a7 = 87;
		
		if (a5>a6 && a6>a7) {
			System.out.println("The greatest: "+a5);
		}
		else if(a6>a7 && a7>a5) {
			System.out.println("The greatest: "+ a6);
		}
		
		else {
			System.out.println("The greatest:" + a7);
		}
				
		System.out.println("***********");
		
		int x = 35;
		int y = -11;
		int z = 0;		
		
		if (x>=z) {
			System.out.println("The number is positive");
		}
		else{
			System.out.println("The number is negative");
		}
		 if (y<=z) {
			 System.out.println("The number is negative");
			 
		 }
		 else {
			 System.out.println("The number is positive");
		 }
		
		
		


	}

}
