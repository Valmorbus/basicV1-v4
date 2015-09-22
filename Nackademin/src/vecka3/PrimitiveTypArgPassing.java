package vecka3;

public class PrimitiveTypArgPassing {
	
	public static void main(String[] args) {
		
		int a1=2,a2=2;
		System.out.println(a1 + " " +a2);
		
		PrimitiveTypArgPassing p = new PrimitiveTypArgPassing();
		p.test(a1, a2); // pass by value. Variablerna ändras inte i main. bara värdet skickas 
		
		System.out.println(a1 + " " +a2);
		
	}
	public void test(int a1, int a2)
	{
		a1++;
		a2--;
		
	}

}
