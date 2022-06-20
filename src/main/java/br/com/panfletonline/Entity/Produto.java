package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo", updatable = false, unique = true, nullable = false)
	private int codigo;
	private String descricao;
	private String marca;
	private String unid_medida;
	private double quant;
	private String info_adc;
	private String imagem;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getUnid_medida() {
		return unid_medida;
	}
	public void setUnid_medida(String unid_medida) {
		this.unid_medida = unid_medida;
	}
	public double getQuant() {
		return quant;
	}
	public void setQuant(double quant) {
		this.quant = quant;
	}
	public String getInfo_adc() {
		return info_adc;
	}
	public void setInfo_adc(String info_adc) {
		this.info_adc = info_adc;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	

}
