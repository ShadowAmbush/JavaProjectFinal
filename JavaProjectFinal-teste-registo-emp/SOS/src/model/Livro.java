package model;
public class Livro extends Artigo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8199552736503293792L;
	private Integer ISBN = new Integer(0);
	private String titulo = new String();
	private Autor autor = new Autor();
	
	public Integer getISBN() {
		return ISBN;
	}
	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor.setNome(autor); 
	}
	public String getTitulo() {
		return titulo;
	}
	public  void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	@Override
	public String toString()
	{
		String string = super.toString() + "___________________________\n"+
										   "|           LIVRO          \n"+
										   "|Id: " + getISBN()+"       \n"+
	                                       "|Titulo: " + getTitulo()+" \n"+
	                                       "|Autor: " + getAutor()+"\n";
		return string;
		
	}
	
	
}
