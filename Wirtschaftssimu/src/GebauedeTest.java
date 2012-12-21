import java.util.ArrayList;


public class GebauedeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ArrayList<Bhof> bhof = new ArrayList<Bhof>(); 
		//ArrayList<Bank> bank = new ArrayList<Bank>(); 
		// TODO Auto-generated method stub
		Gebaeude.init();
		new Bhof(5, 5, 5, 5, 5);
		
		System.out.println(Bhof.getListing());
		//bank.add(new Bank(0, 0, 10, 2 ,5));
		
		/*
		for(int i = 0; i<bhof.size(); i++){
		System.out.println(bhof.get(i));
		}
		for(int i = 0; i<bank.size(); i++){
			System.out.println(bank.get(i));
			}
		System.out.println("sa");
		*/
	}

}
