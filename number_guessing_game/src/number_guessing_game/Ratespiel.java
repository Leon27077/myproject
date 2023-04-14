package number_guessing_game;

import java.util.Random;

import java.util.Scanner;

public class Ratespiel {

	//Attribute
	public int upper_bound;
	Random random = new Random(); //random ist ein Attribut vom "Typ" Random
	public int secret_number;
	public int guess;
	public int count = 1;
	Scanner read = new Scanner(System.in);
	
	//Konstruktor
	public Ratespiel(int pUpper_bound) {
		upper_bound = pUpper_bound;
		secret_number = random.nextInt(upper_bound); //method from class library java.util.Random; Reads an integer value from the user
	
	}
	
	public int getUpper_bound() {
		return upper_bound;
	}
	
	public int getCount() {
		return count;
	}
	
	
	public void Start() {
		while (guess != secret_number) {
			guess = read.nextInt(); //Konsoleneingabe als int in guess speichern
			if (guess == secret_number) {
				System.out.println("");
				System.out.println("Die gesuchte Zahl wurde erraten!");
			}
			else if (guess < secret_number) {
				System.out.println("Die gesuchte Zahl ist größer als deine geratene Zahl!");
				count++;
			}
			else {
				System.out.println("Die gesuchte Zahl ist kleiner als die geratene Zahl!");
				count++;
					}	
				}	
			}
		}



//Ermöglicht die Konsoleneingabe und liest die Eingabe als integer (Zeile 35)

