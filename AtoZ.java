
public class AtoZ {

	public static void main(String[] args)
	{
	
		
		for (char ch = 'A'; ch<= 'Z'; ch++)
		{
			System.out.println(ch);
		}
		System.out.println();
		
		int count = 0, num = 178217;
		
		while (num !=0)
		{
			num /=10;
		 	++count;
		}
		System.out.println(count);
		
			

	}

}
