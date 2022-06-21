package br.com.panfletonline.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable = false, unique = true, nullable = false)
	private int id;
	private String email;
	private String fcm_end;
	private String senha;
	private int cidade_usuario;
	private String senha_provisoria;
	private String termo_uso;
	
	public Usuario() {}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFcm_end() {
		return fcm_end;
	}
	public void setFcm_end(String fcm_end) {
		this.fcm_end = fcm_end;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCidade_usuario() {
		return cidade_usuario;
	}
	public void setCidade_usuario(int cidade_usuario) {
		this.cidade_usuario = cidade_usuario;
	}
	public String getSenha_provisoria() {
		return senha_provisoria;
	}
	public void setSenha_provisoria(String senha_provisoria) {
		this.senha_provisoria = senha_provisoria;
	}
	public String getTermo_uso() {
		return termo_uso;
	}
	public void setTermo_uso(String termo_uso) {
		this.termo_uso = termo_uso;
	}
	
	

}
