package modele;

public class VehiculeUtilitaire extends Vehicule {

	public VehiculeUtilitaire(String matricule, String marque, String modele, int annee, int kilometrage, int nbrPlaces,
			double prixJournalier) {
		super(matricule, marque, modele, annee, kilometrage, nbrPlaces, prixJournalier);
		typeVehicule = TypeVehicule.UTILITAIRE;
		
	}
}
