package code;

class Student{
	String sname;
	String name;
	String id;
	int sex;
	String date;
	private int score;
	
	public String setName(String name) {
		return name;
	}
	
	public int setScore(int score) {
		return score;
	}
}

class Undergraduate extends Student{
	private String department;
	private String major;
	public String setDepartment() {
		return department;
	}
	public String setMajor() {
		return major;
	}
}

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("The student's name is "+s.setName("jiuge"));
	}
}
