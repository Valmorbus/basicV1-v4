package uppgV1;
import java.util.Random;


public class ArraySorting {
	
	private static int[] randomizer(int[] numbers)
	{
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(49)+1;

		}
		return numbers;
	}
	private static int[] bubbleSort(int[] numbers)
	{
		boolean swapped = true;
		int j= 0;
		while(swapped)
		{
			swapped = false;
			j++;
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i]);
			}
			for (int i = 0; i < numbers.length-j; i++) 
			{
				int temp;
				if (numbers[i] >= numbers[i+1])
				{
					temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swapped = true;
				}
				
					
			}
		}
		return numbers;
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
		}
		for (int i = 0; i < stdDevArr.length; i++) {
			stdDev += stdDevArr[i]; 
		}
		stdDev = stdDev/numbers.length;
		stdDev = (int) Math.sqrt(stdDev);
		
		
		return stdDev;
	}
	private static double medianValue(int[] numbers)
	{
		if (numbers.length%2 == 0)
		{
			return (numbers[(numbers.length/2)]+numbers[(numbers.length/2)-1])/2;
		}
		else 
			return numbers[(numbers.length-1)/2];
		
	}

	public static void main(String[] args) {
		
		int[] numbers = new int[999];
		double stdDev = 0;
		numbers = randomizer(numbers);
		numbers = bubbleSort(numbers);
			
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		stdDev = stdDeviation(numbers);
		System.out.println(stdDev);
		stdDev = medianValue(numbers);
		System.out.println(stdDev);
		
		
		
		
			// BYTE AV PLATS BEROENDE AV STORLEK
			//	int temp; //temporär lagring
			// forloop över hela längden av array 
			// if större eller mindre
			// temp = array [i]
			// array[i] = array [i +/-1]
			// array[i +/- 1] = temp
			
	}

}
