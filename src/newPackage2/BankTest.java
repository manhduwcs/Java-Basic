package newPackage2;

public class BankTest {
    public static void main(String[] args) {
	Bank Techcombank = new Bank();
	Techcombank.createAccount("Nguyen Duc Hoang", 300);
	Techcombank.createAccount("Dinh Viet Hung", 250);
	Techcombank.createAccount("Hoang Viet Long", 420);

	Techcombank.displayAllAccounts();
//	Techcombank.deposit(Techcombank.getCustomerAccountNumberByName("Nguyen Duc Hoang"), 90);
//	Techcombank.withdraw(Techcombank.getCustomerAccountNumberByName("Nguyen Duc Hoang"), 390);
	Techcombank.deposit(Techcombank.getCustomerAccountNumberByName("Dinh Viet Hung"), 120);
    }
}
