/**
 * 
 */
package metier;

/**
 * @author IN-LL-035
 *
 */
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	public CompteCourant(int id, int numCompte, double decouvertMax, double debitMax) {
		super(id, numCompte, decouvertMax, debitMax); 
		
	}
	
		// Fonction v�rification d�couvert
		public double montantDecouvert() {
			if (solde<0) {
				return -solde;
			}
			else
			{
				return 0;
			}
		}
	}

