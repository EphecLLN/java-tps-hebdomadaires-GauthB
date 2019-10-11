/**
 * 
 */
package tp3;

/**
 * @author gauthierbohyn
 *
 */
public class ExerciceTDD {
	double valeurCourante;
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}
	
	/**
	 * Elève la valeur courante au carré
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}
	
	
}
