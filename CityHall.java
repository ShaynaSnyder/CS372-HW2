import java.util.ArrayList;
import java.util.List;
public class CityHall extends Building{
	List<String> occupants = new ArrayList<String>();
	public CityHall(String b) {
		super(b);
	}
	public void addOccupants(String n) {
		occupants.add(n);
	}
	public void getOccupants() {
		for(int i=0; i<occupants.size(); i++)
			System.out.printf("%s\n", occupants.get(i));
	}
}
