package TP;

import java.util.Scanner;

public class Articles {

	public static final String OPTION1 = "Tasse de café";
	public static final String OPTION2 = "Chandail personnalisé";
	public static final String OPTION3 = "Casquette";
	public static final String OPTION4 = "Bougie personnalisée";
	public static final String OPTION5 = "Jeu de Risk";
	public static final int NBRFINALESSAIE=5;
	public static final int GAINPARPARTIE=100;

	public Articles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int gainTotal=0;
		Scanner clavier= new Scanner(System.in);
		String status="";

		String nomUtilisateur="";
		//PREMIER MENU 
		System.out.println("******************************************");
		System.out.println(OPTION1);
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

		//TANT QUE LE JOUEUR VEUT JOUER
		while(status!="N"||status!="n"){

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

			int prixMin=1;
			int prixMax=0;
			int prixEstimationUtilisateur=0;
			switch (choixUtilisateur) {
			case 1:
				prixMax=10;
				System.out.println("Bonjour « "+nomUtilisateur+" », vous avez choisi le produit « "+OPTION1+" »,");
				System.out.println("Son prix est entre "+prixMin+" et "+prixMax+"$");
				break;
			case 2:
				prixMin=10;
				prixMax=15;
				System.out.println("Bonjour « "+nomUtilisateur+" », vous avez choisi le produit « "+OPTION2+" »,");
				System.out.println("Son prix est entre "+prixMin+" et "+prixMax+"$");
				break;
			case 3:
				prixMin=20;
				prixMax=30;
				System.out.println("Bonjour « "+nomUtilisateur+" », vous avez choisi le produit « "+OPTION3+" »,");
				System.out.println("Son prix est entre "+prixMin+" et "+prixMax+"$");
				break;
			case 4:
				prixMin=30;
				prixMax=40;
				System.out.println("Bonjour « "+nomUtilisateur+" », vous avez choisi le produit « "+OPTION4+" »,");
				System.out.println("Son prix est entre "+prixMin+" et "+prixMax+"$");
				break;
			case 5:
				prixMin=50;
				prixMax=100;
				System.out.println("Bonjour « "+nomUtilisateur+" », vous avez choisi le produit « "+OPTION5+" »,");
				System.out.println("Son prix est entre "+prixMin+" et "+prixMax+"$");
				break;
			default:
				System.out.println("");
			}

			int prixAleatoire=(int) Math.round(Math.random()* (prixMax - prixMin) + prixMin);// NUMERO ENTRE MIN ET MAX INCLUSIVEMENT

			System.out.println(prixAleatoire);
			int nbrEssay=0;

			while(prixEstimationUtilisateur!=prixAleatoire&&nbrEssay<NBRFINALESSAIE) {
				System.out.println("Entrez votre prix :");
				prixEstimationUtilisateur=clavier.nextInt();
				nbrEssay++;
				if(prixEstimationUtilisateur>prixAleatoire) {
					nbrEssay++;
					System.out.println("Moins");
					prixEstimationUtilisateur=clavier.nextInt();
				}
				if(prixEstimationUtilisateur<prixAleatoire) {
					nbrEssay++;
					System.out.println("Plus");
					prixEstimationUtilisateur=clavier.nextInt();
				}
			}	


			if(nbrEssay>=NBRFINALESSAIE) {
				System.out.println("VOUS AVEZ DÉPASSÉ LE NOMBRE TOTAL DE TENTATIVE!");
				status="N";
			}
			else {
				gainTotal+=100;
				System.out.println("Bravo, « "+nomUtilisateur+" », vous avez gagné "+GAINPARPARTIE+"$ au bout de "+nbrEssay+" essais.");
				System.out.println();		
			}
			System.out.println("Voulez-vous continuer ? (n)on ou (N)on pour quitter :");
			String statusJeuCourant=clavier.nextLine();
			System.out.println();
			
		}




	}

}


/*if(statusJeuCourant.equals("n")||statusJeuCourant.equals("N")) {
				if(gainTotal==GAINPARPARTIE) {
					System.out.println("« Très bien, à votre place, j’aurais continué » Gain total=+"+gainTotal+"$");
					System.out.println("Au revoir "+nomUtilisateur);
				}
				if(gainTotal>GAINPARPARTIE) {
					System.out.println("« Bravo champion » Gain total=+"+gainTotal+"$\"");
					System.out.println("Au revoir "+nomUtilisateur);
				}
				if(gainTotal==0) {
					System.out.println("« Dommage, une autre fois »");
					System.out.println("Au revoir "+nomUtilisateur);
				}
			}
 * */
