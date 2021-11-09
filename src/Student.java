import java.util.Scanner;

public class Student extends Person {
	
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student : studentID: " + studentID + " , Name: "+ name + ", academicYear: " + academicYear;
	}
	
	

	public Student(String studentID, int academicYear) {
		super();
		this.studentID = studentID;
		this.academicYear = academicYear;
	}
	
	
	
	public Student(String name, char gender, int birthYear, String studentID, int academicYear) {
		super(name, gender, birthYear);
		this.academicYear = academicYear;
		this.studentID = studentID;
		// TODO Auto-generated constructor stub
		
	}

	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	
	String studentID;
	int academicYear;
	
	public void setInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.setName(input.next());

		System.out.print("Nhap ma sinh vien: ");
		this.setStudentID(input.next());
		
		System.out.print("Nhap nam sinh: ");
		this.setBirthYear(input.nextInt());
		
		System.out.print("Nhap gioi tinh: ");
		this.setGender(input.next().charAt(0));
		
		System.out.print("Nhap nam nhap hoc: ");
		this.setAcademicYear(input.nextInt());
		
		
	}
}

