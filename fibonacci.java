
public class fibonacci {

	public static void main(String[] args) 
	{
		int num = 10;
		int t1 = 0;
		int t2 = 1;

		System.out.print("First "+ num + "terms:");
	
		
		for (int i =1 ; i<=num ; i++)
		{
			System.out.print(t1 + "+");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
		}
		
		

	}

}