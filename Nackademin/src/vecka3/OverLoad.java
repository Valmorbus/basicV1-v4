package vecka3;

public class OverLoad {
	
	public OverLoad()
	{
		
	}
	
	public void test()
	{
		System.out.println("test1");
	}
	
	public void test(String s)
	{
		System.out.println(s);
	}
	public void test(int i, int j)
	{
		System.out.println(i + " " + j);
	}
	public void test(float i, float j)
	{
		System.out.println(i + " " +j);
	}

}
