package newPackage2;

public class Student {
    private String studentNumber;
    private String studentName;
    private String studentAddress;
    private int studentAge;

    public Student() {

    }

    public Student(String studentNumber, String studentName, String studentAddress, int studentAge) {
	this.studentNumber = studentNumber;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.studentAge = studentAge;
    }

    public String getStudentNumber() {
	return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
    }

    public String getStudentName() {
	return studentName;
    }

    public void setStudentName(String studentName) {
	this.studentName = studentName;
    }

    public String getStudentAddress() {
	return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
    }

    public int getStudentAge() {
	return studentAge;
    }

    public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
    }

}
