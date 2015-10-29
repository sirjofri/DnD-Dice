import java.util.Scanner;

public class DnDMachine {
	public static void main(String[] args)
	{
		Scanner interpret; //scanner zum interpretieren der eingabe
		Scanner read=new Scanner(System.in); //scanner zum einlesen der eingabe
		while(true) //dauerschleife, die bei eingabe von "quit" unterbrochen (break) wird.
		{
			System.out.print("Which dice? ");
			String input=read.next(); //Einlesen der eingabe
			if(input.contentEquals("quit")) break; //Programmabbruch falls "quit"
			interpret=new Scanner(input).useDelimiter("\\s*d\\s*"); //Trennen beim "d" (5d10 => (5,10) )
			int number=interpret.nextInt(); //number = 5; die anzahl an würfeln
			int dice=interpret.nextInt(); //dice = 10; der Würfelwert
			System.out.println(Dice.roll(number,dice)); //ausgeben der ausgabe der "roll"-funktion
		}
		System.out.print("Program terminated.");
	}
}
