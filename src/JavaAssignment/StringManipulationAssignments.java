package JavaAssignment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationAssignments {

	public static void main(String[] args) {
		
		
		String st1 = "this is janak here";
		String st2 = "this is Janak here";
		
		System.out.println("*****Ans:1*****");

		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		System.out.println("*****Ans:2*****");
		
		String st3 = "Hello  Everyone";
		System.out.println(st3.replace(" ", ""));
		
		
		
		String st4 = "Hi everyone my name is janak";
		
		System.out.println("*****Ans:3*****");
		
		int l = st4.length();
		System.out.println(st4.charAt(0));
		System.out.println(st4.charAt(l - 1));
		
		System.out.println("*****Ans:4*****");
		
		System.out.println(st4.contains("janak"));//true
		
		System.out.println("*****Ans:5*****");
		//Type name in reverse
		
		System.out.println("  TBD ");
		
		
		
		String st6 = "Welcome to Naveen Automation Lab !";
		
		System.out.println("*****Ans:6*****");
		
		System.out.println(st6.substring(st6.indexOf("Automation")+11,st6.length()));
		
		System.out.println("*****Ans:7*****");
		
		System.out.println(st6.indexOf("e"));// 1st occurrence of 'e'
		System.out.println(st6.indexOf("e", st6.indexOf("e", st6.indexOf('e')+1)));// 2nd occurrence of 'e'
		System.out.println(st6.indexOf("e",st6.indexOf("e",st6.indexOf('e')+1)+1));//3rd occurrence of 'e'
		System.out.println(st6.indexOf("e",st6.indexOf("e",st6.indexOf('e')+1)+1)+1);//4th occurrence of e
		System.out.println("*****Ans:8*****");
		
		System.out.println(st6.indexOf("id"));//3
		System.out.println(st6.indexOf("me"));//-1
		
		System.out.println("*****Ans:9*****");
		
		System.out.println(st6.split(" ")[0]);
		System.out.println(st6.split(" ")[1]);
		System.out.println(st6.split(" ")[2]);
		System.out.println(st6.split(" ")[3]);
		System.out.println(st6.split(" ")[4]);
		
		
		System.out.println("*****Ans:10*****");
		System.out.println(st6.substring(10,17));
		
		System.out.println("*****Ans:11*****");
		
		String str = "your transaction id is: 12345 and reference id is 34567";
		
		
		System.out.println(str.substring(str.indexOf("is:")+4, str.indexOf("and")-1));
		System.out.println(str.substring(str.indexOf("reference")+16, str.length()));
		
		//OR
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		//OR
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
		
		

	}

}
