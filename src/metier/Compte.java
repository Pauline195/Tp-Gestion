/**
 * 
 */
package metier;

import java.time.LocalDate;

/**
 * @author IN-LL-035
 *
 */
public class Compte {

	// Attributs compte bancaire
	
	public int id;
	public int numCompte;
	public int code;
	public double solde;
	public int decouvert;
	public LocalDate dateDeCreation;
	public double decouvertMax;
	public double debitMax;
	public double debitAutorise;
	public double retraitSolde;
	
	
	
	public Compte(int id, int numCompte, double decouvertMax, double debitMax) {
		super();
		this.id = id;	// Constructeur création compte bancaire
		this.numCompte = numCompte;
		this.decouvertMax = decouvertMax;	// Constructeur affectation découvert
		this.debitMax = debitMax;	// Constructeur affectation débit max
	}
	
	

	
	// Fonction ajouter de l'argent au compte
	public void ajoutArgent (double montant)
	{
		solde = montant + solde;
	}
	
	// Fonction retirer de l'argent au compte
	public void retraitArgent (double montant) {
		retraitSolde = solde - montant;
		if (montant <= debitMax && retraitSolde <= decouvertMax && montant >0)
		{
			solde = retraitSolde;
			System.out.println("Voici votre argent, votre solde restant est" + solde);
		}
		else
		{
			System.out.println("Retrait impossible");
		}
	}


	// Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumCompte() {
		return numCompte;
	}


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public int getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}


	public LocalDate getDateDeCreation() {
		return dateDeCreation;
	}


	public void setDateDeCreation(LocalDate dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}


	public double getDecouvertMax() {
		return decouvertMax;
	}


	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}


	public double getDebitMax() {
		return debitMax;
	}


	public void setDebitMax(double debitMax) {
		this.debitMax = debitMax;
	}


	public double getDebitAutorise() {
		return debitAutorise;
	}


	public void setDebitAutorise(double debitAutorise) {
		this.debitAutorise = debitAutorise;
	}


	public double getRetraitSolde() {
		return retraitSolde;
	}


	public void setRetraitSolde(double retraitSolde) {
		this.retraitSolde = retraitSolde;
	}

	

}
