import java.util.ArrayList;


public class GebauedeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Bhof> bhof = new ArrayList<Bhof>(); 
		ArrayList<Bank> bank = new ArrayList<Bank>(); 
		// TODO Auto-generated method stub

		bhof.add(new Bhof(50, 20, 10, 5 ,5));
		bank.add(new Bank(0, 0, 10, 2 ,5));
		for(int i = 0; i<bhof.size(); i++){
		System.out.println(bhof.get(i));
		}
		for(int i = 0; i<bank.size(); i++){
			System.out.println(bank.get(i));
			}
	}

}
