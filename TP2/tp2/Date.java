/**
 * 
 */
package tp2;

/**
 * Cette classe modélise une date de manière simplifiée.
 * @author GauthB
 *
 */

public class Date {
	
	//variables d'instance
	private int jour;
	private int mois;
	private int annee;
	
	/**
	 * Constructeur de la classe Date
	 * @param jour
	 * @param mois
	 * @param annee
	 */
	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	//Getters et setters 
	
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		if(jour > 0 && jour < 32) {
		this.jour = jour;
		}
	}



	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		if(mois > 0 && mois < 13) {
		this.mois = mois;
		}
	}

	
	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		if(annee > 1900) {
		this.annee = annee;
		}
	}

	/*
	 * Renvoie l'objet Date en string
	 */
	public String toString() {
		return "La date est : " + jour + "/" + mois + "/" + annee; 
	}

	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date(5,01,2000);
		System.out.println(d); 

	}
}
