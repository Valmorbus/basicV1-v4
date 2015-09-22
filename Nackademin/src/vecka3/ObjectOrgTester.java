package vecka3;

public class ObjectOrgTester {
	static int t = 5;  // static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPassing o = new ObjectPassing(2, 2);

		System.out.println(o.iv1);
		System.out.println(o.iv2);

		ObjectOrgTester ot = new ObjectOrgTester();
		System.out.println(t + " static");
		ot.test(o);
	
		System.out.println(o.iv1);
		System.out.println(o.iv2);
		System.out.println(t + " static");

	}

	public void test(ObjectPassing ob) // pass by reference. Objekt skickas som
										// referens till skillnad från
	// primitiva variabler. Sålede ändras faktiskt värdet, till skillnad från
	// pass by value. pass by value gäller även static när de är argument. 
	{
		ob.iv1++;
		ob.iv2--;
		t++;
	}

}
