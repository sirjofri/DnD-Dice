import java.util.Scanner;

public class DnDMachine {
	public static void main(String[] args)
	{
		Scanner interpret; // initialize interpreter
		Scanner read=new Scanner(System.in);
		while(true)
		{
			System.out.print("Which dice? ");
			String input=read.next();
			if(input.contentEquals("quit")) break; //exit if "quit"
			interpret=new Scanner(input).useDelimiter("\\s*d\\s*"); //use "d" as delimiter
			int number=interpret.nextInt(); //number -> the number of rolls
			int dice=interpret.nextInt(); //dice -> the value of the dice
			System.out.println(Dice.roll(number,dice));
		}
		System.out.print("Program terminated.");
	}
}
