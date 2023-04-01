public class Main {
    public static void main(String[] args) {
        int balance = 100, deposit = 1100; // баланс счета клиента и его сумма пополнения
        int bonus = 100;                   // бонусный рубль за каждые 100 рублей пополнения

        balance = deposit > 1000 ? balance + deposit + (deposit / bonus) : balance + deposit;
        
        System.out.println("Баланс после пополнения: " + balance);
    }
}