package JavaAssignment;
import java.util.ArrayList;

public class University {
	
	public String name;
	public String country;
	public String EstablishedDate;
	public ArrayList<String> Course;
	
	
	public University(String name) {
		this.name = name;
	}

	public University(String name, String country) {
	
		this.name = name;
		this.country = country;
	}
	public University(String name, String country, String establishedDate) {
		
		this.name = name;
		this.country = country;
		this.EstablishedDate = establishedDate;
	}
	public University(String name, String country, String establishedDate, ArrayList<String> course) {
		this.name = name;
		this.country = country;
		this.EstablishedDate = establishedDate;
		this.Course = course;	}

	public String getname() {
		return name;
		
	}
	public String getcountry() {
		return country;
	}
	
	public String establishedDate() {
		return EstablishedDate;
	}

	public static void main(String[] args) {
		
		University Uni = new University("Gujrat","India", "19/07/1955");
		System.out.println(Uni.name);
		System.out.println(Uni.name+" "+ Uni.country+" "+ Uni.EstablishedDate);
		
		
		ArrayList<String> course = new ArrayList<String>();
		course.add("BBA");
		course.add("B.Com");
		course.add("MBA");
		course.add("M.Com");
		University Uni1 = new University("Pune", "India", "25/05/1960",course);
		System.out.println(Uni1.name);
		System.out.println(Uni1.country);
		System.out.println(Uni1.Course);
	
		
		System.out.println(Uni.getname());
		System.out.println(Uni1.EstablishedDate);
				
	}

}
