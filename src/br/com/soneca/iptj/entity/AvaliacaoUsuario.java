package br.com.soneca.iptj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Entity
public class AvaliacaoUsuario {

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	@JoinColumn(name="cadastro_id", table="cadastro", nullable=false, referencedColumnName="id")
	private Cadastro cadastro;
	
	@OneToMany
	@JoinColumn(name="item_id", referencedColumnName="id", table="avaliacao_item", nullable=false)
	private AvaliacaoItem avaliacaoItem;
	
	@Column(name="pontos", nullable=false)
	private Integer pontos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public AvaliacaoItem getAvaliacaoItem() {
		return avaliacaoItem;
	}

	public void setAvaliacaoItem(AvaliacaoItem avaliacaoItem) {
		this.avaliacaoItem = avaliacaoItem;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	
	@Override
	public String toString(){
		Gson gSon = new GsonBuilder().setDateFormat("dd/MM/yyyy-HH:mm:ss").create();
		return gSon.toJson(this);
	}
	
}
