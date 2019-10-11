package tp2;


/**
 * Classe permettant la représentation d'un étudiant
 * @author GauthB
 */

public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prenom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;
	
	/**
	 * Constructeur de la classe Etudiant
	 * @param nom
	 * @param prenom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		super();
		this.setNom(nom);
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
	}

	
	//Getters et setters
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
	}
	
	//Methode toString
	public String toString() {
		return "L'étudiant s'appelle " + prenom + " " + nom;
	}

	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	
	public static void main(String[] args) {
		Etudiant etu = new Etudiant("cotton", "victor", 201662, new Date(25,2,2000));
		System.out.println(etu);
		/*
		etu.setNom(args[0]);
		etu.setPrenom(args[1]);
		etu.setMatricule(Integer.parseInt(args[2]));
		Date dateNaissance = new Date();
		dateNaissance.jour = Integer.parseInt(args[3]);
		dateNaissance.mois = Integer.parseInt(args[4]);
		dateNaissance.année = Integer.parseInt(args[5]);
		etu.setDateNaissance(dateNaissance);
		*/
		 
	}

}
