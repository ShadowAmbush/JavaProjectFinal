package model;

import java.io.Serializable;

public class Amigo implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1506552126282228832L;
	/**
	 * 
	 */
	
	private final Integer amigoID;
	private static int totalAmigos=0;
	private String nome = new String();
	private Integer quantEmp = new Integer(0);
	private Integer quantRes = new Integer(0);
	private Integer telefone = new Integer(0);
	private String morada = new String();
	private Artigo emprestado;
	private Artigo reservado;
	
	
	
	public Integer getAmigoID() {
		return amigoID;
	}
	public Amigo()
	{
		amigoID = ++totalAmigos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantEmp() {
		return quantEmp;
	}
	public Integer getQuantRes() {
		return quantRes;
	}
	public void setQuantRes(Integer quantRes) {
		this.quantRes = quantRes;
	}
	public void ReduzEmp(Integer quantEmp)
	{
		this.quantEmp -= quantEmp;
	}
	public void ReduzRes(Integer quantRes)
	{
		this.quantRes -= quantRes;
	}
	public void setQuantEmp(Integer quantEmp) {
		this.quantEmp = quantEmp;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public Artigo getReservado() {
		return this.reservado;
	}
	public void setReservado(Artigo reservado) {
		this.reservado = reservado;
	}
	public Artigo getEmprestado() {
		return this.emprestado;
	}
	public void setEmprestado(Artigo emprestado) {
		this.emprestado = emprestado;
	}
	
	@Override
	public String toString() {
		String string = "______________________\n"+
						"|      AMIGO Nº: "+amigoID+"\n"+
						"|nome: " + nome +    "\n"+
						"|telefone: " +telefone+"\n"+
						"|morada: "+morada+"\n";

						
						
		return string;
	}
	

	
	
}
