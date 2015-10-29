public class Dice {
	/**
	 * This function rolls a given number of dice and returns the sum of them and the single throws
	 * @param number number of dice
	 * @param dice value of the dice (how many sides?)
	 * @return returns a string like "25 = 3+5+4+6+5+2"
	 */
	public static String roll(int number, int dice) // roll-function
	{
		int result=0; //sum of throws
		String singles=""; //single throws as string
		for(int i=number;i>0;i--)
		{
			if(i!=number)
			{
				singles=singles+"+";
			}
			int rolled=(int)(Math.random()*(dice-1))+1; //Math.random.
			result+=rolled; //add throw to sum
			singles=singles+rolled; //concatenate throw to the single throws
		}
		return result+" = "+singles+""; //output
	}
}
