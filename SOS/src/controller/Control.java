package controller;

import java.util.ArrayList;


import model.Autor;
import model.DVD;
import model.Equipamento;
import model.Ferramenta;
import model.Livro;
import model.Outro;
import model.Realizador;
import model.Artigo;
import model.Amigo;

public class Control {

	private  ArrayList<Artigo> art = new ArrayList<Artigo>();
	private  ArrayList<Amigo> amigo = new ArrayList<Amigo>();
	@SuppressWarnings("unused")
	private  ArrayList<Autor> autor = new ArrayList<Autor>();
	@SuppressWarnings("unused")
	private  ArrayList<Realizador> realizador = new ArrayList<Realizador>();

	public  void RegistarLivro(Livro l) {

		art.add(l);
	}
	public  void RegistarEquip(Equipamento l) {

		art.add(l);
	}
	public  void RegistarDVD(DVD l) {

		art.add(l);
	}
	public  void RegistarTool(Ferramenta l) {

		art.add(l);
	}
	public  void RegistarOutro(Outro l) {

		art.add(l);
	}
	public  void RegistarAmigo(Amigo a) {

		amigo.add(a);
	}

	public void ConsultarArtigos()
	{
		
		for (Artigo a : art) {
			System.out.println(a);
		}
	}
	public void ConsultarAmigos()
	{
		
		for (Amigo a : amigo) {
			System.out.println(a);
		}
	}
}