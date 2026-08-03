public class Main {
    public static void main(String[] args) {

        boolean hasMoney = true;
        double balance = 1000;
        double tax = 0.1;

        balance = 2000;

        double total = balance * tax;

        System.out.println("O imposto a ser pago é: " + total);

//        System.out.println("Hello World!");
    }
}
