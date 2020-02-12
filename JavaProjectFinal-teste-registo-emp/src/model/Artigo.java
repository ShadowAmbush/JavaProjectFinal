package model;

import java.io.Serializable;

public abstract class Artigo implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7387133703775892793L;
	/**
	 * 
	 */
	
	private static int totalArtigos=0;
	private final Integer artID;
	private Amigo emprestado;
	private Amigo reservado;
	private Integer quantRes = new Integer(0);
	
	public Artigo()
	{
		artID = ++totalArtigos;
	}
	public Integer getArtID() {
		return artID;
	}
	public void ReduzRes(Integer quantRes)
	{
		this.quantRes -= quantRes;
	}
	
	public Integer getQuantRes() {
		return quantRes;
	}
	public void setQuantRes(Integer quantRes) {
		this.quantRes = quantRes;
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
					   "|        ARTIGO Nº:" +artID+ "       |\n"+
				       "----------------------------\n";
		
		return string;
	}
	
	
	
	

}