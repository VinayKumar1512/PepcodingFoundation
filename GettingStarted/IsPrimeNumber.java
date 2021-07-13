package JavaBasic;
import java.util.*;

public class IsPrimeNumber {
 
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		//Brute Force IsNumber Prime Code- Complexity t*n
		
//		for(int i=0;i<t;i++) {
//			int n=scan.nextInt();
//			int count=0; 
//			for(int divisor=1;divisor<=n;divisor++) {
//				
//				if(n%divisor==0) {
//					count ++;//counter keep track how many times n got divided
//				}
//				
//			}
//			
//			if(count==2) {
//				//count is 2 it means n is divided two times hence it is prime
//				System.out.println("Number is Prime");
//			}
//			else {
//				//count>2 means n divided more than 2 times ,hence non-prime
//				System.out.println("Number is Non-Prime");
//			}
//		}
		
		//Optimized IsPrime Number Code -Complexity t*root(n)
		for(int i=0;i<t;i++) {
			int n=scan.nextInt();
			int count=0;
			for(int divisor=2;divisor*divisor<=n;divisor++) {
				
				if(n%divisor==0) {
					count ++;//counter keep track how many times n got divided
				}
				
			}
			//p*q =n, p can't be greater than root of n,same for q
			//every no. is divided by numbers till it reaches it's root if it is non-prime,after that the no.
			//which divide were also  divisible by number before root,so there is no need to check those numbers
			if(count==0) {
				//count is 0 it means n is not divided by any number,hence prime
				System.out.println("Number is Prime");
			}
			else {
				//count>0 means n divided by a number from 2 to root n ,hence non-prime
				System.out.println("Number is Non-Prime");
			}
		}
	}
}
