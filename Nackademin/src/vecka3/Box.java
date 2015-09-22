package vecka3;

public class Box {
	
	
	public Box() {
		super();
		
		// TODO Auto-generated constructor stub
	}


	private float heightY, widthX, widthZ;
	
	
	public float volume()
	{
		float volume = heightY*widthX*widthZ;
		
		
		return volume;
	}


	public float getHeightY() {
		return heightY;
	}


	public void setHeightY(float heightY) {
		this.heightY = heightY;
	}


	public float getWidthX() {
		return widthX;
	}


	public void setWidthX(float widthX) {
		this.widthX = widthX;
	}


	public float getWidthZ() {
		return widthZ;
	}


	public void setWidthZ(float widthZ) {
		this.widthZ = widthZ;
	}
	
}
