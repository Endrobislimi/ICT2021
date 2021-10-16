package OOP.BankAccount;

public class BankaAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setName("Endrit Bislimi");
        account.deposit(9000);
        account.setAccountNumber((long) (Math.random()*10000000000000000l));
        account.setCardNumber((long) (Math.random()*10000000000000000l));
        account.setPin((int) (Math.random()*10000));
        account.setSecurityCode((int) (Math.random()*1000));
        account.setCardType("VISA");
        account.setBankName("Raiffeisen Bank Kosovo");
        System.out.println("------------------------------------------------");
        System.out.println("Emri dhe mbiemri: "+account.getName());
        System.out.println("Emri i bankes: "+account.getBankName());
        System.out.println("Numri i llogarise: "+account.getAccountNumber());
        System.out.println("Numri i karteles: "+account.getCardNumber());
        System.out.println("Pin i karteles: "+account.getPin());
        System.out.println("Security Code: "+account.getSecurityCode());
        System.out.println("Tipi kartes: "+account.getCardType());
        System.out.println("Bilanci aktual: "+account.getBalance());
        System.out.println("------------------------------------------------");
        account.withdraw();
        account.checkBalance();
        account.printFature();


        System.out.println("Ju faleminderit");
    }
}
