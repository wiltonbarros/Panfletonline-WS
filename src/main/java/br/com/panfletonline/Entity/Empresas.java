package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresas {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_empresa", updatable = false, unique = true, nullable = false)
	private int cod_empresa;
	private String raz_social;
	private String nom_fantasia;
	private int cod_cidade;	
	private String telefone;
	private String seg, ter, qua, qui, sex, sab, dom;
	private String endereco;
	private String bairro;
	private String cep, lat, lng;
	private String img1, img2, img3;
	private String logo;
	private String site;
	
		
	public String getRaz_social() {
		return raz_social;
	}
	public void setRaz_social(String raz_social) {
		this.raz_social = raz_social;
	}
	public String getNom_fantasia() {
		return nom_fantasia;
	}
	public void setNom_fantasia(String nom_fantasia) {
		this.nom_fantasia = nom_fantasia;
	}
	public int getCod_cidade() {
		return cod_cidade;
	}
	public void setCod_cidade(int cod_cidade) {
		this.cod_cidade = cod_cidade;
	}
	public int getCod_empresa() {
		return cod_empresa;
	}
	public void setCod_empresa(int cod_empresa) {
		this.cod_empresa = cod_empresa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSeg() {
		return seg;
	}
	public void setSeg(String seg) {
		this.seg = seg;
	}
	public String getTer() {
		return ter;
	}
	public void setTer(String ter) {
		this.ter = ter;
	}
	public String getQua() {
		return qua;
	}
	public void setQua(String qua) {
		this.qua = qua;
	}
	public String getQui() {
		return qui;
	}
	public void setQui(String qui) {
		this.qui = qui;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSab() {
		return sab;
	}
	public void setSab(String sab) {
		this.sab = sab;
	}
	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}

}
