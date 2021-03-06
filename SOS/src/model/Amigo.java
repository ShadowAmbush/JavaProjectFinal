package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Amigo{
	
	private static final AtomicInteger count = new AtomicInteger(1);
	private final Integer amigoID;
	private String nome = new String();
	private Integer quantEmp = new Integer(0);
	private Integer telefone = new Integer(0);
	private String morada = new String();
	private Artigo emprestado;
	private Artigo reservado;
	
	public Integer getAmigoID() {
		return amigoID;
	}
	public Amigo()
	{
		amigoID = count.getAndIncrement();
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
		return reservado;
	}
	public void setReservado(Artigo reservado) {
		this.reservado = reservado;
	}
	public Artigo getEmprestado() {
		return emprestado;
	}
	public void setEmprestado(Artigo emprestado) {
		this.emprestado = emprestado;
	}
	
	@Override
	public String toString() {
		String string = "______________________\n"+
						"|      AMIGO N�: "+amigoID+"\n"+
						"|nome: " + nome +    "\n"+
						"|telefone: " +telefone+"\n"+
						"|morada: "+morada+"\n";
//						if(emprestado.equals(null))
//							string += "|artigo(s) emprestado(s): \n";
//						string += "|sem empr�stimos feitos\n";
//						
//						if(reservado.equals(null))
//							string += "|artigo(s) reservados(s): \n";
//						string += "|sem reservas efetuadas feitos\n";
						
						
		return string;
	}
	

	
	
}
