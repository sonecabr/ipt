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

@Entity(name="avaliacao_loja")
public class AvaliacaoLoja implements br.com.soneca.iptj.entity.Entity{
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(referencedColumnName="id", name="loja_id", table="loja", nullable=false)
	@OneToMany
	private Loja loja;	

	@Column(name="pontos", nullable=false)
	private Integer pontos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
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
