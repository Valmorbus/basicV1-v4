package vecka3;

public class AccessTestHanler {

	public static void main(String[] args) {
		AccessTester a= new AccessTester();
		
		a.setIv1(5);
	
		System.out.println(a.getIv1());
		a.m1();
		a.m2();
		a.m3();
		

	}

}
