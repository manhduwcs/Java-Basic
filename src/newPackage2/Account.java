package newPackage2;

import java.time.LocalDate;

public class Account {
    protected String customerName;
    protected int accountNumber;
    protected double accountBalance;
    protected LocalDate createdDate;

    public Account(String customerName, int accountNumber, double accountBalance) {
	this.customerName = customerName;
	this.accountNumber = accountNumber;
	this.accountBalance = accountBalance;
	this.createdDate = LocalDate.now();
    }

    public String getCustomerName() {
	return this.customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public int getAccountNumber() {
	return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
	return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
    }

}
