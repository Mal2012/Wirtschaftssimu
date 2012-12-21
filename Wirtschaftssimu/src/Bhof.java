import java.util.ArrayList;

public class Bhof extends Gebaeude{
	
	private static ArrayList<Bhof> listing;
	
	public static void init() {
		Bhof.listing = new ArrayList<Bhof>();	
	}
	
	public Bhof(int posx, int posy, int size, int holdpersons, int resourcebonus) {	
		this.posx = posx;
		this.posy = posy;
		this.size = size;
		this.holdpersons = holdpersons;
		this.resourcebonus = resourcebonus;
		this.name = "Bauernhof_"+Bhof.listing.size()+1;
		this.kind = "Agrarwirtschaft";
		Bhof.listing.add(this);
		Gebaeude.listing.add(this);
	}
}
