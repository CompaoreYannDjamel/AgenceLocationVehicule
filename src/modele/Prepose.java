package modele;

public class Prepose {

	/* Définition des attributs */
	private int empId;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String username;
	private String motPasse;
	
	private boolean connecte;
	private static int ids = 0;
	
	private AgenceModele modele;

    /* Constructeurs */
    
	public Prepose(String nom, String prenom, String adresse, String telephone, String username,
			String motPasse, AgenceModele modele) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.username = username;
		this.motPasse = motPasse;
		this.empId = ++ids;
		this.modele = modele;
	}
	
	public Prepose(int empId, String nom, String prenom, String adresse, String telephone, String username,
			String motPasse, AgenceModele modele) {
		this(nom, prenom, adresse, telephone, username, motPasse, modele);
		this.empId = empId;	
	}
    
    /* getters et setters */

	public static int getIds() {
		return ids;
	}

	public static void setIds(int ids) {
		Prepose.ids = ids;
	}

	public int getId() {
		return empId;
	}
	
	public void setId(int clientId) {
		this.empId = clientId;
	}

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public boolean estConnecte() {
		return connecte;
	}
	
	public boolean seConnecter(String username, String pass) {
		if (this.username.equals(username) && this.motPasse.equals(pass)) {
			this.connecte = true;
		}
		return this.connecte;
	}
	
	public void seDeconnecter() {
		this.connecte = false;
	}
	
	public void bloque(Client client) {
		modele.bloquerClient(client);
	}
	
	public void activerClient(Client client) {
		modele.activerClient(client);
	}
	
	/* implémentation des méthodes */
	@Override
	public String toString() {
		return empId+", "+nom+", "+prenom+", "+adresse+", "+telephone
				+", "+username+", "+motPasse;
	}
        

}