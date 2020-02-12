package model;


public class Autor {


	private String nome = new String();
	//private String email= new String();//criar excepçoes para NULL
	//private String morada = new String();//criar excepçoes para NULL
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getMorada() {
//		return morada;
//	}
//	public void setMorada(String morada) {
//		this.morada = morada;
//	}
	@Override
	public String toString() {
		return  nome ;
	}
	
}
