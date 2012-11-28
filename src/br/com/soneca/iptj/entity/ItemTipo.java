package br.com.soneca.iptj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Entity
public class ItemTipo implements br.com.soneca.iptj.entity.Entity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="descricao", length=255)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString(){
		Gson gSon = new GsonBuilder().setDateFormat("dd/MM/yyyy-HH:mm:ss").create();
		return gSon.toJson(this);
	}
	
}
