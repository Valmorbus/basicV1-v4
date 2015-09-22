import java.util.Scanner;

public class Calculator {

	public Calculator()
	{
		
		Scanner data = new Scanner(System.in);
		float number1 = 0, number2 = 0;
		boolean inValid = true;
		String sign;
		while(inValid){
			System.out.println("Ange ett tal");
			if (data.hasNextFloat())
			{
				number1 = data.nextFloat();
				inValid = false;
			}
			else
			{				
				System.out.println("inte en siffra");	
				data.next();
			}
		}//while(inValid);
		
		do
			{
			inValid = true;
			System.out.println("ange ett av följande beräkningsätt: +, - , *, /, % (modulus)");		
			sign = data.next();
			if (sign.length()<2 && sign.equals("+") || sign.equals("-")||
					sign.equals("*")||sign.equals("/")||sign.equals("%"))
							inValid=false;
			}while(inValid);
			
		do{
				inValid = true;
				System.out.println("ange ett tal att utföra beräkningen mot");
				if (data.hasNextFloat())
				{	
					number2 = data.nextFloat();
					inValid = false;
				}
				else
				{				
					System.out.println("inte en siffra");	
					data.next();
				}		
			}while(inValid);

		System.out.println("Summan är " + calculation(sign, number1, number2));
		data.close();
		
	}
	private float calculation(String sign, float number1, float number2)
	{
		float answer = 0;
		switch (sign)
		{
			case  "+": answer = addNumber(number1, number2); 
						break;
			case "-" : answer = subtractNumber(number1, number2);
						break;
			case "*" : answer = multiply(number1, number2);
						break;
			case "/" : answer = divide(number1, number2);
						break;
			case "%" : answer = modulus(number1, number2);
						break;
			default : System.out.println("felaktig inmatning");
						break;
					
		}
		
		return answer;
	}
	
	private float addNumber(float number1, float number2)
	{
		float answer;
		answer = number1+number2; 
		return answer;
	}
	private float subtractNumber(float number1, float number2)
	{
		float answer = number1-number2;
		return answer;
	}
	private float divide(float number1, float number2)
	{
		float answer = number1/number2;
		return answer;
	}
	private float multiply(float number1, float number2)
	{
		float answer = number1*number2;
		return answer;
	}
	private float modulus(float number1, float number2)
	{
		float answer = number1%number2; 
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		new Calculator();
		
	}
	
	
}
