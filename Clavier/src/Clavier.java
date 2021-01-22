// classe fournissant des fonctions de lecture au clavier
import java.io.*; // recuper tout �ritage de class java

// class Clavier recuper les donn�s qu'on donne apr�s Clavier
public class Clavier{
	
	//main de projet pour ex�cuter les objets
	public static void main(String[] args) {
		System.out.print( "saisissez 4 chiffre en presant entrer � la fin de chaque chiffre \n " );
		int i = 0;
		double somme = 0;
		for (i=0; i<4; i++) {
			int x = Clavier.lireInt();
			somme+= x;
		}
//        int a = Clavier.lireInt();
//        
//        System.out.print( "Entier n�: 2\n " );
//        int b = Clavier.lireInt();
//        
//        System.out.print( "Entier n�: 3\n " );
//        int c = Clavier.lireInt();
//        
//        System.out.print( "Entier n�: 4\n " );
//        int d = Clavier.lireInt();
        
//        int saisie1 = a + b + c + d;
        System.out.printf( "la resulta est :"+ somme );
	}
	
	// Lire moi cha�nes de caract�re 
	public static String lireString() {
		
		// cr�e moi une variable de type String
		String saisie = null;
		
		/* Cr�e objet de type BufferedReader et
		mettre de dans un objet de type inputStreameader (input) */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		try {
			// m�thode readLine (lire moi la lign) 
			saisie = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return saisie;
	}
	
	// Lire moi entier
	public static int lireInt() {
		
		// faire reference de la methode lireString()
		String saisie1 = lireString();
		
		// Cr�e une variable type int qui fait reference saisie1 parseInt (lire un apr�s l'autre)
		int myInt = Integer.parseInt(saisie1);
		return myInt;
	}
	
	// Lire float 
	public static float lireFloat() {
		
	// faire reference de la methode lireString()
		String saisie2 = lireString();
	// Cr�e variable de type float. parseFloat (lire un apr�s l'autre)
		float myFloat = Float.parseFloat(saisie2);
		return myFloat;
	}
	
	// Lire float 
	public static double lireDouble() {
		
	// faire reference de la methode lireString()
		String saisie3 = lireString();
	// Cr�e variable de type float. parseFloat (lire un apr�s l'autre)
		double myDouble = Double.parseDouble(saisie3);
		return myDouble;
	}

}

