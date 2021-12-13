public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int balanceOffer = 1200;
        int bonus = balanceOffer / 100;
        int totalBalance;
        if (balanceOffer > 1000) {
            totalBalance = balanceOffer + bonus + startBalance;
            System.out.println("Ваш баланс равен " + totalBalance + " рублей." + " В том числе Вам начислено " + bonus + " бонусных рублей.");
        } else {
            totalBalance = balanceOffer + startBalance;
            System.out.println("Ваш баланс равен " + totalBalance + " рублей.");
        }
    }
}
