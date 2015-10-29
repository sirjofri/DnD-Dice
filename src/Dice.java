public class Dice {
	/**
	 * Die Funktion w�rfelt einen oder mehrere W�rfel anhand von folgenden Eingabeparametern:
	 * @param number Anzahl der W�rfel
	 * @param dice Anzahl der Seiten eines der W�rfel
	 * @return R�ckgabewert ist ein String mit dem Format "&lt;ergebnis&gt; (&lt;wurf1&gt;, &lt;wurf2&gt;, ...)"
	 */
	public static String roll(int number, int dice) // Roll-Funktion
	{
		int result=0; //Gesamtergebnis (addition der einzelw�rfe)
		String singles=""; //Einzelw�rfe als string
		for(int i=number;i>0;i--) //FOR-Schleife
		{
			if(i!=number) // beim ersten wurf kein Komma mit einf�gen
			{
				singles=singles+"+"; // komma einf�gen
			}
			int rolled=(int)(Math.random()*(dice-1))+1; //Zufallszahl als grundlage
			result+=rolled; //einzelwurf zum gesamtergebnis addieren
			singles=singles+rolled; //einfache string-concatenation: einzelwurf anh�ngen
		}
		return result+" = "+singles+""; //Ausgeben von "<ergebnis> (<wurf1>, <wurf2>, ...)"
	}
}
