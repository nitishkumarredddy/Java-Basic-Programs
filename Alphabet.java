import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) 
	{
		char ch = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the char : ");
		
		ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z'))
     	{
			System.out.println(ch +" : is an smallAlphabet.");
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println(ch +" : is an capitalAlphabet.");
		}
		else
			System.out.println(ch +" : is an not an alphabet.");
		
		
		

	}

}
