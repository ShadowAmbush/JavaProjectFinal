package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo extends Artigo{
	
	
	private LocalDate data_Emp;
	private LocalDate data_Lim;
	DateTimeFormatter dataform = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String Data = data_Emp.format(dataform);
	DateTimeFormatter datalimite = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String DataFinal = data_Lim.format(datalimite);
    
}
