/**
 * 
 */
package web;

import java.time.LocalDate;

import dao.CompteService;
import metier.Client;
import metier.Compte;

/**
 * @author IN-LL-035
 *
 */
public class Test {

	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client1=new Client(01, "Pierre", "Jacques", 5264);
		Client client2=new Client(02, "Dupont", "Lucie", 9856);
		Client client3=new Client(03, "Moreau", "Mireille", 5264);
		Client client4=new Client(04, "Laillet", "Arthur", 5264);
		
		Compte compte1=new Compte(01, 3001, 400.00, 200.00);
		Compte compte2=new Compte(02, 3002, 00.00, 42.00);
		Compte compte3=new Compte(03, 3003, -300.00, 300.00);
		Compte compte4=new Compte(04, 3004, -250.00, 250.00);
		
CompteService cs = new CompteService();
		
		cs.create(compte1);
		cs.create(compte2);
		cs.create(compte3);
		cs.create(compte4);
		
		System.out.println(cs.findAll());
		
		
		
		

	}

}
