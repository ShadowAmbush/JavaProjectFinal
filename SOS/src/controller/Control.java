package controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import model.Autor;
import model.DVD;
import model.Emprestimo;
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
	private ArrayList<Emprestimo> emprestimo = new ArrayList<>();
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
	public Amigo CheckAmigo(Integer Amigo)
	{
		for (Amigo a : amigo)
		{
			if(a.getAmigoID().equals(Amigo))
				return a;
		}
		System.out.println("Nenhum Amigo corresponde ao valor introduzido!");
		return null;
	}
	public Artigo CheckArtigo(Integer id)
	{
		for (Artigo art : art)
		{
			if(art.getArtID().equals(id))
				return art;
		}
		System.out.println("Nenhum Artigo corresponde ao valor introduzido!");
		return null;
		
	
	}
	public void RegEmp(Amigo amigo, Artigo art, Emprestimo e)
	{	
			if(amigo.getQuantEmp().compareTo(e.getPodeEmprestar()))
			{
				
			}
						
						art.setEmprestado(amigo);
						amigo.setEmprestado(art);
						e.setNome(amigo.getNome());
						e.setTelefone(amigo.getTelefone());
						e.setMorada(amigo.getMorada());
						e.setArtEmp(art);
//						amigo.setQuantEmp(quantEmp);
						emprestimo.add(e);
						System.out.println("Empréstimo criado com sucesso!");	
	}

	public void ConsultarArtigos()
	{
		if(art.isEmpty() == true)
    		System.out.println("Sem Artigos a apresentar!");
		for (Artigo a : art) {
			System.out.println(a);
		}
	}
	public void ConsultarEmp()
	{
		if(emprestimo.isEmpty() == true)
    		System.out.println("Não existem empréstimos registados!");
		for (Emprestimo e : emprestimo) {
			System.out.println(e);
		}
	}
	public void ConsultarAmigos()
	{
	    	if(amigo.isEmpty() == true)
	    		System.out.println("Sem Amigos a apresentar!");
		for (Amigo a : amigo) {
			
			System.out.println(a);
		}
	}
}