package opdracht;

import org.omg.Messaging.SyncScopeHelper;

public class Kassa {
	
	private int verkoopkaarten;
	private double omzet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getVerkoopkaarten() {
		return "totaal aantal verkochte kaarten op de Kermis is = " + this.verkoopkaarten;
	}
	
	public void setVerkoopkaarten(int kaart1, int kaart2, int kaart3, int kaart4, int kaart5, int kaart6) {
		System.out.println("Botsauto verkochte kaarten = " +kaart1);
		System.out.println("Spin verkochte kaarten = " +kaart2);
		System.out.println("Spookhuis verkochte kaarten = " +kaart3);
		System.out.println("Ladderklimmen verkochte kaarten = " +kaart4);
		System.out.println("Hawaii verkochte kaarten = " +kaart5);
		System.out.println("Spiegelpaleis verkochte kaarten = " +kaart6);
		this.verkoopkaarten = (kaart1 +kaart2+kaart3+kaart4+kaart5+kaart6);
	}
	public String getOmzet() {
		return "totaal omzet op de Kermis is = " + this.omzet;
	}
	public void setOmzet(double omzet1, double omzet2, double omzet3, double omzet4, double omzet5, double omzet6) {
		System.out.println("Botsauto omzet = " +omzet1);
		System.out.println("Spin omzet = " +omzet2);
		System.out.println("Spookhuis omzet = " +omzet3);
		System.out.println("Ladderklimmen omzet = " +omzet4);
		System.out.println("Hawaii omzet = " +omzet5);
		System.out.println("Spiegelpaleis omzet = " +omzet6);
		this.omzet = (omzet1+omzet2+omzet3+omzet4+omzet5+omzet6);
	}


}
