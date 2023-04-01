public class Main {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        myCard.accountNumber = 6178;
        myCard.currentSum = 100;

        myCard.addMoney(20);

        System.out.println(myCard.currentSum);

        myCard.payMoney(30);

        System.out.println(myCard.currentSum);

        System.out.println(myCard.getCurrentSumInInt());

        CreditCard myCard1 = new CreditCard();
        myCard1.accountNumber = 1111;
        myCard1.currentSum = 50;


        CreditCard myCard2 = new CreditCard();
        myCard2.accountNumber = 2222;
        myCard2.currentSum = 60;

        CreditCard myCard3 = new CreditCard();
        myCard3.accountNumber = 3333;
        myCard3.currentSum = 40;

        myCard1.addMoney(10);
        myCard2.addMoney(10);
        myCard3.payMoney(10);

        System.out.println("Текущий баланс: " + myCard1.getCurrentSumInInt());
        System.out.println("Текущий баланс: " + myCard2.getCurrentSumInInt());
        System.out.println("Текущий баланс: " + myCard3.getCurrentSumInInt());


    }


}
