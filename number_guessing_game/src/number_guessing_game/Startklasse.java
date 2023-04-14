package number_guessing_game;

public class Startklasse {

	public static void main(String[] args) {
		
		Ratespiel ratespiel = new Ratespiel(100); 																							//Objekt der Klasse Ratespiel
		
		
		System.out.println("Es wurde soeben eine Zufallszahl zwischen 0 und "+ ratespiel.getUpper_bound() + " generiert.");
		System.out.println("Deine Aufgabe ist es zu erraten, welche Zahl es ist.");
		System.out.println("");

		ratespiel.Start();
		
		System.out.println("");
		System.out.println("Du hast " + ratespiel.getCount() + " Versuche benötigt, um die korrekte Zahl zu erraten");
	}

}
