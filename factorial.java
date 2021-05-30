
import java.math.*;

public class factorial {

	public static void main(String[] args)
	{
		int num = 30;
		
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1 ; i<=num ; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);

	}

}
