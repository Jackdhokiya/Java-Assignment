package JavaAssignment;
import java.util.Scanner;

public class FunctionInJavaAssignment {

	public static void main(String[] args) {
	
		FunctionInJavaAssignment obj = new FunctionInJavaAssignment();
			int s = obj.sum();
			System.out.println("Sum is :" + s);//Q.1
		
		System.out.println("************************");	
			int m = obj.mul(5, 7);
			System.out.println("Ans is :" + m);//Q.2
//			int m1 = obj.mul(8,8);
//			System.out.println(m1);
		
		System.out.println("************************");
			obj.radius();//Q.3
		
		System.out.println("************************");	
			obj.max(20, 30, 40);// Q.4
			obj.min(60, 50, 70);//Q.4
	   
		System.out.println("************************");	
			obj.EvenOdd(10);//Q.5
			obj.EvenOdd(13);
		
		System.out.println("************************");	
		    obj.Voter(20);//Q.6
		    obj.Voter(15);
		    
		System.out.println("************************");	
				    obj.Prime(10);//Q.7

		System.out.println("************************");	   
		    obj.GetGrade("Naveen",95);//Q.8
		    obj.GetGrade("Janak",85);
		    obj.GetGrade("Ram",75);
		    obj.GetGrade("Mann",65);
		    obj.GetGrade("Radha",55);
		    obj.GetGrade("Paru",45);
		    obj.GetGrade("Neel",35);
		    
		    
		    
	    System.out.println("************************");	    
		System.out.println("Q.9 Write a program to print the factorial of a number by defining a method named 'Factorial'.");

		    System.out.println(obj.Factorial(5));
		    System.out.println(obj.Factorial(10));
	
	
	
	
	}
	public int sum() {
		System.out.println("Q.1 Write a program to print the sum of two numbers entered by user by defining your own method.");
	
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;	
	}
	
	public int mul(int x , int y) {
		
		System.out.println("Q.2 Define a method that returns the product of two numbers entered by user.");
		int m = x*y;
		return m;
		
	}
	
	public void radius(){
	    System.out.println("Q.3 Write a program to print the circumference and area of a circle of radius entered by user by defining your own method");
	    int radius = 2;
	    System.out.println("Circumference is "+(2*3.14*radius)+" and area is "+(3.14*radius*radius));
	    
	
	}
	public void max(int x ,int y ,int z) {
		System.out.println("Q.4 Define two methods to print the maximum and the minimum number respectively among three numbers entered by user");
                
				if (x >= y && y >= z) {
					System.out.println("X is greatest");
				}
				else if (y>z) {
					System.out.println("Y is greatest");
				}
				else 
					System.out.println("z is greatets");
				
		
	}
	public void min(int x ,int y ,int z) {
		if (x<= y && y<=z) {
			System.out.println("X is lowest");
		}
		else if (y<z) {
			System.out.println("Y is lowest");
		}
		else 
			System.out.println("Z is lowest");
			
			
	}
		
	public void EvenOdd(int x) {
		
		if(x % 2 == 0) {
			System.out.println("Q.5 Define a program to find out whether a given number is even or odd.");
			System.out.println(x + ": is Even number");
		}
		
		else 
			System.out.println(x + ": is Odd number");
		}
		
	 public void Voter(int i) {
		 		 
		 if (i >= 18) {
			 System.out.println("Q.6 Define a method to find out if he/she is elligible to vote on the basis of age of 18");
			 System.out.println("Voter is eligible for vote");
		 }
		 else 
			 System.out.println("Voter is not eligible for vote");
		 }
		 
    public void Prime(int n) {
    	
    	int i, m=0 ,flag=0;
    	System.out.println("Q.7 Define a method to find out if number is prime or not.");	
    	 if(n==0||n==1){  
    		   System.out.println(n+" is not prime number");      
    		  }
    	 else{  
          for(i=2;i<=m;i++){      
    		if(n%i==0){      
    		     System.out.println(n+" is not prime number");      
    		     flag=1;      
    		     break;      
    		    }      
    		   }      
    		if(flag==0)  { System.out.println(n+" is prime number"); }  
    		  }//end of else  
    }
    
		public void GetGrade(String name , int marks) {
			
		
		if (marks >= 91) {
			System.out.println("Q.8 Write a program get the grade from out of 100 marks:");
			System.out.println(name + " got AA grade");
 		}
		else if (marks <= 90 && marks >= 81) {
			System.out.println(name + " got AB grade");
		}
		else if (marks<= 81 && marks >= 71) {
			System.out.println(name + " got BB Grade");
		}
		else if (marks<=70 && marks >=61) {
			System.out.println(name + " got BC Grade");
		}
		else if (marks<=60 && marks>=51) {
			System.out.println(name + " got CD Grade");
		}
		else if (marks<=50 && marks >= 41) {
			System.out.println(name + " got DD grade");
		}
		else 
			System.out.println(name + " is Fail");
		}
		
	public int Factorial(int x) {

		if(x == 0 || x == 1){
			
		      return 1;
		    }
		    else{
		      return Factorial(x-1)*x;
		
	}
	
    }
	

}
