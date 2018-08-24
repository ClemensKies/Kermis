package opdracht;

public class Belastinginspectie {
	double belastinggeld;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	String belastingheffen(Object Attracties, double omzet_attractie) {
		if(Attracties instanceof Gokattractie)
			return "Belasting geheven = " + (omzet_attractie*0.30);
		else
			return "geen belasting geheven";
	}
}
