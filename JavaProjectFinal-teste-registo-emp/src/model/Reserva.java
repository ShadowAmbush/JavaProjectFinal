package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Reserva {

private Amigo amigo = new Amigo();
	
	private Artigo artRes;
	private LocalDate data_Res = LocalDate.now();
	DateTimeFormatter dataform = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String Data = data_Res.format(dataform);

	
	
	public Amigo getAmigo() {
		return amigo;
	}
	public void setAmigo(Amigo amigo) {
		this.amigo = amigo;
	}
	public Artigo getArtRes() {
		return artRes;
	}
	public void setArtRes(Artigo artRes) {
		this.artRes = artRes;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}

	
}
