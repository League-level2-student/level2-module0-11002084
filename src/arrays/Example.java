package arrays;

public class Example {
	static String school = "CCA";
	String studentName;
	int studentIdNumber;
	
	Example(String studentName, int studentIdNumber, String school){
		this.studentName=studentName;
		this.studentIdNumber=studentIdNumber;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Example student1 = new Example("Bob", 12345, school);
		System.out.println(student1.studentIdNumber);
		System.out.println(student1.studentName);
		System.out.println(student1.school);
		System.out.println("");
		
		Example student2 = new Example("Joe", 69420, school);
		System.out.println(student2.studentIdNumber);
		System.out.println(student2.studentName);
		System.out.println(student2.school);
		System.out.println("");
		
		Example student3 = new Example("Taylor", 42069, school);
		System.out.println(student3.studentIdNumber);
		System.out.println(student3.studentName);
		System.out.println(student3.school);
		System.out.println("");
	}
}
