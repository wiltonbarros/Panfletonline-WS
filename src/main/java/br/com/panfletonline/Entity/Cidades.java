package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidades {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_cidade", updatable = false, unique = true, nullable = false)
	private int cod_cidade;
	private String desc_cidade;
	private String uf_cidade;
	
	
	public int getCod_cidade() {
		return cod_cidade;
	}
	public void setCod_cidade(int cod_cidade) {
		this.cod_cidade = cod_cidade;
	}
	public String getDesc_cidade() {
		return desc_cidade;
	}
	public void setDesc_cidade(String desc_cidade) {
		this.desc_cidade = desc_cidade;
	}
	public String getUf_cidade() {
		return uf_cidade;
	}
	public void setUf_cidade(String uf_cidade) {
		this.uf_cidade = uf_cidade;
	}
	
}
