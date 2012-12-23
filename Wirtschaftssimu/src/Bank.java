import java.util.ArrayList;


public class Bank extends Gebaeude{

	private static ArrayList<Bank> listing;
	
	public static void init() {
		Bank.listing = new ArrayList<Bank>();	
	}
	
	public Bank(int posx, int posy, int size, int holdpersons, int moneybonus) {	
		this.posx = posx;
		this.posy = posy;
		this.size = size;
		this.holdpersons = holdpersons;
		this.moneybonus = moneybonus;
		this.name = "Bank_"+(Bank.listing.size()+1);
		this.kind = "Finanzwirtschaft";
		Bank.listing.add(this);
		Gebaeude.listing.add(this);
	}
}

