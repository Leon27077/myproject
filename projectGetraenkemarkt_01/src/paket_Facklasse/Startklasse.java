package paket_Facklasse;

public class Startklasse {

	public static void main(String[] args) {
		//Objekt deklarieren und initialisieren
		
		Getraenk getraenk1 = new Getraenk();
		getraenk1.setName("Cola");
		getraenk1.setPreis(1.20);
		getraenk1.setBestand(100);
		getraenk1.setMindestbestand(50);
		getraenk1.setHoechstbestand(300);
		
		Getraenk getraenk2 = new Getraenk("Fanta", 1.20, 55, 20, 100);
		
		
		
		//Ausgabe aus der Konsole
		
		System.out.println("Getraenk1");
		System.out.println("---------------------");
		System.out.println("Name: " + getraenk1.getName());
		System.out.println("Preis: " + getraenk1.getPreis());
		System.out.println("Bestand: "+ getraenk1.getBestand());
		System.out.println("Mindestbestand: " + getraenk1.getMindestbestand());
		System.out.println("Hoechstbestand: " + getraenk1.getHoechstbestand());
		System.out.println();
		
		System.out.println(getraenk2.drucken());
		
		
		

	}

}
