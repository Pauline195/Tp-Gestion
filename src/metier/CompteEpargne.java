/**
 * 
 */
package metier;

/**
 * @author IN-LL-035
 *
 */
public class CompteEpargne extends Compte {

	double tauxInteret;
	double soldeEpargne;
	
	
	public CompteEpargne(int id, int numCompte, double decouvertMax, double debitMax) {
		super(id, numCompte, decouvertMax, debitMax);
	}
	
	
	public void main(String[] args) {
		
		if (soldeEpargne>=0) {
			double nouveauSolde=soldeEpargne+tauxInteret*soldeEpargne;
		}
		else
		{
			double nouveauSolde=soldeEpargne;
		}
			
			
			
			
			
		}
		
	}
	

