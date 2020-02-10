package model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Emprestimo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Amigo amigo = new Amigo();
	
	private Artigo artEmp;
	private LocalDate data_Emp = LocalDate.now();
	private LocalDate data_Lim = data_Emp.plus(1,ChronoUnit.DAYS);
	DateTimeFormatter dataform = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String Data = data_Emp.format(dataform);
	DateTimeFormatter datalimite = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String DataFinal = data_Lim.format(datalimite);
	
	
	
	
	

	public void setNome(String nome) {
		this.amigo.setNome(nome);
	}
	public void setTelefone(Integer tele)
	{
		this.amigo.setTelefone(tele);
	}
	public void setMorada( String morada)
	{
		this.amigo.setMorada(morada);
	}
	public String getNome()
	{
		return amigo.getNome();
	}
	public Integer getTelefone()
	{
		return amigo.getTelefone();
	}
	public String getMorada()
	{
		return amigo.getNome();
	}
	
	public Artigo getArtEmp() {
		return artEmp;
	}
	public void setArtEmp(Artigo artEmp) {
		this.artEmp = artEmp;
	}
	public LocalDate getData_Emp() {
		return data_Emp;
	}
	public void setData_Emp(LocalDate data_Emp) {
		this.data_Emp = data_Emp;
	}
	public LocalDate getData_Lim() {
		return data_Lim;
	}
	public void setData_Lim(Integer dias) {
		this.data_Lim = data_Emp.plus(dias,ChronoUnit.DAYS);
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getDataFinal() {
		return DataFinal;
	}
	public void setDataFinal(String dataFinal) {
		DataFinal = dataFinal;
	}
	@Override
	public String toString() {
		
		String string = "________________________\n"+
					    "|       EMPRÉSTIMO       \n"+
						"|Nome: " + amigo.getNome() +       "\n"+
						"|Telefone: "+amigo.getTelefone()+  "\n"+
						"|Morada: "+amigo.getMorada()+      "\n"+
						"|Artigo emprestado: "+artEmp.getArtID()+"\n"+
						"|Emprestado a: "+Data+  "\n"+
						"|Devolver até: "+DataFinal+"\n";
		
		return string;
	}
    
	
}
