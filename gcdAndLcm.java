
public class gcdAndLcm {
	public static void main(String[] args)
	{
		int n1 = 72 , n2 =120,gcd1 =1;
		
		
		for (int i =1 ; i<= n1 && i <=n2 ; i++)
		{
			if (n1 % i == 0 && n2 % i ==0)
			{
				gcd1 = i;
			}
		}
		
		;
		
		System.out.printf("G.C.D of %d and %d is %d ",n1,n2,gcd1);
		
		
		// if +ve ad -ve num
		
		int m1= 81,m2=-153;
		 
		m1 = (m1 > 0)? m1 : -m1;
		m2 = (m2 > 0)? m2 : -m2;
		
		while(m1!=m2)
			if (m1 >m2)
				m1 -=m2;
			else
				m2 -=m1;
		System.out.printf("G.C.D ="+m1);
			
		
	}
	

}
