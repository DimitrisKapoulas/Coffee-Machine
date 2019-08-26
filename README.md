# Coffee-Machine
Stage 1/6: Hello, coffee!
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

Stage 2/10: Machines have needs
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

Stage 3/10: Enough coffee for everyone
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
