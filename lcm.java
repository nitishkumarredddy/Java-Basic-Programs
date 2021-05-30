
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 72, n2 = 120, lcm;

		lcm = (n1 > n2) ? n1 : n2;

		while (true) 
		{
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
		
		int m1 = 45, m2 =15 ;
		

	}

}
