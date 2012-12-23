public class Population {
	int mood; // Stimmung 1-10
	int anzahl; //Bevölkerungsanzahl
	int sterberate; // Sterberate in Prozent
	int geburtenrate; // Geburtenrate in Prozent
	
	
	public void berechneWachstum(){
		int tote = anzahl * sterberate / 100;
		int neugeborene = anzahl * geburtenrate /100;
		this.anzahl = anzahl - tote + neugeborene;		
	}
	
	public void berechneSterberate(){
		switch(mood){
		case 1: sterberate = 90 +(int) (10*Math.random()); break;
		case 2: sterberate = 80 +(int) (10*Math.random()); break;
		case 3: sterberate = 70 +(int) (10*Math.random()); break;
		case 4: sterberate = 60 +(int) (10*Math.random()); break; 
		case 5: sterberate = 50 +(int) (10*Math.random()); break;
		case 6: sterberate = 40 +(int) (10*Math.random()); break;
		case 7: sterberate = 30 +(int) (10*Math.random()); break;
		case 8: sterberate = 20 +(int) (10*Math.random()); break;
		case 9: sterberate = 10 +(int) (10*Math.random()); break;
		case 10: sterberate = 0 +(int) (10*Math.random()); break;
		}
		
	}
	
	public void berechneGeburtenrate(){
		switch(mood){
		case 10: geburtenrate = 90 +(int) (10*Math.random()); break;
		case 9: geburtenrate = 80 +(int) (10*Math.random()); break;
		case 8: geburtenrate = 70 +(int) (10*Math.random()); break;
		case 7: geburtenrate = 60 +(int) (10*Math.random()); break; 
		case 6: geburtenrate = 50 +(int) (10*Math.random()); break;
		case 5: geburtenrate = 40 +(int) (10*Math.random()); break;
		case 4: geburtenrate = 30 +(int) (10*Math.random()); break;
		case 3: geburtenrate = 20 +(int) (10*Math.random()); break;
		case 2: geburtenrate = 10 +(int) (10*Math.random()); break;
		case 1: geburtenrate = 0 +(int) (10*Math.random()); break;
		}
	}
	
	public void berechneStimmung(){
		
		
	}
	
	
	
}
	
	

