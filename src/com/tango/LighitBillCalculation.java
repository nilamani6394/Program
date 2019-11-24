package com.tango;

public class LighitBillCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double rental_charges=170.00;
         double call_charges=0.00;
         double service_charges=0.00;
         double serfviceRate=12.24;
         double netcharges=0.00;
         int calls = 0;
         if(calls<=150){
        	 call_charges=0.00;
         }else if (calls<=250) {
			call_charges=(calls-150)*0.50;
		}else if (calls<=350) {
			call_charges=50.00+(calls-250)*.60;
		}else if (calls<=450) {
			call_charges=110.00+(calls-350)*.70;
		}else if (calls<=600) {
			call_charges=180.00+(calls-450)*.80;
		}else {
			call_charges=300.00+(calls-600)*1.00;
		}
         service_charges=(call_charges+rental_charges)*
        		 serfviceRate/100;
         
         netcharges=rental_charges+call_charges
        		 +service_charges;
         System.out.println(netcharges);
	}

}
