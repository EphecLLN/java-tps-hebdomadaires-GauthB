/**
 * 
 */
package tp3;

/**
 * @author gauthierbohyn
 *
 */
public class ExerciceTDD {
	/**
	 * Cette méthode verifie si l'argument est pair
	 * @param n est un nombre
	 * @return vrai si le nombre est pair et faux si le nombre est impair
	 */
	public static boolean estPair(int n) {
		return(n%2 ==0);//Modulo 2 (si egale à 0 est ok)
	}
	
	/**
	 * Calcule le périmètre d'un carré
	 * @param n la longueur d'un coté du carré
	 * @return le périmètre du carré (de meme unité de longueur de n)
	 */
	public static double perimCarre(double n) {
		return (n*4);
	}
	
	/**
	 * Cette méthode vérifie la présence d'un caractère dans une chaine de caractères
	 * @param j le caractère à retrouver
	 * @param s la chaine de caractères dans laquelle on recherche le caractère
	 * @return vrai si le caractère appartient à la chaine de caractère, faux sinon
	 */
	public static boolean contientCar(char j, String s) {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==j) return true;
		}
		return false;
	}
	
	public  static void  main(String [] args) {
		System.out.print(estPair(2)+"\n");
		System.out.println(perimCarre(2));
		System.out.println(contientCar("g", "std"));
		
	}
	
	
}
