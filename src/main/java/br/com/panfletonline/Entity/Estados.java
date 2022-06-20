package br.com.panfletonline.Entity;

import javax.persistence.Entity;

@Entity
public class Estados {

	private String uf;
	private String desc;
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
		
}
