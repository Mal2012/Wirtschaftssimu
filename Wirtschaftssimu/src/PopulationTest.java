
public class PopulationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gebaeude.init();
		new Wohnhaus(5,5,5,50,10,10);
		Population.berechneStimmung();
		Population.berechneSterberate();
		Population.berechneGeburtenrate();
		System.out.println(Population.sterberate);
		System.out.println(Population.geburtenrate);
	}

}
