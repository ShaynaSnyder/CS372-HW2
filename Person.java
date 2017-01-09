import java.util.ArrayList;
import java.util.List;

public abstract class Person {
	private String name;
	private int age;
	private long number;
	public Person(String n){
		name = n;
	}
	public String getName() {
		return name;
	}
}
