
public class SWAP {

	public static void main(String[] args) 
	{
		
		int num1= 15 , num2 = 20;
		
		System.out.println("Before swap " );
		System.out.println("Num1 = "  + num1);
		System.out.println("Num2 = " + num2 );
		 
		int temp  = num1;
		num1 = num2;
		num2 = temp;
		
     	System.out.println("After swap " );
		System.out.println("Num1 = " + num1 );
		System.out.println("Num2 = " + num2 );
		
		
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;}

}
