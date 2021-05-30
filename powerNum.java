import java.math.MathContext;

public class powerNum {

	public static void main(String[] args)
	{
		int base = 2 ;
		int power = 4;
		int result = 1;
		
		for (;power != 0; power--)
			
		{
			 result *= base;
		}
		System.out.print(result);
		
		int base2= 10,power2 =5;
		
		double result2 = Math.pow(base2, power2);
		System.out.println(result2);
		


	}

}
