package newPackage2;

public class Bank {
    protected Account accounts[];
    private int nextAccount;
    protected int maximumAccounts;
    protected int nextAccountNumber;

    public Bank() {
	nextAccount = 0;
	maximumAccounts = 10;
	accounts = new Account[maximumAccounts];
	nextAccountNumber = 100000;
    }

    public void displayAccountDetails(Account acc) {
	if (acc == null) {
	    return;
	}
	System.out.println(acc.getCustomerName() + " account details : ");
	System.out.println("Account Number : " + acc.getAccountNumber());
	System.out.println("Account Balance : " + acc.getAccountBalance());
	System.out.println("-------------------------------------");
    }

    public void displayAllAccounts() {
	System.out.println("All Account Detail : ");
	for (int i = 0; i < maximumAccounts; i++) {
	    displayAccountDetails(accounts[i]);
	}
    }

    public Account getCustomerAccount(String customerName) {
	for (int i = 0; i < maximumAccounts; i++) {
	    if (accounts[i].getCustomerName() == customerName) {
		return accounts[i];
	    }
	}
	return null;
    }

    public int getCustomerAccountNumberByName(String customerName) {
	for (int i = 0; i < maximumAccounts; i++) {
	    if (accounts[i] == null) {
		continue;
	    }
	    if (accounts[i].getCustomerName() == customerName) {
		return accounts[i].getAccountNumber();
	    }
	}
	return 0;
    }

    public void createAccount(String customerName, double accountBalance) {
	try {
	    if (nextAccount >= maximumAccounts) {
		throw new Exception("Cannot add more account : Maximum limit reached.");
	    }
	    if (customerName == null || customerName.trim().isEmpty()) {
		throw new Exception("Invalid Customer Name. Please try again");
	    }
	    if (accountBalance < 100.0) {
		throw new Exception("Invalid Opening Balance : opening balance must be at least 100 USD");
	    }

	    Account newaccount = new Account(customerName, nextAccountNumber + nextAccount, accountBalance);
	    accounts[nextAccount] = newaccount;
	    nextAccount++;
	    System.out.println("Account created succesfully for user " + newaccount.getCustomerName());

	} catch (Exception e) {
	    System.out.println("Failed when creating new account : Invalid user information. Please try again !");
	}
    }

    public void withdraw(int inputAccountNumber, double moneyWithdraw) {
	try {
	    if (inputAccountNumber < 0) {
		throw new Exception("Invalid account number. Please try again !");
	    }
	    if (moneyWithdraw < 100) {
		throw new Exception("Money per withdraw must be greater than 100 USD");
	    }
	    for (int i = 0; i < maximumAccounts; i++) {
		if (accounts[i].getAccountNumber() == inputAccountNumber) {
		    if (moneyWithdraw <= accounts[i].getAccountBalance()) {
			accounts[i].setAccountBalance(accounts[i].getAccountBalance() - moneyWithdraw);
			System.out.println("Withdraw succesfully.");
			System.out.println("You've withdraw " + moneyWithdraw + " USD");
			displayAccountDetails(accounts[i]);
			return;
		    } else {
			throw new InsufficientFundsException("Error : Withdrawal amount exceeds current balance");
		    }
		}
	    }
	    throw new Exception("Error : Cannot find user's account number. Please try again !");
	} catch (Exception e) {
	    System.out.println("Error : Invalid input information. Please try again !");
	}
    }

    public void deposit(int inputAccountNumber, double moneyDeposit) {
	try {
	    if (inputAccountNumber < 0) {
		throw new Exception("Invalid account number. Please try again !");
	    }
	    if (moneyDeposit < 0) {
		throw new Exception("Invalid deposit amount. Please try again !");
	    }
	    for (int i = 0; i < maximumAccounts; i++) {
		if (accounts[i].getAccountNumber() == inputAccountNumber) {
		    accounts[i].setAccountBalance(accounts[i].getAccountBalance() + moneyDeposit);
		    System.out.println("Deposit succesfully !");
		    System.out.println("You've add " + moneyDeposit + " USD into your account");
		    displayAccountDetails(accounts[i]);
		    return;
		}
	    }
	    throw new Exception("Error : Cannot find user's account number. Please try again !");
	} catch (Exception e) {
	    System.out.println("Error : Invalid input information. Please try again !");
	}
    }

}
