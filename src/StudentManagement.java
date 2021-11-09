import java.util.ArrayList;
import java.util.Scanner;



public class StudentManagement {

	ArrayList<Student> listStudents;
	
	public static ArrayList<Student> findByBirthYear(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh can tim");
		int namSinh = input.nextInt();
		//
		//tim
		for (Student o: listStudents) {
			if(o.getBirthYear() == namSinh) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Student> findByName(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap ten can tim");
		String ten = input.next();
		//
		//tim
		for (Student o: listStudents) {
			if(o.getName().equals(ten)) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static void Show(ArrayList<Student> students) {
		for (Student o: students) {
			System.out.println(o.toString());
			System.out.println("---------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = input.nextInt();
		
		StudentManagement list = new StudentManagement();
		list.listStudents = new ArrayList<Student>();
		// Set thong tin
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ": ");
			//
			Student s = new Student();
			s.setInfo();
			list.listStudents.add(s);
		}
		//
		// Hien thi thong tin
		Show(list.listStudents);
		
		//
		// Tim theo nam sinh
		ArrayList<Student> resultByBirthYear = findByBirthYear(list.listStudents);
		// Hien thi
		System.out.print("Danh sach sinh vien cung nam can tim: ");
		Show(resultByBirthYear);
		//Tim theo ten
		ArrayList<Student> resultByName = findByName(list.listStudents);
		//Hien thi
		System.out.print("Danh sach sinh vien cung ten can tim: ");
		Show(resultByName);
	}

}