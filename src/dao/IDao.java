package dao;

import java.util.Collection;

public interface IDao<T> {
	
	// CRUD
	
	boolean create (T o); // m�thode permettant d'ajouter un objet o de type T
	boolean delete (T o); // m�thode permettant de supprimer un objet o de type T
	boolean update (T o); // m�thode permettant de modifier un objet o de type T
	T findById (int id); // m�thode permettant de renvoyer un objet dont id est pass� en param�tre
	Collection<T> findAll(); // m�thode permettant de renvoyer la liste des objets de type T

}
