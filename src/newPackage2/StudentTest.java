package newPackage2;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student students[] = new Student[5];
	int maxStudents = 2;
	int i = 0;
	while (i < maxStudents) {
	    System.out.println("Student Number = ");
	    String studentNumber = sc.nextLine().trim();
	    studentNumber = studentNumber.trim();
	    System.out.println("Student Name = ");
	    String studentName = sc.nextLine();
	    studentName = studentName.trim();
	    System.out.println("Student Address = ");
	    String studentAddress = sc.nextLine();
	    studentAddress = studentAddress.trim();
	    System.out.println("Student Age = ");
	    int studentAge = sc.nextInt();
	    sc.nextLine();

	    students[i] = new Student(studentNumber, studentName, studentAddress, studentAge);
	    i++;
	}

	for (i = 0; i < maxStudents; i++) {
	    System.out.println("Student " + i);
	    System.out.println("studentNumber : " + students[i].getStudentNumber());
	    System.out.println("studentName : " + students[i].getStudentName());
	    System.out.println("studentAddress : " + students[i].getStudentAddress());
	    System.out.println("studentAge : " + students[i].getStudentAge());
	    System.out.println("------------------------------");
	}

	int maxAge = 0;
	String maxAgeStudent = "";
	for (i = 0; i < maxStudents; i++) {
	    if (students[i].getStudentAge() > maxAge) {
		maxAge = students[i].getStudentAge();
		maxAgeStudent = students[i].getStudentName();
	    }
	}
	System.out.println("Oldest student : " + maxAgeStudent);
	System.out.println("Max age : " + maxAge);
    }
}
