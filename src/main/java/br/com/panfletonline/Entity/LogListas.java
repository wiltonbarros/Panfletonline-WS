package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogListas {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, unique = true, nullable = false)
	private int id;
	private int cod_produto;
	private int cod_cidade;
	private String dat_ini;
	private String dat_fim;
	private String dat_incl;
	private int cod_empresa;
	private double val_normal;
	private double val_reduz;
	private String usuario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public int getCod_cidade() {
		return cod_cidade;
	}
	public void setCod_cidade(int cod_cidade) {
		this.cod_cidade = cod_cidade;
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
	public int getCod_empresa() {
		return cod_empresa;
	}
	public void setCod_empresa(int cod_empresa) {
		this.cod_empresa = cod_empresa;
	}
	public double getVal_normal() {
		return val_normal;
	}
	public void setVal_normal(double val_normal) {
		this.val_normal = val_normal;
	}
	public double getVal_reduz() {
		return val_reduz;
	}
	public void setVal_reduz(double val_reduz) {
		this.val_reduz = val_reduz;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
