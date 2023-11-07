package rubrica_telefonica;

import java.util.Scanner;

public class Contatti {

	// ATTRIBUTI

	private String cognome;
	private String nome;
	private String telefono;


	// COSTRUTTORE DEFAULT:

	Contatti(){
		this.cognome = "";
		this.nome = "";
		this.telefono = "";
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	Contatti(String cognome, String nome, String telefono){
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		
	}
	
	
	// METODI SET & GET:
	
	// COGNOME:
	
	public void setCognome(String cognome) {
		if(cognome.length() > 0) {
			this.cognome = cognome;
			
		}else {
			this.cognome = "";
			
		}
	}
	
	public String getCognome() {
		return cognome;
		
	}
	
	
	// NOME:
	
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
			
		}else {
			this.nome = "";
			
		}
	}
	
	public String getNome() {
		return nome;
		
	}
	
	
	// TELEFONO:
	
	public void setTelefono(String telefono) {
		if(telefono.length() > 0) {
			this.telefono = telefono;
			
		}else {
			this.telefono = "";
			
		}
	}
	
	public String getTelefono() {
		return telefono;
		
	}
	
	
	// INSERIMENTO:
	
	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);
		
		String cognome;
		String nome;
		String telefono;
		
		
		// INSERIMENTO COGNOME:
		
		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();
			
		}while(cognome.length() <= 0);
		setCognome(cognome);
		
		
		// INSERIMENTO NOME:
		
		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();
			
		}while(nome.length() <= 0);
		setNome(nome);
		
		
		// INSERIMENTO TELEFONO:
		
		do {
			System.out.print("Telefono: ");
			telefono = keyboard.nextLine();
			
		}while(telefono.length() <= 0);
		setTelefono(telefono);
		
	}
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
		System.out.println("Telefono: " + telefono);
		System.out.println();
		
	}
	
}
