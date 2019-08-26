package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        boolean isOn = true;


        String option = "";
        Scanner scanner = new Scanner(System.in);

        while(isOn) {

            System.out.print("Write action (buy, fill, take, exit, remaining):");
            option = scanner.nextLine().trim();
            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    option = scanner.nextLine().trim();
                    switch (option) {
                        case "1":
                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                                water -= 250;
                                coffeeBeans -= 16;
                                money += 4;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (coffeeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;

                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                money += 7;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffeeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;

                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                money += 6;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffeeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;

                        case "back":
                            break;

                        default:
                            System.out.println("Unsupported drink");
                    }
                    System.out.println();
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    if (scanner.hasNextLine()) {
                        water += Integer.parseInt(scanner.nextLine());
                    }

                    System.out.println("Write how many ml of milk do you want to add:");
                    if (scanner.hasNextLine()) {
                        milk += Integer.parseInt(scanner.nextLine());
                    }

                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    if (scanner.hasNextLine()) {
                        coffeeBeans += Integer.parseInt(scanner.nextLine());
                    }

                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    if (scanner.hasNextLine()) {
                        cups += Integer.parseInt(scanner.nextLine());
                    }
                    break;

                case "take":
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffeeBeans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;

                case "exit":
                    isOn = false;
                    break;
                default:
            }
        }
    }
}