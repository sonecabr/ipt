package br.com.soneca.iptj.dao;

import java.util.Collection;

import br.com.soneca.iptj.entity.Entity;
import br.com.soneca.iptj.exception.IptDaoException;

public interface Dao {
	
	
	Entity save(Entity objectToSave) throws IptDaoException;
	
	void remove(Entity objectToRemove) throws IptDaoException;
	
	void remove(Collection<Entity> collectionToRemove) throws IptDaoException;
	
	
	

}
