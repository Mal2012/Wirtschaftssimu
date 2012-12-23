import java.util.ArrayList;


public class Wohnhaus extends Gebaeude{

	private static ArrayList<Wohnhaus> listing;
	
	public static void init() {
		Wohnhaus.listing = new ArrayList<Wohnhaus>();	
	}
	
	public Wohnhaus(int posx, int posy, int size, int holdpersons, int moneybonus) {	
		this.posx = posx;
		this.posy = posy;
		this.size = size;
		this.holdpersons = holdpersons;
		this.moneybonus = moneybonus;
		this.name = "Wohnhaus_"+Wohnhaus.listing.size()+1;
		this.kind = "Wohngebäude";
		Wohnhaus.listing.add(this);
		Gebaeude.listing.add(this);
	}
}

