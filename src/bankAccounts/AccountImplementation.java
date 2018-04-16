package bankAccounts;

public class AccountImplementation {
    public static void main(String[] args) {
        AccountMethods john = new AccountMethods();
        System.out.println(john.accountInformation());

        john.setAccountBalance(500);
        john.setAccountNumber(1);
        System.out.println(john.accountInformation());
    }
}
