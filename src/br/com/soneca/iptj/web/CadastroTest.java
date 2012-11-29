package br.com.soneca.iptj.web;

import java.util.Calendar;

import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.soneca.iptj.entity.Cadastro;
import br.com.soneca.iptj.exception.IptBusinessException;
import br.com.soneca.iptj.service.CadastroService;

@Controller
public class CadastroTest {
	
	@PersistenceContext
	private CadastroService cadastroService;
	
	@RequestMapping("/test/save")
	public @ResponseBody String save(HttpServletRequest request, HttpServletResponse response){
		Cadastro cadastro = new Cadastro();
		cadastro.setCep(04321120);
		cadastro.setDtCadastro(Calendar.getInstance().getTime());
		cadastro.setDtUltimoAcesso(Calendar.getInstance().getTime());
		cadastro.setEmail("devel.andrerocha@gmail.com");
		cadastro.setEndereco("Rua das perobas, 435 ap.56-b");
		cadastro.setFacebook("sobecabr");
		cadastro.setNome("Andre Rocha");
		cadastro.setSenha("test");
		cadastro.setTwitter("sonecabr");
		
		try {
			Cadastro cadastro2 = cadastroService.save(cadastro);
			return cadastro2.toString();
		} catch (IptBusinessException e) {			
			e.printStackTrace();
		}
		
		return "erro";
		
	}

}
