package bai2;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Comparable<Person>, Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private char gender; // 0 nam / 1 nu
	private int birth_year;

	/**
	 * @param academic_year 
	 * @param gender2 
	 * @param name2 
	 * @param name
	 * @param gender
	 * @param birth_year
	 */

	
	public void Person(String name, char gender, int birth_year) {
		this.name = name;
		this.gender = gender;
		this.birth_year = birth_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	void inputPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hoten: ");
		name = scanner.nextLine();
		System.out.print("Gioi tinh(0:Nam ; 1: Nu): ");
		gender = scanner.next().charAt(0);
		System.out.print("Nam sinh: ");
		birth_year = scanner.nextInt();
	}

	void outPerson() {
		System.out.println("Hoten: " + getName());
		System.out.println("Gioi tinh: " + getGender());
		System.out.println("Nam sinh: " + getBirth_year());
	}

	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}