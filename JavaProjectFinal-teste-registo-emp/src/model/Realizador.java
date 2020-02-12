package model;


public class Realizador {

	

	private String nome = new String();
//	private String email= new String();//criar excepçoes para NULL
//	private String morada = new String();//criar excepçoes para NULL
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return nome;
	}

}
