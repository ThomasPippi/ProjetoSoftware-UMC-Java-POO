import entidades.Roupa;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Roupa roupa = new Roupa(
               "Zara",
               "Blusa",
               "G",
               50,
               98.90
       );

       System.out.println(roupa.toString());

       System.out.print("\nDigite quantas peças foram vendidas: ");
       int sale = input.nextInt();
       System.out.println(roupa.setDecreaseInventory(sale));


       System.out.print("\nDigite quantas peças chegaram: ");
       int received = input.nextInt();
       System.out.println(roupa.setIncreaseInventory(received));

       System.out.println(roupa.toString());

   }
}
