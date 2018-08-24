package opdracht;

abstract class Attracties {
	String naam;
	double prijs;
	double oppervlakte;
	int verkoopkaarten;
	double omzet;

	public static void main(String[] args) {

	}
}

abstract class RisicoRijkeAttracties extends Attracties{
	int draailimiet;
	
	public abstract boolean OpstellingsKeuring(); 
}

class Spin extends RisicoRijkeAttracties{
	private double prijs = 2.25;
	private String naam;
	int draailimiet;
	
	public Spin(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}
	
	@Override
	public boolean OpstellingsKeuring() {
		
		if(this.draailimiet ==5) {
			draailimiet++;
			return true;
		}
		else {
			draailimiet++;
			return false;
	}
	}	
	
}
class Hawaii extends RisicoRijkeAttracties{
	private double prijs = 2.90;
	private String naam;
	int draailimiet;
	
	public Hawaii(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}

	@Override
	public boolean OpstellingsKeuring() {
		
		if(this.draailimiet== 10) {
			draailimiet++;
			return true;
		}
		else {
			draailimiet++;
			return false;
	}
	}	
	
}
class Spookhuis extends Attracties{
	private double prijs = 3.20;
	private String naam;
	
	public Spookhuis(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}
	
}
class Spiegelpaleis extends Attracties{
	private double prijs = 2.75;
	private String naam;
	
	public Spiegelpaleis(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}
	
}
class Botsauto extends Attracties{
	private double prijs = 2.50;
	private String naam;
	
	
	public Botsauto(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}

	
	
}
class Ladderklimmen extends Attracties implements Gokattractie{
	private double prijs = 5.00;
	private String naam;
	
	public Ladderklimmen(){
		this.naam = "Spin";
	}

	public double getPrijs() {
		return prijs;
	}
	
}

interface Omzet{
	double omzetBerekening(int kaarten, double prijs);
	
}

interface Gokattractie{
}

