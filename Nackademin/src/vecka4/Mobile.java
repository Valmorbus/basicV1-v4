package vecka4;

public class Mobile {

	private int pixels;
	private String OS;
	private boolean gyroscope;
	
	public Mobile()
	{
		this.OS = "Android";
		this.gyroscope = false;
	}
	
	public Mobile(String os)
	{
		
		this.OS = os;
		this.gyroscope = false;
	}
	public Mobile(int pix, String os)
	{
		this.pixels = pix;
		this.OS = os;
		this.gyroscope = false;
	}
	public Mobile(int pix, String os, boolean gyro)
	{
		this.pixels = pix;
		this.OS = os;
		this.gyroscope = gyro;
	}
	public void tostring()
	{
		System.out.println(this.OS + " " + this.pixels + " " + this.gyroscope);
	}
	
}
