package model;

public abstract class Artigo{
	
	
	
	private Amigo emprestado = null;
	private Amigo reservado = null;
	
	
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
					   "|          ARTIGO          |\n"+
				       "----------------------------\n";
		
		return string;
	}
	
	
	
	

}