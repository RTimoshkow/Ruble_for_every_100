public class Main {

    public static void main(String[] args) {

        int account = 500;
        int transferAmount = 1100;
        int finalBalans;

        if (transferAmount > 1000) {
            finalBalans = (account + transferAmount + transferAmount / 100);
        }
        else {
            finalBalans = account + transferAmount;
        }

        System.out.println("Ваш баланс = " + finalBalans);
    }
}
