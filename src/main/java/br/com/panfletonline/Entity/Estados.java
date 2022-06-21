package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/
@Entity
public class Estados {

/*	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable = false, unique = true, nullable = false)
	private int id;*/
	@Id
	@Column(name="uf", updatable = false, unique = true, nullable = false)
	private String uf;
	private String descricao;
	
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	*/
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDesc(String desc) {
		this.descricao = desc;
	}
		
}
