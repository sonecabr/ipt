package br.com.soneca.iptj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.soneca.iptj.dao.CadastroDao;
import br.com.soneca.iptj.dao.Dao;
import br.com.soneca.iptj.entity.Cadastro;
import br.com.soneca.iptj.exception.IptBusinessException;
import br.com.soneca.iptj.exception.IptDaoException;


@Service
public class CadastroService {
	
	@Autowired
	private Dao cadastroDao;
	
	public Cadastro save(Cadastro cadastro) throws IptBusinessException {
		try{
			return (Cadastro) cadastroDao.save(cadastro);
		} catch (IptDaoException e) {
			throw new IptBusinessException(e);			
		}
		
	}
	

}
