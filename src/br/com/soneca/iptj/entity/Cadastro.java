package br.com.soneca.iptj.entity;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author soneca
 *
 */
@Entity
@Table(name="cadastro")
public class Cadastro {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome", length=255)
	private String nome;
	
	@Column(name="endereco", length=255)
	private String endereco;
	
	@Column(name="cep", length=10)
	private Integer cep;
	
	@Column(name="email", length=255)
	private String email;
	
	@Column(name="senha", length=255)
	private String senha;
	
	@Column(name="facebook", length=255)
	private String facebook;
	
	@Column(name="twitter" , length=255)
	private String twitter;
	
	@Column(name="dtcadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;
	
	@Column(name="dtultimoacesso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtUltimoAcesso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Date getDtUltimoAcesso() {
		return dtUltimoAcesso;
	}

	public void setDtUltimoAcesso(Date dtUltimoAcesso) {
		this.dtUltimoAcesso = dtUltimoAcesso;
	}
	
	@PrePersist
	public void beforeCreate(){
		dtCadastro = GregorianCalendar.getInstance().getTime();
		dtUltimoAcesso = GregorianCalendar.getInstance().getTime();
	}
	
	@PreUpdate
	public void beforeSave(){
		dtUltimoAcesso = GregorianCalendar.getInstance().getTime();
	}
	
	@Override
	public String toString(){
		Gson gSon = new GsonBuilder().setDateFormat("dd/MM/yyyy-HH:mm:ss").create();
		return gSon.toJson(this);
	}
}
