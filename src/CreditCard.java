public class CreditCard {

    int accountNumber;

    int currentSum;

    void addMoney(int count) {
        currentSum = currentSum + count;
    }
    void payMoney(int count) {
        currentSum = currentSum - count;
    }

    int getCurrentSumInInt() {
        System.out.println("Номер карты:  " + accountNumber);
        return (int) currentSum;
    }

}



