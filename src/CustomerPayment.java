package Project;

public abstract class CustomerPayment implements Comparable<CustomerPayment> {
protected String customerName;
protected int customerId;
protected double amount;



public CustomerPayment() {
this(" ",12,1.5);
}



public CustomerPayment(String customerName, int customerId, double amount) {
	this.customerName = customerName;
	this.customerId = customerId;
	this.amount = amount;
}



public String getCustomerName() {
	return customerName;
}



public void setCustomerName(String customerName) {
	this.customerName = customerName;
}



public int getCustomerId() {
	return customerId;
}



public void setCustomerId(int customerId) {
	this.customerId = customerId;
}



public double getAmount() {
	return amount;
}



public void setAmount(double amount) {
	this.amount = amount;
}



protected abstract double calculatePayment();

 void printPaymentInfo() {
	System.out.println(this.toString()+" payment = "+this.calculatePayment());
}

@Override
public String toString() {
	return "customerName=" + this.customerName + ", customerId=" + this.customerId + ", amount=" + this.amount + "]";
}

@Override
public int compareTo(CustomerPayment s) {
	if(s.calculatePayment()>this.calculatePayment())   return 1;
	else if(s.calculatePayment()<this.calculatePayment())   return -1;
	else return 0;
	
	
}
}
