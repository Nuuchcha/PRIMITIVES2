public class Main {
    public static void main(String[] args) {
        int invoiceAmount = 26;
        int addAmount = 1123;
        int bonus = 0;

        if (addAmount > 1000) {
            bonus = addAmount / 100;
        }
        invoiceAmount = invoiceAmount + addAmount + bonus;
        System.out.println("Начислено бонусов:" + bonus);
        System.out.println("На счету:" + invoiceAmount);
    }
}