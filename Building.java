import java.util.ArrayList;
import java.util.List;

public abstract class Building {
	String bname;
	int address;
	public Building(String b) {
		bname = b;
	}
	public String getbName() {
		return bname;
	}
}
