package Project;

import java.util.Date;

public class CreditCard extends CustomerPayment implements Payable  {
private double chargingFee;
private Date expiryDate;


public CreditCard() {
	super();
	this.chargingFee = 0;
	this.expiryDate = new Date();
}


public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
	super(customerName, customerId, amount);
	this.chargingFee = chargingFee;
	this.expiryDate = expiryDate;
}

public double getChargingFee() {
	return chargingFee;
}

public void setChargingFee(double chargingFee) {
	this.chargingFee = chargingFee;
}

public Date getExpiryDate() {
	return expiryDate;
}

public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}

@Override
protected double calculatePayment() {
	return (super.amount+this.chargingFee);
}

@Override
public boolean isAuthorized() {
	if(this.getExpiryDate().compareTo(new Date())>=0) return true;
	else return false;
}

@Override
 void printPaymentInfo() {
	System.out.println(this.toString()+" payment = "+this.calculatePayment());
}

@Override
public String toString() {
	return "CreditCard [chargingFee=" + this.chargingFee + ", expiryDate=" + this.expiryDate + ", "+super.toString();
}





}
