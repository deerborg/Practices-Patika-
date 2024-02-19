
package CashierProgram;
import java.util.Scanner;
/**
 *
 * @author deer
 */
public class Main {
    public static void main(String[] args) {
        Scanner userValue = new Scanner(System.in);

        System.out.println("Cashier program");
        System.out.println("------------------------------------------");
        
        //  Product prices
        double bananaPrice = 5.24;
        double applePrice = 3.27;
        double orangePrice = 2.51;
        double tomatoesPrice = 1.15;
        double cucumberPrice = 0.72;
        double totalPrice = 0;
        
        System.out.println("------------------------------------------");
        System.out.println("Price list: ");
        
        // Price List
        System.out.println("Banana Price: " + bananaPrice);
        System.out.println("Apple Price " + applePrice);
        System.out.println("Tomatoes Price:  " + tomatoesPrice);
        System.out.println("Cucumber Price " + cucumberPrice);
        System.out.println("Orange Price " + orangePrice);
        System.out.println("-----------------------------------------");
        
        System.out.println("Kilos of tomatoes: ");
        //Toplam tutarı = ürünün fiyat x istenilen kilo üzerinden toplam tutara ekledim.
        int tomatoesValue = userValue.nextInt();
        totalPrice += tomatoesValue*tomatoesPrice;

        System.out.println("Kilos of apple: ");
        int appleValue = userValue.nextInt();
        totalPrice += appleValue*applePrice;

        System.out.println("Kilos of orange: ");
        int orangeValue = userValue.nextInt();
        totalPrice += orangeValue*orangePrice;

        System.out.println("Kilos of banana: ");
        int bananaValue = userValue.nextInt();
        totalPrice += bananaValue*bananaPrice;

        System.out.println("Kilos of cucumber");
        int cucumberValue = userValue.nextInt();
        totalPrice += cucumberValue*cucumberPrice;
        System.out.println("-----------------------------------------");
        System.out.println("Total price : " + totalPrice);
        System.out.println("-----------------------------------------");





    }
}
