package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promocao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo", updatable = false, unique = true, nullable = false)
	private int codigo;
	private int cod_emp;
	private String dat_ini;
	private String dat_fim;
	private String dat_incl;
	private String descricao;
	private String imagem;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCod_emp() {
		return cod_emp;
	}
	public void setCod_emp(int cod_emp) {
		this.cod_emp = cod_emp;
	}
	public String getDat_ini() {
		return dat_ini;
	}
	public void setDat_ini(String dat_ini) {
		this.dat_ini = dat_ini;
	}
	public String getDat_fim() {
		return dat_fim;
	}
	public void setDat_fim(String dat_fim) {
		this.dat_fim = dat_fim;
	}
	public String getDat_incl() {
		return dat_incl;
	}
	public void setDat_incl(String dat_incl) {
		this.dat_incl = dat_incl;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}
