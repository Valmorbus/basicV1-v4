package vecka3;


public class BoxCreator {

	public static void main(String[] args) {
		Box box1;
		
		box1 = new Box();
		/*box1.widthX=3.2f;
		box1.heightY=6.4f;
		box1.widthZ=3.2f;
		*/
		
		box1.setHeightY(3.2f);
		box1.setWidthX(6.4f);
		box1.setWidthZ(3.2f);
		float volume= box1.volume();
		
		System.out.println(volume);
		
		//Box box2 = new Box();
		Box box2 = box1;   //sätter upp referens, pekar nu på box1.
		
		/*box2.widthX = 3.9f;
		box2.heightY=3.87f;
		box2.widthZ=9.67f;
		float volume2 = box2.volume();
		System.out.println(volume2);*/
		
		
		System.out.println(box1.volume());
		System.out.println(box2.volume());
		
		

	}

}
