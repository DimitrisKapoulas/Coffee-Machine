# Coffee-Machine
Stage 1/5: Hello, coffee!
Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.

Output example

Using the "Hello, World!" program, write the program that prints all lines as in the example below.

Starting to make a coffee </br>
Grinding coffee beans</br>
Boiling water</br>
Mixing boiled water with crushed coffee beans</br>
Pouring coffee into the cup</br>
Pouring some milk into the cup</br>
Coffee is ready!</br>

Stage 2/5: Machines have needs
Description

Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests. The program should calculate how much water, coffee beans, and milk are necessary to make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.
Output example

The example below shows how your output might look.
Write how many cups of coffee you will need: 25</br>
For 25 cups of coffee you will need:</br>
5000 ml of water</br>
1250 ml of milk</br>
375 g of coffee beans</br>

Write how many cups of coffee you will need: 125</br>
For 125 cups of coffee you will need:</br>
25000 ml of water</br>
6250 ml of milk</br>
1875 g of coffee beans</br>

Stage 3/5: Enough coffee for everyone
Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.
Output example

The program should firstly request for water, then milk, then beans, then amount of cups.</br>
Write how many ml of water the coffee machine has: 300</br>
Write how many ml of milk the coffee machine has: 65</br>
Write how many grams of coffee beans the coffee machine has: 100</br>
Write how many cups of coffee you will need: 1</br>
Yes, I can make that amount of coffee</br>

Write how many ml of water the coffee machine has: 500</br>
Write how many ml of milk the coffee machine has: 250</br>
Write how many grams of coffee beans the coffee machine has: 200</br>
Write how many cups of coffee you will need: 10</br>
No, I can make only 2 cup(s) of coffee</br>

Write how many ml of water the coffee machine has: 1550</br>
Write how many ml of milk the coffee machine has: 299</br>
Write how many grams of coffee beans the coffee machine has: 300</br>
Write how many cups of coffee you will need: 3</br>
Yes, I can make that amount of coffee (and even 2 more than that)</br>

Write how many ml of water the coffee machine has: 0</br>
Write how many ml of milk the coffee machine has: 0</br>
Write how many grams of coffee beans the coffee machine has: 0</br>
Write how many cups of coffee you will need: 1</br>
No, I can make only 0 cup(s) of coffee</br>

Write how many ml of water the coffee machine has: 0</br>
Write how many ml of milk the coffee machine has: 0</br>
Write how many grams of coffee beans the coffee machine has: 0</br>
Write how many cups of coffee you will need: 0</br>
Yes, I can make that amount of coffee </br>

Write how many ml of water the coffee machine has: 200</br>
Write how many ml of milk the coffee machine has: 50</br>
Write how many grams of coffee beans the coffee machine has: 15</br>
Write how many cups of coffee you will need: 0</br>
Yes, I can make that amount of coffee (and even 1 more than that)</br>

Stage 4/5: Action!
Description

Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

    For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
    For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
    And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

If the user writes "fill", the program should ask him how much water, milk, coffee beans and how many disposable cups he wants to add into the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 1200 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that. Try to use methods to implement every action that the coffee machine can do.

 
Output example

An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".

The coffee machine has:</br>
1200 of water</br>
540 of milk</br>
120 of coffee beans</br>
9 of disposable cups</br>
550 of money</br>

Write action (buy, fill, take): buy</br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3</br>

The coffee machine has:</br>
1000 of water</br>
440 of milk</br>
108 of coffee beans</br>
8 of disposable cups</br>
556 of money</br>

The coffee machine has:</br>
1200 of water</br>
540 of milk</br>
120 of coffee beans</br>
9 of disposable cups</br>
550 of money</br>

Write action (buy, fill, take): fill</br>
Write how many ml of water do you want to add: 2000</br>
Write how many ml of milk do you want to add: 500</br>
Write how many grams of coffee beans do you want to add: 100</br>
Write how many disposable cups of coffee do you want to add: 10</br>

The coffee machine has:</br>
3200 of water</br>
1040 of milk</br>
220 of coffee beans</br>
19 of disposable cups</br>
550 of money</br>

The coffee machine has:</br>
1200 of water</br>
540 of milk</br>
120 of coffee beans</br>
9 of disposable cups</br>
550 of money</br>

Write action (buy, fill, take): take
I gave you $550</br>

The coffee machine has:</br>
1200 of water</br>
540 of milk</br>
120 of coffee beans</br>
9 of disposable cups</br>
0 of money</br>

Stage 5/5: On a coffee loop
Description

But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.

Remember, that:

    For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
    For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
    And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

Output example

Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).

Write action (buy, fill, take, remaining, exit): remaining</br>

The coffee machine has:</br>
400 of water</br>
540 of milk</br>
120 of coffee beans</br>
9 of disposable cups</br>
$550 of money</br>

Write action (buy, fill, take, remaining, exit): buy</br>

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2</br>
I have enough resources, making you a coffee!</br>

Write action (buy, fill, take, remaining, exit): remaining</br>

The coffee machine has:</br>
50 of water</br>
465 of milk</br>
100 of coffee beans</br>
8 of disposable cups</br>
$557 of money</br>

Write action (buy, fill, take, remaining, exit): buy</br>

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2</br>
Sorry, not enough water!</br>

Write action (buy, fill, take, remaining, exit): fill</br>

Write how many ml of water do you want to add: 1000</br>
Write how many ml of milk do you want to add: 0</br>
Write how many grams of coffee beans do you want to add: 0</br>
Write how many disposable cups of coffee do you want to add: 0</br>

Write action (buy, fill, take, remaining, exit): remaining</br>

The coffee machine has:</br>
1050 of water</br>
465 of milk</br>
100 of coffee beans</br>
8 of disposable cups</br>
$557 of money</br>

Write action (buy, fill, take, remaining, exit): buy</br>

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2</br>
I have enough resources, making you a coffee!</br>

Write action (buy, fill, take, remaining, exit): remaining</br>

The coffee machine has:</br>
700 of water</br>
390 of milk</br>
80 of coffee beans</br>
7 of disposable cups</br>
$564 of money</br>

Write action (buy, fill, take, remaining, exit): take</br>

I gave you $564</br>

Write action (buy, fill, take, remaining, exit): remaining</br>

The coffee machine has:</br>
700 of water</br>
390 of milk</br>
80 of coffee beans</br>
7 of disposable cups</br>
0 of money</br>

Write action (buy, fill, take, remaining, exit): exit</br>
