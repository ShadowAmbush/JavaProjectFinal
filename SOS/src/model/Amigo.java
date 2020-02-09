package model;

public class Amigo{
	
	private String nome = new String();
	private Integer quantEmp = new Integer(0);
	private Integer telefone = new Integer(0);
	private String morada = new String();
	private Amigo emprestado;
	private Amigo reservado;
	
	
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
	public Amigo getReservado() {
		return reservado;
	}
	public void setReservado(Amigo reservado) {
		this.reservado = reservado;
	}
	public Amigo getEmprestado() {
		return emprestado;
	}
	public void setEmprestado(Amigo emprestado) {
		this.emprestado = emprestado;
	}
	@Override
	public String toString() {
		String string = "|        AMIGO        \n"+
						"|nome: " + nome +    "\n"+
						"|telefone: " +telefone+"\n"+
						"|morada: "+morada+"\n";
//						if(emprestado.equals(null))
//							string += "|artigo(s) emprestado(s): \n";
//						string += "|sem empréstimos feitos\n";
//						
//						if(reservado.equals(null))
//							string += "|artigo(s) reservados(s): \n";
//						string += "|sem reservas efetuadas feitos\n";
						
						
		return string;
	}

	
	
}
