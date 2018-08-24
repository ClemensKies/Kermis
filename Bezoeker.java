package opdracht;

// kies voor lambda expressies om de omzet berekenen, omdat dit scheelt in het maken van 6 methodes in attracties. 
// Bovendien kunnen lambdas ook heel gemakkelijk aangepast worden als je bijvoorbeeld belasting wilt heffen.
// Doe je door gewoon 0.7 neer te zetten in body van lambda. 
// de methodes die ik gebruik om de omzet te berekenen worden maar 1 keer aangeroepen. Daarvoor beter
// om lambda te gebruiken i.p.v. een methode te schrijven. 
import java.util.Scanner;

public class Bezoeker {
	Botsauto auto = new Botsauto();
	Spin spin = new Spin();
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	Hawaii hawaii = new Hawaii();
	Ladderklimmen ladderklimmen = new Ladderklimmen();
	Spookhuis spookhuis = new Spookhuis();
	Kassa kassa = new Kassa();
	Belastinginspectie inspecteur = new Belastinginspectie();


	public static void main(String[] args) {
	
	
	
	}
	public void attractieDraaien() {
		System.out.println("Om te kiezen welke attractie u graag in wilt dient u een keuze te maken\n"
				+ "Kies 1 voor Botsauto's,\n 2 voor Spookhuis,\n 3 voor Spin,\n 4 voor Spiegelpaleis,\n 5 voor Hawaii,\n 6 voor Ladderklimmen,\n 7 voor einde bezoek");
		
		boolean doorgaan = true; 
		while(doorgaan) {
		Scanner sc = new Scanner(System.in);
		int getal = sc.nextInt();
		
		switch (getal) {
		case 1:
			System.out.println("Botsauto draait");
			auto.verkoopkaarten ++;
			Omzet auto_omzet = (int k, double p)-> {k = auto.verkoopkaarten;
			p = auto.getPrijs();
			return k*p;		
			};
			auto.omzet=auto_omzet.omzetBerekening(auto.verkoopkaarten, auto.getPrijs());
			System.out.println(inspecteur.belastingheffen(auto, auto.omzet));

			break;
		case 2:
			System.out.println("Spookhuis draait");
			spookhuis.verkoopkaarten ++;
			Omzet spookhuis_omzet = (int k, double p)-> {k = spookhuis.verkoopkaarten;
			p = spookhuis.getPrijs();
			return k*p;		
			};
			spookhuis.omzet = spookhuis_omzet.omzetBerekening(spookhuis.verkoopkaarten, spookhuis.getPrijs());
			break;
		case 3:
			try{
				if(spin.OpstellingsKeuring()) {
					System.out.println("Spin draait niet");
					throw new Exception("Maintenance required");
				}
				else {
					System.out.println("Spin draait\n"
							+"no maintenance required");
					spin.verkoopkaarten ++;
					Omzet spin_omzet = (int k, double p)-> {k = spin.verkoopkaarten;
					p = spin.getPrijs();
					return k*p;		
					};
					spin.omzet=spin_omzet.omzetBerekening(spin.verkoopkaarten, spin.getPrijs());
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			break;
		case 4:
			System.out.println("Spiegelpaleis draait");
			spiegelpaleis.verkoopkaarten ++;
			Omzet spiegelpaleis_omzet = (int k, double p)-> {k = spiegelpaleis.verkoopkaarten;
			p = spiegelpaleis.getPrijs();
			return k*p;		
			};
			spiegelpaleis.omzet=spiegelpaleis_omzet.omzetBerekening(spiegelpaleis.verkoopkaarten, spiegelpaleis.getPrijs());
			break;
		case 5:
			try {
				if(hawaii.OpstellingsKeuring()) {
					System.out.println("Hawaii draait niet");
					throw new Exception("Maintenance required");
				}
				else {
					System.out.println("Hawaii draait\n"
							+ "no maintenance required");
					hawaii.verkoopkaarten ++;
					Omzet hawaii_omzet = (int k, double p)-> {k = hawaii.verkoopkaarten;
					p = hawaii.getPrijs();
					return k*p;		
					};
					hawaii.omzet=hawaii_omzet.omzetBerekening(hawaii.verkoopkaarten, hawaii.getPrijs());
					break;
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			break;
		case 6:
			System.out.println("Ladderklimmen draait");
			ladderklimmen.verkoopkaarten ++;
			Omzet ladderklimmen_omzet = (int k, double p)-> {k = ladderklimmen.verkoopkaarten;
			p = ladderklimmen.getPrijs();
			return k*p;		
			};
			ladderklimmen.omzet=ladderklimmen_omzet.omzetBerekening(ladderklimmen.verkoopkaarten, ladderklimmen.getPrijs());
			System.out.println(inspecteur.belastingheffen(ladderklimmen, ladderklimmen.omzet));
			break;
		case 7:
			System.out.println("Einde kermis. Op naar de kassa");
			
			do{
				kassa.setVerkoopkaarten(auto.verkoopkaarten, spin.verkoopkaarten, spookhuis.verkoopkaarten, ladderklimmen.verkoopkaarten, hawaii.verkoopkaarten, spiegelpaleis.verkoopkaarten);
				System.out.println("Wil je de dagopbrengts zien van de kermis, kies 'o'\n"
						+ "Wil je het aantal verkochte kaarten zien op de kermis, kies 'k'");
				char karakter = sc.next().charAt(0);
				if(karakter == 'k') {
					System.out.println(kassa.getVerkoopkaarten());
					break;
					}
					else if (karakter == 'o') {
					kassa.setOmzet(auto.omzet, spin.omzet, spookhuis.omzet, ladderklimmen.omzet, hawaii.omzet, spiegelpaleis.omzet);
					System.out.println(kassa.getOmzet());
					System.out.println(inspecteur.belastingheffen(ladderklimmen, ladderklimmen.omzet));
					break;
					}
				else 
					doorgaan = !true;
			}while (doorgaan);
			
			doorgaan = !true;
			break;
			default:
				try{
					if(getal >7)
						throw new IllegalArgumentException("Kies getal 1 tot en met 7");
				}
				catch (RuntimeException e) {
				System.out.println(e);
		}
		}
		}
	}
		
	}






