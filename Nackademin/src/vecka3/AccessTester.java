package vecka3;

public class AccessTester {
	private int iv1;
	protected int iv2;
	public int iv3;
	int iv4 = 5;
	
	public int getIv1() {
		return iv1;
	}
	public void setIv1(int iv1) {
		this.iv1 = iv1;
	}
	public int m1()
	{
		return 1;
	}
	protected int m2()
	{
		return 1;
	}
	int m3()
	{
		return 1;
	}
	private int m4()
	{
		return 1;
	}
	
}
