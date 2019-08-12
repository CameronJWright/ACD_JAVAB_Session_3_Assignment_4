package Se3As4;

import java.util.Scanner;

class Student {
	private String name;
	private String pNumber;
	private String rNumber;
	private String section;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	Student() {

	}

	Student(String name, String pNumber, String rNumber, String section) {
		this.name = name;
		this.pNumber = pNumber;
		this.rNumber = rNumber;
		this.section = section;
	}

}

class StudentResultProcessing extends Student {

	String[] marks;

	public StudentResultProcessing(String name, String pNumber, String rNumber, String section, int[] marks) {
		super(name, pNumber, rNumber, section);
		this.marks = new String[marks.length];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 70)
				this.marks[i] = "Pass";
			else
				this.marks[i] = "Fail";
		}
	}

	void display() {
		System.out.println("Name: " + super.getName());
		System.out.println("Phone Number: " + super.getpNumber());
		System.out.println("Roll Number: " + super.getrNumber());
		System.out.println("Section: " + super.getSection());
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("*******************");

	}
}

public class StudentMarks {

	public static void main(String[] args) {
		int noStudents = 3;
		int noMarks = 3;
		Scanner scan = new Scanner(System.in);

		StudentResultProcessing[] srp = new StudentResultProcessing[noStudents];
		int[] marks = new int[noMarks];
		String name, pNumber, rNumber, section;

		for (int i = 0; i < noStudents; i++) {
			System.out.println("Enter the Student name:");
			name = scan.next();
			System.out.println("Enter the Student phone number:");
			pNumber = scan.next();
			System.out.println("Enter the Student roll number:");
			rNumber = scan.next();
			System.out.println("Enter the Student section:");
			section = scan.next();
			for (int j = 0; j < noMarks; j++) {
				System.out.println("Enter Student Mark: ");
				marks[j] = scan.nextInt();
			}
			srp[i] = new StudentResultProcessing(name, pNumber, rNumber, section, marks);
		}
		for (int i = 0; i < srp.length; i++) {
			srp[i].display();
		}
		scan.close();

	}

}