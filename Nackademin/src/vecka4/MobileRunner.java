package vecka4;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mob1 = new Mobile();
		Mobile mob2 = new Mobile("iOS");
		Mobile mob3 = new Mobile(786432, "Android" );
		Mobile mob4 = new Mobile(786432, "Android", true);
		
		mob1.tostring();
		mob2.tostring();
		mob3.tostring();
		mob4.tostring();

	}

}
