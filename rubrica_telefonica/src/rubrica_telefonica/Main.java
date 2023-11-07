package rubrica_telefonica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Rubrica r = new Rubrica();
		
		int scelta;
		
		do {
			System.out.println();
			System.out.println(" - MENU - ");
			System.out.println("1) Inserimento contatti");
			System.out.println("2) Visualizza contatti");
			System.out.println("3) Ricerca numero");
			System.out.println("4) Aggiorna numero");
			System.out.println("5) Elimina contatto");
			System.out.println("6) Esci dalla rubrica");
			System.out.println();
			System.out.print("Opzione scelta: ");
			scelta = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(scelta) {
			
			case 1:
				r.inserimento();
				break;
				
			case 2:
				r.visualizza();
				break;
				
			case 3:
				String cognome;
				String nome;
				
				System.out.println();
				
				do {
					System.out.print("Cognome: ");
					cognome = keyboard.nextLine();
					
				}while(cognome.length() <= 0);
				
				do {
					System.out.print("Nome: ");
					nome = keyboard.nextLine();
					
				}while(nome.length() <= 0);
				
				r.ricerca_numero(cognome, nome);
				
				break;
				
			case 4:
				r.aggiorna_numero();
				break;
				
			case 5:
				r.elimina_contatto();
				break;
				
			}
			
		}while(scelta != 6);
		
	}

}
