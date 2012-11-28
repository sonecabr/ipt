package br.com.soneca.iptj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import br.com.soneca.iptj.dao.CadastroDao;
import br.com.soneca.iptj.entity.Cadastro;
import br.com.soneca.iptj.exception.IptBusinessException;
import br.com.soneca.iptj.exception.IptDaoException;


@Component
public class CadastroService {
	
	@Autowired
	private CadastroDao cadastroDao;
	
	public Cadastro save(Cadastro cadastro) throws IptBusinessException {
		try{
			return (Cadastro) cadastroDao.save(cadastro);
		} catch (IptDaoException e) {
			throw new IptBusinessException(e);			
		}
		
	}
	

}
