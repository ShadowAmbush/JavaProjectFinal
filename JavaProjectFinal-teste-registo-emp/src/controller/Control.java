package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import model.Autor;
import model.DVD;
import model.Emprestimo;
import model.Equipamento;
import model.Ferramenta;
import model.Livro;
import model.Outro;
import model.Realizador;
import model.Reserva;
import view.IO;
import model.Artigo;
import model.Amigo;

public class Control {

	private  ArrayList<Artigo> art = new ArrayList<Artigo>();
	private  ArrayList<Amigo> amigo = new ArrayList<Amigo>();
	private ArrayList<Emprestimo> emprestimo = new ArrayList<>();
	private ArrayList<Reserva> reservado = new ArrayList<>();
	@SuppressWarnings("unused")
	private  ArrayList<Autor> autor = new ArrayList<Autor>();
	@SuppressWarnings("unused")
	private  ArrayList<Realizador> realizador = new ArrayList<Realizador>();
	private String amigosFiles = "Amigos.dat";
	
	
	
	public String getAmigosFiles() {
		return amigosFiles;
	}
	public void setAmigosFiles(String amigosFiles) {
		this.amigosFiles = amigosFiles;
	}
	//Registo de Livro
	public  void RegistarLivro(Livro l) {

		art.add(l);
	}
	//Registo de Equipamento
	public  void RegistarEquip(Equipamento l) {

		art.add(l);
	}
	//Registo de DVD
	public  void RegistarDVD(DVD l) {

		art.add(l);
	}
	//Registo de Ferramenta
	public  void RegistarTool(Ferramenta l) {

		art.add(l);
	}
	//Registo de Outro
	public  void RegistarOutro(Outro l) {

		art.add(l);
	}
	//Registo de Reservas
	public void RegRes(Reserva r)
	{
		reservado.add(r);
	}
	//Registo de Amigos
	public  void RegistarAmigo(Amigo a) {

		amigo.add(a);
	}
	//Verificar Amigo através de ID
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
	//verificar Artigo através de ID
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
	//Verificação de Reserva
	public void verificaReserva(Amigo amigo,Artigo art)
	{
		if(art.getQuantRes() <= 0)
		{
			System.out.println("Erro! Este artigo já foi reservado!");
		}
		else
		{
			if(amigo.getQuantRes() <= 0)
			{
				System.out.println("Erro! Já tem um artigo reservado!");
			}
			else
			{
				Reserva reserva = new Reserva();
				reserva.setAmigo(amigo);
				reserva.setArtRes(art);
				amigo.ReduzRes(1);
				art.ReduzRes(1);
				for (Emprestimo e : emprestimo) {
					if(art.getArtID().equals(e.getArtEmp()))
						reserva.setData(e.getDataFinal());
				}
				RegRes(reserva);
				System.out.println("Reserva efetuada para a data: "+reserva.getData());
			}
		}
		
	}
	//Registo de Empréstimo
	public void RegEmp(Amigo amigo, Artigo art, Emprestimo e)
	{	
		if(art.getEmprestado() != null)
		{
			if(amigo.getAmigoID().equals(art.getEmprestado().getAmigoID()))
			{
				System.out.println("Não pode reservar um artigo que já tem emprestado!");
			}
			else
			{
					String op;
					System.out.println("Este artigo já está emprestado, quer que verifique se pode reservá-lo?");
					System.out.println("S/N?");
					op = IO.getString().toUpperCase();
					if(op.contentEquals("S"))
					{
						verificaReserva(amigo,art);
					}
						
					else
					{
						System.out.println("Reserva não efectuada!");
					}
			
			}
		}
		else
		{
			if(amigo.getQuantEmp() <= 0)
			{
				System.out.println("Não é possivel este utilizador fazer mais empréstimos!");
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
						
						System.out.println("Empréstimo criado com sucesso!");	
			}
			
		}
	}
	//Consulta de Artigos	
	public Integer ConsultarArtigos()
	{
		if(art.isEmpty() == true)
		{
    		System.out.println("Sem Artigos a apresentar!");
    		return null;
		}
		for (Artigo a : art) {
			System.out.println(a);
		}
		return 1;
	}
	//Consulta de Empréstimos
	public void ConsultarEmp()
	{
		if(emprestimo.isEmpty() == true)
    		System.out.println("Não existem empréstimos registados!");
		for (Emprestimo e : emprestimo) {
			System.out.println(e);
		}
	}
	//Consulta de Amigos
	public Integer ConsultarAmigos() throws IOException, ClassNotFoundException
	{
		
		if(amigo.isEmpty() == true)
		{
	        	System.out.println("Sem Amigos a apresentar!");
				return null;
		}else
		{
	        for (Amigo a : amigo) {
			
	        		System.out.println(a);
	        		}
		}
		return 1;
	 }
	

	public void ConsultarArtigosEmp()
	{
		if(art.isEmpty() == true)
    		System.out.println("Sem Artigos a apresentar!");
		for (Artigo a : art) {
			if(a.getEmprestado() != null)
				System.out.println(a);
			
		}
		System.out.println("Não existem Artigos emprestado ainda!");
	}
	
	//Backup do Array de Artigos para ficheiro
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
	//Backup do Array de Amigos para ficheiro
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
	//Backup do Array de Empréstimos para ficheiro		
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
		System.out.println("Backup de Empréstimos efectuado com sucesso para o ficheiro!");
	}
	//Deserialization de objeto do ficheiro       
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
	        	
	  public Integer checkISBN(Integer id)
	     {
	    	 for (Artigo a : art) 
	    	 {
	    		 if(a.getClass().getSimpleName().equals("Livro"))
	    		 {
						try 
						{
							if(a.getClass().getMethod("getISBN") != null)
								 
								if(a.getClass().getMethod("getISBN").invoke(a).equals(id))
								{
									
									System.out.println("Já existe um livro registado com o ISBN: "+a.getClass().getMethod("getISBN").invoke(a));
									return 1;
								
								}
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    		 
	    		 }
	
	    	 }
			
			return null;
	        	
	        
	     }       
     public Integer checkIDDVD(Integer id)
	     {
	    	 for (Artigo a : art) 
	    	 {
	    		 if(a.getClass().getSimpleName().equals("DVD"))
	    		 {
						try 
						{
							if(a.getClass().getMethod("getId") != null)
								 
								if(a.getClass().getMethod("getId").invoke(a).equals(id))
								{
									
									System.out.println("Já existe um DVD registado com o Id: "+a.getClass().getMethod("getId").invoke(a));
									return 1;
								
								}
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    		 
	    		 }
	
	    	 }
			
			return null;
	        	
	        
	     }
   
    
     
	}