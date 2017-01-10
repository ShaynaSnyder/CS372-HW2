//class with data to test the city class
public class CityTest {
	public static void main(String[] args) {
		//creates city object
		City city = new City();
		
		//creates police, teacher, and kid objects
		Police[] police = {new Police("Terrence", 29, 1234567, Police.Role.Sargent), new Police("Milly", 31, 8546732, Police.Role.Captain),
				new Police("Barry", 56, 9712322, Police.Role.Chief), new Police("Amy", 21, 3605478, Police.Role.Sargent)};
		Teacher[] teachers = {new Teacher("Sherlock", 41, 4543276, 7, "Bachelor's"), new Teacher("Wynter", 23, 7658779, 2, "Master's")};
		Kid[] kids = {new Kid("Shayna", 7, 6104553, "Kit Kat"), new Kid("Cheree", 15, 7843454, "M&M's"), new Kid("Willy", 9, 8773434, "Twix")};
		
		//adds people to people array list and outputs city occupants
		System.out.printf("City occupants:\n");
		for(int a=0; a<police.length; a++) {
			city.addPeople(police[a]);
			city.addPolice(police[a]); }
		for(int b=0; b<teachers.length; b++) {
			city.addPeople(teachers[b]);
			city.addTeachers(teachers[b]); }
		for(int c=0; c<kids.length; c++) {
			city.addPeople(kids[c]);
			city.addKids(kids[c]);}
		
		//creates city hall and school objects
		CityHall cityHall = new CityHall("City Hall", "534 State Street");
		School school = new School("High School", "1024 Alderwood Lane");
		
		//adds buildings to building array lists
		System.out.printf("\nBuildings in city:\n");
		city.addBuildings(cityHall);
		city.addCityHall(cityHall);
		city.addBuildings(school);
		city.addSchool(school);
		
		//calls functions to add occupants to buildings and output occupants
		city.addOcc();
		city.getOcc();
	}
}
