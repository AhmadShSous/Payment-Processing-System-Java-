package Project;

public class Cash extends CustomerPayment{
private double discountRate;



public Cash() {
super();
this.discountRate =5.5;

}


public Cash(String customerName, int customerId, double amount, double discountRate) {
	super(customerName, customerId, amount);
	this.discountRate = discountRate;
}


public double getDiscountRate() {
	return discountRate;
}


public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
}



@Override
protected double calculatePayment() {
	double am =super.amount-(((this.discountRate)/100.0)*super.amount);
	return am;
}

@Override
 void printPaymentInfo() {
	System.out.println(this.toString()+" payment = "+this.calculatePayment());
}



@Override
public String toString() {
	return "Cash [discountRate=" + discountRate + ", "+super.toString();
}








}
