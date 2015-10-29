public class Dice {
	/**
	 * Die Funktion würfelt einen oder mehrere Würfel anhand von folgenden Eingabeparametern:
	 * @param number Anzahl der Würfel
	 * @param dice Anzahl der Seiten eines der Würfel
	 * @return Rückgabewert ist ein String mit dem Format "&lt;ergebnis&gt; (&lt;wurf1&gt;, &lt;wurf2&gt;, ...)"
	 */
	public static String roll(int number, int dice) // Roll-Funktion
	{
		int result=0; //Gesamtergebnis (addition der einzelwürfe)
		String singles=""; //Einzelwürfe als string
		for(int i=number;i>0;i--) //FOR-Schleife
		{
			if(i!=number) // beim ersten wurf kein Komma mit einfügen
			{
				singles=singles+"+"; // komma einfügen
			}
			int rolled=(int)(Math.random()*(dice-1))+1; //Zufallszahl als grundlage
			result+=rolled; //einzelwurf zum gesamtergebnis addieren
			singles=singles+rolled; //einfache string-concatenation: einzelwurf anhängen
		}
		return result+" = "+singles+""; //Ausgeben von "<ergebnis> (<wurf1>, <wurf2>, ...)"
	}
}
