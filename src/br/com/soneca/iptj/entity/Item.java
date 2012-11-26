package br.com.soneca.iptj.entity;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="item")
public class Item {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="titulo", length=255)
	private String titulo;
	
	@Column(name="descricao",length=255)
	private String descricao;	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	@OneToMany
	@JoinColumn(table="item_tipo", name="item_tipo", nullable=false, referencedColumnName="id")
	private ItemTipo itemTipo;
	
	@ManyToMany(mappedBy="items", fetch=FetchType.LAZY)
	private Set<Loja> lojas;
	
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	@PrePersist
	public void beforeCreate(){
		data = GregorianCalendar.getInstance().getTime();
	}
	@PreUpdate
	public void beforeSave(){
		data = GregorianCalendar.getInstance().getTime();
	}



	public ItemTipo getItemTipo() {
		return itemTipo;
	}



	public void setItemTipo(ItemTipo itemTipo) {
		this.itemTipo = itemTipo;
	}

	public Set<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(Set<Loja> lojas) {
		this.lojas = lojas;
	}
	
}
