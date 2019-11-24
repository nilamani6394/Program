package com.Programs;

public class Fmtcs {
	static int MAX=20;
	static  int Nthprime(int n){
		int count=0;
		int i=2;
		while (i<=MAX) {
			int j=2;
			int check=0;
			while(j<=Math.sqrt(i)){
				if(i%j==0){
					check=1;
					break;
				}
				j++;
			}
			if(check==0)
				count++;
			if(count==n){
				return 1;
			}
			i++;
		}
		return 0;
		
	}
	
	public static int fiboc(int n){
		//int fibocount=n;
		int fib[]=new int[n+2];
		fib[0]=0;
		fib[1]=1;
		int i=2;
		while(i<=n){
			fib[i]=fib[i-1]+fib[i-2];
			i++;
		}
		for ( i = 0; i < n; i++) {
			System.out.println(fib[i]+"");
		}
		return fib[n];
	}
	static void findNthTerm(int n) 
	{ 
	// If n is even 
	if (n % 2 == 0)  
	{ 
	    n = n / 2; 
	    n = Nthprime(n); 
	    System.out.println(n); 
	} 
	  
	// If n is odd 
	else 
	{ 
	    n = (n / 2) + 1; 
	    n = fiboc(n - 1); 
	    System.out.println(n); 
	} 
	} 
	
   public static void main(String[] args) {
	   int X=10;
	  // fiboc(X);
	   //Nthprime(X);
	   findNthTerm(X);
	   
	
}
}
