/**
 * 
 */
package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import metier.Compte;


/**
 * @author IN-LL-035
 *
 */
public class CompteService implements IDao<Compte>{
	
	Map<Integer,Compte> map=new HashMap<Integer,Compte>() ;
	

	
	public CompteService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean create(Compte o) {
		// TODO Auto-generated method stub
		map.put(o.getId(), o);
		
		return true;
	}
	@Override
	public boolean delete(Compte o) {
		// TODO Auto-generated method stub
		map.remove(o.getId(), o);
		return true;
	}
	@Override
	public boolean update(Compte o) {
		// TODO Auto-generated method stub
		map.replace(o.getId(), o);
		return true;
	}
	@Override
	public Compte findById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}
	@Override
	public Collection<Compte> findAll() {
		// TODO Auto-generated method stub
		return map.values();
	
	}

}
