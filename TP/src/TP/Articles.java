package TP;
import java.util.Scanner;
public class Articles {

	public Articles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier= new Scanner(System.in);
		
		
		
		String nomUtilisateur="";
		//PREMIER MENU 
		System.out.println("******************************************");
		System.out.println();
		System.out.println("* Bienvenue dans le jeu :");
		System.out.println();
		
		//VALIDER TANT QU'ON A PAS UN NOM VALIDE 
		while(nomUtilisateur==null || nomUtilisateur.equals("") || nomUtilisateur.equals(" ")) {
			System.out.println("* Entrez votre nom :");
			nomUtilisateur= clavier.nextLine();
		}
		
		System.out.println("*******************************************");
		
		System.out.println();
		System.out.println();
		
		
		int choixUtilisateur=0;
		//DEUXIEME MENU
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("* Liste des produits :");	
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.println();
		System.out.println("1- Tasse de café : moins de $10");
		System.out.println();
		System.out.println("2- Chandail personnalisé : entre $10 et $15");
		System.out.println();
		System.out.println("3- Casquette : entre : $20 et $30");
		System.out.println();
		System.out.println("4- Bougie personnalisée : $30 et $40");
		System.out.println();
		System.out.println("5- Jeu de Risk : entre $50 et $100");
		System.out.println();
		System.out.println("*******************************************");
		System.out.println();

		//VALIDER SI LE NOMBRE EST ENTRE 1 ET 5 
		while(choixUtilisateur<1||choixUtilisateur>5) {
			System.out.println("Entrez numéro de produit (Faites votre choix entre 1 et 5) :");
			choixUtilisateur=clavier.nextInt();
		}
	
		
		
		
		
		
		
		
		
		

	}

}
