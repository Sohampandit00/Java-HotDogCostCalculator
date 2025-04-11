import java.util.Scanner;
public class unit1Vocab
	{
	// instance variables - replace the example below with your own
	public static void main(String[] args){
	Scanner myScan = new Scanner(System.in);

	System.out.println("How many Hotdogs would you like, hotdogs are $2.50 each: ");
	int hotdogs = myScan.nextInt();
	System.out.println("Your total is: " + (hotdogs * 2.50) * 1.07);
	System.out.println("Your total without tax is: " + (hotdogs * 2.50));
	System.out.println("Your tax total is: " + ((hotdogs * 2.50) * 1.07) / (hotdogs * 2.50));

}