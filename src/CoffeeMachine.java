package machine;
import java.util.Scanner ;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = scanner.nextInt();
        int milk = scanner.nextInt();
        int coffeeBeans = scanner.nextInt();
        int cups = scanner.nextInt();
        System.out.println("Write how many ml of water the coffee machine has: " + water);
        System.out.println("Write how many ml of milk the coffee machine has: " + milk);
        System.out.println("Write how many grams of coffee beans the coffee machine has: " + coffeeBeans);
        System.out.println("Write how many cups of coffee you will need: " + cups);


        if ( water < cups*200 || milk < cups*50 || coffeeBeans < cups*15 ){

            water /= 200;
            milk /= 50;
            coffeeBeans /= 15;
            int possible = Math.min(Math.min(water, milk), coffeeBeans);


            System.out.println("No, I can make only " + possible + " cup(s) of coffee");
        } else if (water > cups*200 && milk > cups*50 && coffeeBeans > cups*15){
            water -= cups*200 ;
            milk -= cups*50;
            coffeeBeans -= cups*15;

            int remWater = water/200 ;
            int remMilk = milk/50 ;
            int remBeans = coffeeBeans/15;
            int possible = Math.min(Math.min(remWater, remMilk), remBeans);

            if (possible > 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + possible + " more than that)");
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }

        }
    }
}
