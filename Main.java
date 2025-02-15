// COLLABORATORS: Conal Hamilton

// DESCRIPTION: A program to convert decimal dollar amounts into denominations of commonly used coins.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
double numQuarters,numDimes,numNickels,numPennies = 0;
int intQuarters,intDimes,intNickels,intPennies = 0;
double amountMoney = 27.91;
    //CALCULATION SECTION
numQuarters = amountMoney / 0.25;
numDimes = (amountMoney - (int)numQuarters * .25) / .1;
numNickels = (amountMoney - (int)numQuarters * .25 - (int)numDimes * .1) / .05;
numPennies = (amountMoney - (int)numQuarters * .25 - (int)numDimes * .1 - (int)numNickels * .05) / .01;
intQuarters = (int)numQuarters;
intDimes = (int)numDimes;
intNickels = (int)numNickels;
intPennies = (int)numPennies;
    //OUTPUT SECTION
System.out.printf("$%.2f can be converted into %d quarters, %d dimes, %d nickels, and %d pennies.",amountMoney,intQuarters,intDimes,intNickels,intPennies);

  }

}
