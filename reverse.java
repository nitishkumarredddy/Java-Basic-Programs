
public class reverse {

	public static void main(String[] args) 
	{
		int num = 782;
		int reverse = 0;
		
		while (num != 0)
		{
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num /=10;
		}
		System.out.println(reverse);
		
		
		
		
		int num1 = 2618168;
		int reverse1 = 0;
		 for (; num1 != 0; num1 /= 10)
		 {
			 int digit = num1 %10;
			 reverse1 = reverse1 * 10 +digit;
		 }
		 System.out.println(reverse1);

	}

}
