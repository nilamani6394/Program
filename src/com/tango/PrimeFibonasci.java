package com.tango;

public class PrimeFibonasci {
	Boolean isSquare(int n){
		int sr=(int) Math.sqrt(n);
		return (sr*sr==n);
		
	}
	static void PrimeFibo(int n){
		//print all the number 
	//less than equal to n both prime and fibonasci
	    Boolean [] prime= new Boolean[n+1];
		for (int p = 0; p <=n; p++) 
			prime[p]=true;
			for (int p = 2; p*p <=n; p++) {
				//if prime is not changed it is prime
				if(prime[p]==true){
					//then update all the number
					for (int i = p*2; i <=n; i+=p) {
						prime[i]=false;
						
					}
				}
				//Now travrse through the range
				//and print the numbers that both are prime and fibo nasci
				for (int i = 2; i <=n; i++) {
					double squrt=Math.sqrt(5*i*i+4);
					double sqrt1= Math.sqrt(5*i*i-4);
					
					
					int x=(int) squrt;
					int y= (int) sqrt1;
					
					if(prime[i]&&(Math.pow(squrt, 2)==Math.pow(x, 2)||
							Math.pow(sqrt1, 2)==Math.pow(y, 2)));
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=30;
         PrimeFibo(n);
	}

}
