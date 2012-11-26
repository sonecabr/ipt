package br.com.soneca.iptj.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="loja")
public class Loja {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="titulo", length=255)
	private String titulo;
	
	@Column(name="descricao", length=255)
	private String descricao;
	
	@Column(name="tipo_loja", length=1)
	@Enumerated(EnumType.STRING)
	private TipoLoja tipoLoja;
	
	@Column(name="endereco", length=255)
	private String endereco;
	
	@Column(name="site", length=255)
	private String site;
	
	@Column(name="cep", length=10)
	private Integer cep;

	@ManyToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="item_loja", joinColumns = {@JoinColumn(name="loja_id"), @JoinColumn(name="item_id")})
	private Set<Item> items;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoLoja getTipoLoja() {
		return tipoLoja;
	}

	public void setTipoLoja(TipoLoja tipoLoja) {
		this.tipoLoja = tipoLoja;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
