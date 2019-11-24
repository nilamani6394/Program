package com.tango;

public class FcBarcilona {
	//Check perfect squre
		 Boolean isSquare(int n){
			 int sr=(int) Math.sqrt(n);
			return (sr*sr==n);
		 }
		 //print all number lessthan or equal to n
		 //that both prime and fibonascinumber
		 static void prindPrimeFibo(int n){
			 //using sive to print all prime number l.t.e. to n
			 Boolean[] snt= new Boolean[n+1];
			 for (int p = 0; p <=n; p++) 
				snt[p]=true;
			 for (int p = 2; p*p <=n; p++) {
				//if prime is not changed it is prime
				 if(snt[p]==true){
					 //update all the multiples of p
					 for (int i = p*2; i <=n; i+=p) {
						snt[i]=false;
					}
				 }
				 //now traverse through range
				 for (int i = 2; i <=n; i++) {
					double sqrt=Math.sqrt(5*i*i+4);
					double sqr=Math.sqrt(5*i*i-4);
					
					int x=(int) sqrt;
					int y=(int) sqr;
					
					if(snt[i]==true &&(Math.pow(sqrt,2)==
							Math.pow(x, 2)||(Math.pow(sqr, 2)==Math.pow(y, 2))))
							System.out.print(i+" ");
				}
			}
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
        prindPrimeFibo(n);
	}

}
