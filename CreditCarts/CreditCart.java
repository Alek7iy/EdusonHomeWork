package CreditCarts;

public class CreditCart {
    private String AccountNumber;
    private double balance;

    public CreditCart(String AccountNumber,double balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    public void deposit(double sum){
        balance += sum;
        System.out.printf("Зачислено: %f на карту %s. Баланс: %f ", sum, AccountNumber, balance);
    }
    public void withdrawal(double sum){
        balance -= sum;
        System.out.printf("Снято: %f с карты %s. Баланс: %f ", sum, AccountNumber, balance);
    }
    public void info(){
        System.out.printf("На карте: %s .Баланс: %f ", AccountNumber, balance);
    }

}