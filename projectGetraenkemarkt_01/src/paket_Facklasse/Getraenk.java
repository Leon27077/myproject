package paket_Facklasse;

public class Getraenk {

				//Attribute
			private String name;
			private double preis;
			private int bestand;
			private int mindestbestand;
			private int hoechstbestand;
			
			
			//Konstruktor
			public Getraenk(){};
			public Getraenk(String pName, double pPreis, int pBestand, int pMindestbestand, int pHoechstbestand) {
				name = pName;
				preis = pPreis;
				bestand = pBestand;
				mindestbestand = pMindestbestand;
				hoechstbestand = pHoechstbestand;
				
			}

			//Methoden
			
			public void setName(String pName) {
				name = pName;
			}
			public String getName() {
				return name;
			}
			public void setPreis(double pPreis) {
				preis = pPreis;
			}
			public double getPreis() {
				return preis;
			}
			public void setBestand(int pBestand) {
				bestand = pBestand;
			}
			public int getBestand() {
				return bestand;
			}
			public void setMindestbestand(int pMindestbestand) {
			 mindestbestand = pMindestbestand;
			}
			public int getMindestbestand() {
				return mindestbestand;
			}
			public void setHoechstbestand(int pHoechstbestand) {
			hoechstbestand = pHoechstbestand;
			}
			public int getHoechstbestand() {
				return hoechstbestand;
			}
			
			public String drucken() {
				String ausgabe = "Name: "+name+"\n"+
								"Preis: "+preis+"\n"+
								"Bestand: "+bestand+"\n"+
								"mindestbestand: "+mindestbestand+"\n"+
								"Hoechstbestand: "+hoechstbestand;
				
				return ausgabe;
			}




}



