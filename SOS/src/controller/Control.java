package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
		
			if(amigo.getQuantEmp() <= 0)
		{
					System.out.println("N�o � possivel este utilizador fazer mais empr�stimos!");
		}
			else
			{
						art.setEmprestado(amigo);
						amigo.setEmprestado(art);
						e.setNome(amigo.getNome());
						e.setTelefone(amigo.getTelefone());
						e.setMorada(amigo.getMorada());
						e.setArtEmp(art);
					    amigo.ReduzEmp(1);
						emprestimo.add(e);
						this.art.remove(art);
						System.out.println("Empr�stimo criado com sucesso!");	
	}
			
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
    		System.out.println("N�o existem empr�stimos registados!");
		for (Emprestimo e : emprestimo) {
			System.out.println(e);
		}
	}
	public void ConsultarAmigos() throws IOException, ClassNotFoundException
	{
		
		if(amigo.isEmpty() == true)
	        	System.out.println("Sem Amigos a apresentar!");
	        for (Amigo a : amigo) {
			
	        		System.out.println(a);
	        		}
	 }
	       
			
	
	public void BackupArtigos() throws IOException
	{
		FileOutputStream file = new FileOutputStream("Artigos.dat");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		try {
			oos.writeObject(art);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oos.close();
		System.out.println("Backup de Amigos efectuado com sucesso para o ficheiro!");
	}
	final String amigosFiles = "Amigos.dat";
	public void BackupAmigos() throws IOException
	{
		File f = new File("Amigos.dat");
		try
		{
			f.createNewFile();
			ObjectOutputStream ficheiro = new ObjectOutputStream(new FileOutputStream(amigosFiles));
			ficheiro.writeObject(amigo);
			ficheiro.flush();
			ficheiro.close();
			System.out.println("Backup de Amigos efectuado com sucesso para o ficheiro!");
		}catch (IOException e)
		{
			e.printStackTrace();
		}
			
	}
	public void BackupEmp() throws IOException
	{
		FileOutputStream file = new FileOutputStream("Emprestimos.dat");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		try {
			oos.writeObject(emprestimo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oos.close();
		System.out.println("Backup de Empr�stimos efectuado com sucesso para o ficheiro!");
	}
	@SuppressWarnings("unchecked")
	public void restoreAmigos()
	{
		File ficheiro = new File(amigosFiles);
		if(ficheiro.exists())
		{
			ObjectInputStream f;
			try
			{
				f = new ObjectInputStream(new FileInputStream(amigosFiles));
				System.out.println("Antes tamanho do array de amigos = "+ amigo.size());
				amigo = (ArrayList<Amigo>) f.readObject();
				System.out.println("Depois tamanho de array de Amigos ="+amigo.size());
				f.close();
			}catch (IOException e)
			{
				e.printStackTrace();
			}catch (ClassNotFoundException c)
			{
				c.printStackTrace();
			}
		}
	}
	

}