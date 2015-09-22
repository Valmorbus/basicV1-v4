package uppgV1;
import java.util.Random;


public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numbers[] = new int[50];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(199)+1; 
			System.out.println(numbers[i]);
		}
		System.out.println("minsta nummret är " + smallestNumber(numbers)); 
		System.out.println("Störta nummret är " + biggestNumber(numbers)); 
		System.out.println("medelvärde av nummret är " + mediumNumber(numbers));
		System.out.println("standardavvikelse är " + stdDeviation(numbers));
		
	}
	private static int smallestNumber(int[] test)
	{
		int temp = 200; 
		for (int i = 0; i < test.length; i++) {
			if (test[i] < temp)
				temp = test[i];
		}
		
		return temp;
		
	}
	private static int biggestNumber(int[] numbers)
	{
		int temp = 0; 
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > temp)
				temp = numbers[i];
		}
		
		return temp;
	}
	private static int mediumNumber(int[] numbers)
	{
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			temp = temp + numbers[i];
		}
		return temp/numbers.length;
	}
	private static double stdDeviation(int[] numbers)
	{
		double stdDev = 0;
		double middleValue =0;
		double stdDevArr[] = new double[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			middleValue +=numbers[i];
		}		
		middleValue = middleValue/numbers.length;
		
		for (int i = 0; i < numbers.length; i++) {
			 stdDevArr[i] = Math.pow((numbers[i]-middleValue),2);
			 System.out.println(stdDevArr[i]);
		}
		for (int i = 0; i < stdDevArr.length; i++) {
			stdDev += stdDevArr[i]; 
			
		}
		stdDev = stdDev/numbers.length;
		stdDev = (int) Math.sqrt(stdDev);
		
		
		return stdDev;
	}

}
