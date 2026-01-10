package CreditCarts;

public class CreditCartTest {
    public static void main(String[] args){
        CreditCart card1=new CreditCart("1111-1111-1111-1111", 5000);
        CreditCart card2=new CreditCart("2222-2222-2222-2222", 1000);
        CreditCart card3=new CreditCart("3333-3333-3333-3333",3000);

        System.out.println("В ДАННЫЙ МОМЕНТ::");
        card1.info();
        System.out.println();
        card2.info();
        System.out.println();
        card3.info();
        System.out.println();

        System.out.println("ВЫПОЛНЕНИЕ ОПЕРАЦИЙ:");
        card1.withdrawal(2000);
        System.out.println();
        card2.deposit(800);
        System.out.println();
        card3.deposit(1200);
        System.out.println();

        System.out.println("БАЛАНС ПОСЛЕ ОПЕРАЦИЙ:");
        card1.info();
        System.out.println();
        card2.info();
        System.out.println();
        card3.info();
    }
}
