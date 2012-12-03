package br.com.soneca.iptj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Entity
@Table(name="avaliacao_usuario")
public class AvaliacaoUsuario implements br.com.soneca.iptj.entity.Entity {

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne	
	private Cadastro cadastro;
	
	@ManyToOne	
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
