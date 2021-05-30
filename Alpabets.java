import java.util.Scanner;

public class Alpabets {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the char : ");
		
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e'  || ch == 'i'  || ch == 'o' || ch == 'u')
		{
			System.out.println("Enter char is Vowel : " + ch);
		}
		else
		{
			System.out.println("Enter char is Consonant : " + ch);
		}
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Next  char : ");		
		
		char c= reader.next().charAt(0);
		
		switch (c)
		
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Enter char is Vowel ");
			break;
			
	    default :
	    	System.out.println("Enter char is Consonant : " + c);
	    	
				
			
			
			
		}
				}

}
