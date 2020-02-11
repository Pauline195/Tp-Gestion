package dao;

import java.util.Collection;

public interface IDao<T> {
	
	// CRUD
	
	boolean create (T o); // méthode permettant d'ajouter un objet o de type T
	boolean delete (T o); // méthode permettant de supprimer un objet o de type T
	boolean update (T o); // méthode permettant de modifier un objet o de type T
	T findById (int id); // méthode permettant de renvoyer un objet dont id est passé en paramètre
	Collection<T> findAll(); // méthode permettant de renvoyer la liste des objets de type T

}
