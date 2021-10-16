package OOP.BankAccount;

import java.util.Scanner;

public class BankAccount {
    Scanner reader = new Scanner(System.in);
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    double balance;

    public BankAccount() {

    }
    public BankAccount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    private long accountNumber;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    private long cardNumber;

    public BankAccount(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    private int pin;

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    private int securityCode;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    private String cardType;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    private String bankName;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Vlerat e lejuara jane vlerat pozitive deri ne 10000");
            return;
        }
        if (amount > 10000) {
            System.out.println("Nuk mundesh me depozitu pa deshmi");
            return;
        }
        balance += amount;
    }

    public void withdraw() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Deshironi te terhiqni para");
        System.out.println("Per te terhequr para shtypni 1");
        System.out.println("Per te dalur shtypni nje numer tjeter ");
        int terhiqPara = reader.nextInt();
        System.out.println("------------------------------------------------");
        switch (terhiqPara) {
            case 1: {
                System.out.print("Sa para deshironi ti terhiqni: ");
                double amount1 = reader.nextDouble();
                if (amount1 > 1000) {
                    System.out.println("Ju nuk mund te terhiqni me shume se 1000");
                    return;
                } else if (amount1 < 0) {
                    System.out.println("Ju keni shkruar nje numer jovalid");
                    return;
                }
                System.out.println("Bilanci juaj pas terheqjes eshte: " + (balance -= amount1));
                break;
            }
            default:
                System.out.println();
        }
    }
            public void checkBalance() {
                System.out.println();
                System.out.println("------------------------------------------------");
            System.out.println("Per te kontrolluar bilancin tuaj shtypni numrin 1");
            System.out.println("Per te dal shtypni nje numer tjeter");
            int numri = reader.nextInt();
                System.out.println("------------------------------------------------");
            switch (numri){
                case 1:
                    System.out.println("Bilanci juaj eshte: "+balance);
                    break;
                default:
                    System.out.println();
            }
                System.out.println("------------------------------------------------");
        }
        public void printFature() {
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("Per te shtypur faturen tuaj shtypni 1");
            System.out.println("Per te dalur shtypni nje numer tjeter");
            int print = reader.nextInt();
            System.out.println("------------------------------------------------");
            switch (print) {
                case 1: {
                    System.out.println("------------------------------------------------");
                    System.out.println("Emri juaj: "+getName());
                    System.out.println("Banka: "+getBankName());
                    System.out.println("Numri i llogarise: "+getAccountNumber());
                    System.out.println("Bilanci juaj: "+getBalance());
                    System.out.println("------------------------------------------------");
                    break;
                }
                default:
                    System.out.println("Exit");
                    System.out.println("------------------------------------------------");
            }

    }
}



