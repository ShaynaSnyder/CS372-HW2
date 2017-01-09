
public class Police extends Person implements Employee{
	public Police(String n) {
		super(n);
	}
	public enum Role {Patrol, Sargent, Captain, Chief}
	private Role role;
	public Role getRole() {return role;}
	public boolean payEmployee(Employee p) {return true;}
}
