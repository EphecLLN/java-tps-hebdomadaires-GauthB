/**
 * 
 */
package TP6;

/**
 * @author gauthierbohyn
 *
 */
public class Personne {

	
	protected String nom;
	protected String prenom;
	protected int numRegistreNationnal;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the numRegistreNationnal
	 */
	public int getNumRegistreNationnal() {
		return numRegistreNationnal;
	}
	/**
	 * @param numRegistreNationnal the numRegistreNationnal to set
	 */
	public void setNumRegistreNationnal(int numRegistreNationnal) {
		this.numRegistreNationnal = numRegistreNationnal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numRegistreNationnal=" + numRegistreNationnal + "]";
	}
	
	
}
