public class Main {
    public static void main(String[] args) {
        int balance = 5000;
        double interest;

        interest = balance * .17;
        System.out.println("The interest after one month is " + interest);

        interest = (balance + interest) * .17;
        System.out.println("The interest after two months is " + interest);
    }
}