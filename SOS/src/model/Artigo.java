package model;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Artigo{
	
	
	private static final AtomicInteger cont = new AtomicInteger(1);
	private final Integer artID;
	private Amigo emprestado = new Amigo();
	private Amigo reservado = new Amigo();
	
	public Artigo()
	{
		artID = cont.getAndIncrement();
	}
	public Integer getArtID() {
		return artID;
	}
	public AtomicInteger getCont() {
		return cont;
	}

	

	public Amigo getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(Amigo emprestado) {
		this.emprestado = emprestado;
	}

	public Amigo getReservado() {
		return reservado;
	}

	public void setReservado(Amigo reservado) {
		this.reservado = reservado;
	}


	@Override
	public String toString() {
		String string= "----------------------------\n"+
					   "|        ARTIGO Nº:" +artID+ "  |\n"+
				       "----------------------------\n";
		
		return string;
	}
	
	
	
	

}