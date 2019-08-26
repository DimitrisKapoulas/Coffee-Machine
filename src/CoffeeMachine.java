package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        int water = 1200;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        Scanner scanner = new Scanner(System.in);

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println("Write action (buy, fill, take): ");
        String option = scanner.nextLine();

        switch (option){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int coffeeOption = scanner.nextInt() ;

                if (coffeeOption == 1) {
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    cups -= 1;

                } else if (coffeeOption == 2) {
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                    cups -= 1;

                } else if (coffeeOption == 3) {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    cups -= 1;

                }
                break;
            case "fill" :
                System.out.println("Write how many ml of water do you want to add:");
                if(scanner.hasNextLine()){  water += scanner.nextInt(); }

                System.out.println("Write how many ml of milk do you want to add:");
                if(scanner.hasNextLine()){  milk += scanner.nextInt(); }

                System.out.println("Write how many grams of coffee beans do you want to add:");
                if(scanner.hasNextLine()){  coffeeBeans += scanner.nextInt(); }


                System.out.println("Write how many disposable cups of coffee do you want to add:");
                if(scanner.hasNextLine()){  cups += scanner.nextInt(); }
                break;
            case "take":
                System.out.println("I gave you " + money);
                money = 0;
                break;
            default:
                break;
        }

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }

}