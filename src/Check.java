package Project;

public class Check extends CustomerPayment implements Payable {
public static final int CASHIER = 1;
public static final int CERTIFIED = 2;
public static final int PERSONAL = 3;
	
private int accountNumber;
private double accountBalance;
private int type;


public Check() {
	super();
	this.accountNumber = 0;
	this.accountBalance = 0;
	this.type= 1;
}

public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance, int type) {
	super(customerName, customerId, amount);
	this.accountNumber = accountNumber;
	this.accountBalance = accountBalance;
	if (type == CASHIER || type == CERTIFIED || type == PERSONAL) {
        this.type = type;
    } else {
    	System.out.println("This type is not avalible");
    }
	
}

public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public int getType() {
	return type;
}
public void setType(int type) {
	if (type == CASHIER || type == CERTIFIED || type == PERSONAL) {
        this.type = type;
    } else {
    	System.out.println("This type is not avalible");
    }

}

public void deductAmountFromBalance() {
	 if (type == CERTIFIED || type == PERSONAL) {
         this.accountBalance -= super.amount;
     }
}

@Override
protected double calculatePayment() {
	return (super.amount);
}

@Override
public boolean isAuthorized() {
	if(this.type == CASHIER || super.getAmount()<= this.accountBalance) {
		this.deductAmountFromBalance();
		return true;
	}
	else return false;
}

@Override
 void printPaymentInfo() {
	System.out.println(this.toString()+" payment = "+this.calculatePayment());
}

@Override
public String toString() {
	return "Check [accountNumber=" +this.accountNumber + ", accountBalance=" + this.accountBalance + ", type=" + this.type + ", "+super.toString();
}




}
