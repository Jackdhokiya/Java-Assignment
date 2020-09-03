package JavaAssignment;

public class LoopAssignment {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5;  i++) {
			System.out.println("I am a Batman");
				
		}
	System.out.println("*************");
	
	for (int i = 1; i<10; i++) {
		
		System.out.println("I am a batman"+ i);
	}
	
	System.out.println("*************");
	int i = 10;
	while (i>0) {
		System.out.println(i);
		i--;
	}
	System.out.println("*************");
	
	
	int a = 1;
	while(a<=10) {
		System.out.println("Hello world");
		a++;
		}
	
	System.out.println("*************");
	
	int x = 1;
    do {
      System.out.println(x);
    
      if (x % 7 == 0) {
        System.out.println("Multiple of 7 encountered. Quitting loop");
        break;
      }
        x++;
      }
    while( x <= 10 );
	
	}
}
