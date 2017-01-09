
public class Teacher extends Person implements Employee{
	public Teacher(String n) {
		super(n);
	}
	int gradeLevel;
	String certification;
	public boolean payEmployee(Employee p) {return true;}
}
