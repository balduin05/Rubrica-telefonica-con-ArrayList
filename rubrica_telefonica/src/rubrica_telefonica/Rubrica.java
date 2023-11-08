package rubrica_telefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica {

	// DICHIARAZIONE ARRAYLIST

	ArrayList<Contatti> aL = new ArrayList<>();


	// INSERIMENTO:


	public void inserimento() {

		Contatti c = new Contatti();

		boolean presente = false;


		System.out.println();
		System.out.println("Inserire contatto " + (aL.size() + 1) + ": ");
		System.out.println();
		c.inserimento();


		// CONTROLLO SE IL CONTATTO E' GIA' NELLA RUBRICA:

		for(Contatti contatti : aL) {
			if(contatti.getCognome().equalsIgnoreCase(c.getCognome()) && contatti.getNome().equalsIgnoreCase(c.getNome()) && contatti.getTelefono().equalsIgnoreCase(c.getTelefono())) {
				presente = true;

				System.out.println("Errore: il contatto è già esistente!");

			}
		}

		if(!presente) {
			aL.add(c);

		}

	}


	// VISUALIZZA:

	public void visualizza() {
		if(aL.size() > 0) {
			for(Contatti c : aL) {
				c.visualizza();

			}
		}else {
			System.out.println("Errore: il programma è vuoto");

		}
	}


	// RICERCA NUMERO:

	public void ricerca_numero(String cognome, String nome) {

		boolean trovato = false;

		if(aL.size() > 0) {
			for(Contatti c : aL) {
				if(c.getCognome().equalsIgnoreCase(cognome) && c.getNome().equalsIgnoreCase(nome)) {
					trovato = true;

					System.out.println("Numero di telefono: " + c.getTelefono());

				}
			}

			if(!trovato) {
				System.out.println("Errore: non è presente nessun contatto con quei dati!");

			}

		}else {
			System.out.println("Errore: il programma è vuoto!");

		}

	}


	// AGGIORNA NUMERO:

	public void aggiorna_numero() {

		Scanner keyboard = new Scanner(System.in);

		String cognome;
		String nome;
		String nuovo_numero;
		boolean trovato = false;

		System.out.println();

		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();

		}while(cognome.length() <= 0);

		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();

		}while(nome.length() <= 0);

		if(aL.size() > 0) {
			for(Contatti c : aL) {
				if(c.getCognome().equalsIgnoreCase(cognome) && c.getNome().equalsIgnoreCase(nome)) {
					trovato = true;
					
					do {
						System.out.print("Nuovo numero: ");
						nuovo_numero = keyboard.nextLine();

					}while(nuovo_numero.length() <= 0);

					c.setTelefono(nuovo_numero);

				}
			}

			if(!trovato) {
				System.out.println("Errore: non è presente nessun contatto con quei dati!");

			}

		}else {
			System.out.println("Errore: il programma è vuoto!");

		}
	}


	// ELIMINAZIONE CONTATTO:

	public void elimina_contatto() {

		Scanner keyboard = new Scanner(System.in);


		String cognome;
		String nome;
		boolean trovato = false;

		System.out.println();

		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();

		}while(cognome.length() <= 0);

		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();

		}while(nome.length() <= 0);

		if(aL.size() > 0) {
			int i = 0;
			for(Contatti c : aL) {
				if(c.getCognome().equalsIgnoreCase(cognome) && c.getNome().equalsIgnoreCase(nome)) {
					trovato = true;
					
				}else {
					i ++;  // N.B => Ho bisgono di un contatore che aumenti di uno finchè la condizione risulta vera!
					
				}
			}
			
			if(trovato) {
				aL.remove(i);
				
			}else {
				System.out.println("Errore: non è presente nessun contatto con quei dati!");
				
			}
			
		}else {
			System.out.println("Errore: il programma è vuoto!");
			
		}

	}

}
