package JavaAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayAndArrayList{

	public static void main(String[] args) {
	
		System.out.println("Question 1: Write a program to print the following pattern using for loop:\r\n");

				for(int p=0; p<=3; p++){
					
					for(int q=0; q<=9; q++){
						
						System.out.print(p+""+q + " ");//00 01 02 03 04 05 06...09 
					}
					
					System.out.println();
				}
		
		System.out.println("********************************************************************************");
		
		System.out.println("Question 2: Write a program to create a static Array, having following cricket data:\r\n" + 
				"A.name, age, team name, DOB, gender, Strike Rate\r\n" + 
				"B.Try to create multiple Object Arrays for different players \r\n" + 
				"C.Try to print all the values of each player on the console");
		
		System.out.println("Answer");
		
		Object player[] = new Object[6];
		
		player[0]= "Dhoni";
		player[1]= 35;
		player[2]= "India";
		player[3]=11/07/1982;
		player[4]= 'M';
		player[5]=88.95;
				
		for (int p = 0; p<player.length; p++) {
			
		System.out.println(player[p]);
		}
		System.out.println("************");
		
		Object player1[] = new Object[6];
		
		player1[0] = "Virat";
		player1[1] = 30;
		player1[2] = "India";
		player1[3] =10/05/1989;
		player1[4] ='M';
		player1[5] = 110.15;		
		
	     for (int p1=0; p1<player1.length; p1++) {	
	     System.out.println(player1[p1]);	
	     }
	     System.out.println("*********************");
	      
	     Object player2[] =new Object[6];
		
		player2[0] = "Smriti Mandhana";
		player2[1] = 29;
		player2[2] = "India";
		player2[3] =10/10/1990;
		player2[4] ='F';
		player2[5] = 95.15;
		
		for (int p2=0;p2<player2.length; p2++) {
			System.out.println(player2[p2]);
			
		}
		
		System.out.println("*********************");
		
		System.out.println("Question 3: Try to print the following pattern on the console:n=4,n=3,n=2,n=1,n=0!!");
		
		String s []= new String [5];
		s[0]="n=4";
		s[1]="n=3";	
		s[2]="n=2";
		s[3]="n=1";
		s[4]="n=0";
		
		for(int i=0;i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("*********************************************************************************************************");
		
		System.out.println("Q.1 Write a Java program to create a new array list, add some colors (string) and print out the collection");
		
		ArrayList<String> cl = new ArrayList<String>();
		cl.add("white");
		cl.add("Black");
		cl.add("yellow");
		cl.add("Blue");
		
		for(int c =0;c<cl.size();c++) {
			System.out.println(cl.get(c));
		
		}	
		System.out.println("*****************************************************************************************************");	
		
	    System.out.println("Q.2 Write a Java program to insert an element into the array list at the first and last positions");
		
	    System.out.println("Before insert: " +cl);
		
		cl.add(0,"Orange");
		cl.add(5, "Green");
		System.out.println("After insert: " + cl);{
			
		//for (int i=0;i<cl.size();i++) {
			 // System.out.println(cl.get(i));
		}
		System.out.println("*****************************************************************************************************");	
		
		
		System.out.println("Q.3 Write a Java program to retrieve an element (at a specified index) from a given array list.");
		
		     System.out.println(cl.get(2));
		System.out.println("*****************************************************************************************************");
		
		System.out.println("Q.4 Write a Java program to update specific array element by given element");
	
		
		for (int i=0;i<cl.size();i++) {
	
			if(cl.get(i).equals("yellow"))  {// change yellow to pink
			System.out.println("Before Updating Yellow to Pink: "+ cl);
			
			cl.set(i,"Pink");
			System.out.println("After Updating Yellow to Pink: "+ cl);
			}
		
		}
		System.out.println("*****************************************************************************************************");	
		
		System.out.println("Q.5.Write a Java program to remove the third element from a array list");
		
		cl.remove(3);//Remove 3rd element which is yellow
		//for (int i = 0;i<cl.size();i++) 
		{
			System.out.println(cl);
	
		System.out.println("*****************************************************************************************************");
		}
		
		System.out.println("Q.6.Write a Java program to search an element in a array list!!");
		
		if (cl.contains("Green")) {
	     System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}	
		if (cl.contains("Purple")) {
			     System.out.println("Element Found");
				}
				else {
					System.out.println("Element Not Found");	
		}
		System.out.println("*****************************************************************************************************");
		System.out.println("Q.7.Write a Java program to reverse elements in a array list");
		
		cl.add(3,"yellow");//Add yellow first whcih is removed in line 127.
		System.out.println("List Before Reverse: " + cl);
		
		Collections.reverse(cl);
		
		System.out.println("List After Reverse: " + cl);
		
	
		System.out.println("*****************************************************************************************************");
		
		System.out.println("Q.8 Write a Java program to extract a portion of a array list.");
		
		System.out.println(cl);
		List<String> Sub_list = cl.subList(0,3);
		 System.out.println(Sub_list);
		
		System.out.println("*****************************************************************************************************");
		
		System.out.println("Q.9 Write a Java program of swap two elements in an array list");
		
		System.out.println("Array list before Swap:"+ cl);
		
		Collections.swap(cl, 1, 3);
		
		System.out.println("Array list After Swap:" + cl);
		
		System.out.println("*****************************************************************************************************");
		System.out.println("Q.10.Write a Java program to empty an array list.");
		
	    System.out.println("Original ArrayList: "+ cl);
	    
	    //cl.removeAll(cl);
	    
	    System.out.println("Empty ArrayList: " + cl);
		
	    System.out.println("*****************************************************************************************************");
		
	    System.out.println("Q.11 Write a Java program to trim the virtual capacity of an array list the current list size!!"); 
	    
	    
	    cl.trimToSize();
	    System.out.println(cl.size());
	    
	    System.out.println("*****************************************************************************************************");
		
	    System.out.println("Q.12 Write a Java program to print all the elements of a ArrayList using the position of the elements");
	    
	    for(int i =0;i<cl.size();i++) {
	    
	     System.out.println(cl.get(i));
	    }
	
	
	
	}	
	}