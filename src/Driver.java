package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		ArrayList<CustomerPayment> payments = new ArrayList<>();
		CustomerPayment check1 = new Check("Rana",7777,400,1111,350,Check.PERSONAL);
		if (((Check)check1).isAuthorized() )
			payments.add(check1);
		
		CustomerPayment cash = new Cash("Ahmad",4444,150,5.0);
		payments.add(cash);
		
		CustomerPayment check2 = new Check("Suha",5555,100,1111,200,Check.CASHIER);
		if (((Check)check2).isAuthorized() )
			payments.add(check2);
		
		CustomerPayment check3 = new Check("Rania",7777,600.0,1111,750,Check.CERTIFIED);
		if (((Check)check3).isAuthorized() )
			payments.add(check3);
		
		CustomerPayment creditCard1 = new CreditCard("Randa",9999,170,20, new Date(124,05,03));
		if (((CreditCard)creditCard1).isAuthorized())
			payments.add(creditCard1);
		
		CustomerPayment creditCard2 = new CreditCard("Hani",6666,150,10, new Date(120,06,07));
		if (((CreditCard)creditCard2).isAuthorized())
			payments.add(creditCard2);
		Collections.sort(payments);
		for (int i = 0;i< payments.size();i++) {
			payments.get(i).printPaymentInfo();
		System.out.println();
		}
		

	}

}

//or my driver,I do it:-
/*
 import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		ArrayList<CustomerPayment> payments = new ArrayList<>();
		CustomerPayment Checkers []= new CustomerPayment[6];
		Checkers [0] = new Check("Rana",7777,400,1111,350,Check.PERSONAL);
        Checkers [1] = new Cash("Ahmad",4444,150,5.0);
        Checkers [2] = new Check("Suha",5555,100,1111,200,Check.CASHIER);
        Checkers [3] = new Check("Rania",7777,600.0,1111,750,Check.CERTIFIED);
        Checkers [4] = new CreditCard("Randa",9999,170,20, new Date(124,05,03));
		Checkers [5] = new CreditCard("Hani",6666,150,10, new Date(120,06,07));
		
		for(int i =0;i<Checkers.length;i++){
		   if(Checkers[i] instanceof Check ) {
		    if (((Check)Checkers[i]).isAuthorized() )
			payments.add(Checkers[i]);
		    }
		    else if(Checkers[i] instanceof CreditCard){
		     if (((CreditCard)Checkers[i]).isAuthorized())
			 payments.add(Checkers[i]);
		    }
		    else
		    payments.add(Checkers[i]);

		   }
		   
		   Collections.sort(payments);
		   
		for (int i = 0;i< payments.size();i++) {
			payments.get(i).printPaymentInfo();
		System.out.println();
		}
		   
		 }
		}
 
 
 */

