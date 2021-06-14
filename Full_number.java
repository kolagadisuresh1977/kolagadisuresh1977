package Numbers;
import java.util.*;
public class Full_number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter  number: ");
		int num = obj.nextInt(); // 12345
		
		int n = num; // n = 12345
		int f = 1, d;
		while( num != 0) // num = 12345,1234,123,12,1,0
		{
			// identify last digit 
			d = num%10;	 // d = 1234%10 = 4
			
			// to identify mixed number
			if(n%2==0 && d%2==1) // n = 12345
			{ 
				f=2;
				break;
			}
			else if(n%2==1 && d%2==0) // n= 12345, d=4 -> t
			{
				f =2;
				break;
			}
			
			num = num/10; // num = 1245/10 = 1234
		}
		
		if(f==1 && n%2==0)
			System.out.println("Full Even number");
		else if(f==1 && n%2==1)
			System.out.println("Full Odd number");
		else
			System.out.println("Mixed number");
	} }
