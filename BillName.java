import java.util.Scanner;
public class BillName  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the bill name or description");
        String billName = scanner.nextLine();
        System.out.println("Please insert price one:");
        double priceOne = scanner.nextDouble();
        System.out.println("Please insert price two:");
        double priceTwo = scanner.nextDouble();
        double totalPrice = priceOne + priceTwo;
        double tax = totalPrice *0.19;
        double totalPriceWithTaxes = totalPrice + tax;
        String resultText = "The %s bill has a price of %f1 plus %f2 tax, so the final price is %f3";
        System.out.println(String.format(resultText, billName, totalPrice, tax, totalPriceWithTaxes));
        main(args);
        /*
        double a = 0.333333333333333333;
        double b = a*3;
        System.out.println((1.0==b));
        System.out.println(b);
        System.out.println(String.format("%f", b));
        */
    }
}
