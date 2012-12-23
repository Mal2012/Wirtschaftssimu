import java.util.ArrayList;

public class Gebaeude {
	protected int posx, posy, size, holdpersons, resourcebonus, moneybonus, moodbonus;
	protected String name, kind;
	protected static ArrayList<Gebaeude> listing; 
	
	public static void init() {
		Gebaeude.listing = new ArrayList<Gebaeude>();
		Bhof.init();
		Bank.init();
	}
	
	public static String getListing() {
		String listing = "";
		for(int i = 0; i < Gebaeude.listing.size(); i++) {
			listing += Gebaeude.listing.get(i)+"\n";
		}
		return listing;
	}
	
	@Override
	public String toString() {
		return "Gebaeude: [name=" + this.name + ", kind="+this.kind+", posx=" + this.posx + ", posy=" + this.posy + ", size=" + this.size
				+ ", holdpersons=" + this.holdpersons + ", resourcebonus="
				+ this.resourcebonus + ", moneybonus=" + this.moneybonus + ", moodbonus="
				+ this.moodbonus + "]";
	}
}
