package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Emprestimo extends Artigo{
	
	private Amigo nome = new Amigo();
	private Amigo quantEmp = new Amigo();
	private Amigo telefone = new Amigo();
	private Amigo morada = new Amigo();
	private Artigo artEmp;
	private LocalDate data_Emp = LocalDate.now();
	private LocalDate data_Lim = data_Emp.plus(1,ChronoUnit.DAYS);
	DateTimeFormatter dataform = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String Data = data_Emp.format(dataform);
	DateTimeFormatter datalimite = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String DataFinal = data_Lim.format(datalimite);
	public Amigo getNome() {
		return nome;
	}
	public void setNome(Amigo nome) {
		this.nome = nome;
	}
	public Amigo getQuantEmp() {
		return quantEmp;
	}
	public void setQuantEmp(Amigo quantEmp) {
		this.quantEmp = quantEmp;
	}
	public Amigo getTelefone() {
		return telefone;
	}
	public void setTelefone(Amigo telefone) {
		this.telefone = telefone;
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
						"|Nome: " + nome +       "\n"+
						"|Telefone: "+telefone+  "\n"+
						"|Morada: "+morada+      "\n"+
						"|Emprestado a: "+Data+  "\n"+
						"|Devolver até: "+DataFinal+"\n";
		
		return string;
	}
    
	
}
