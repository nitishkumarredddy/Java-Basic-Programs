import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args)
	{
		 int num = 0;
		 Scanner reader = new Scanner(System.in);
		 
		 System.out.print("Enter the number : ");
		 
		 num = reader.nextInt();
		 
		 if (num > 0)
		 {
			 System.out.println(num +"Entered num is positive ");
		 }
		 else
		 {
			 System.out.println(num + "Entered num is negative ");
		 }
		 

	}

}
