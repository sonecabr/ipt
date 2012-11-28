package br.com.soneca.iptj.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.soneca.iptj.entity.Entity;
import br.com.soneca.iptj.exception.IptDaoException;


@Repository
@Transactional(readOnly = true)
public class CadastroDao implements Dao{

	@Override
	@Transactional(readOnly = false, propagation = Propagation.SUPPORTS)
	public Entity save(Entity objectToSave) throws IptDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.SUPPORTS)
	public void remove(Entity objectToRemove) throws IptDaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.SUPPORTS)
	public void remove(Collection<Entity> collectionToRemove)
			throws IptDaoException {
		// TODO Auto-generated method stub
		
	}
	
	

}
