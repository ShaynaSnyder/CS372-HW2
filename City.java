import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class City{

	public static void main(String[] args) {
		List<String> people = new ArrayList<String>();
		List<String> buildings = new ArrayList<String>();
		CityHall[] cityhall = {new CityHall("City Hall")};
		for(int d=0; d<cityhall.length; d++)
			buildings.add(cityhall[d].getbName());
		School[] school = {new School("High School")};
		for(int e=0; e<school.length; e++)
			buildings.add(school[e].getbName());
		Police[] police = {new Police("Terrence"), new Police("Milly"), new Police("Barry"), new Police("Amy")};
		for(int a=0; a<police.length; a++){
			people.add(police[a].getName());
			cityhall[0].addOccupants(police[a].getName());
			police[a].payEmployee(null);
		}
		Teacher[] teachers = {new Teacher("Sherlock"), new Teacher("Wynter")};
		for(int b=0; b<teachers.length; b++){
			people.add(teachers[b].getName());
			school[0].addOccupants(teachers[b].getName());
			teachers[b].payEmployee(null);
		}
		Kid[] kids = {new Kid("Shayna"), new Kid("Cheree"), new Kid("Willy")};
		for(int c=0; c<kids.length; c++){
			people.add(kids[c].getName());
			school[0].addOccupants(kids[c].getName());
		}
		System.out.printf("Names of people in city: \n");
		for(int i=0; i<people.size(); i++)
			System.out.printf("%s\n", people.get(i));
		System.out.printf("\nNames of buildings in city: \n");
		for(int j=0; j<buildings.size(); j++){
			System.out.printf("%s\n", buildings.get(j));
		}
		System.out.printf("\nCity Hall occupants:\n");
		cityhall[0].getOccupants();
		System.out.printf("\nHigh School occupants:\n");
		school[0].getOccupants();
	}
}