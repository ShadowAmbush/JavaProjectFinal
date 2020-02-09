package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

import controller.Control;
import model.Admin;
import model.Amigo;
import model.Padrao;
import model.User;

public class MVCGestEmp implements Serializable{
	
	static Control control = new Control();
	static MenuView menu = new MenuView();
	/**
	 * 
	 */
	private static final long serialVersionUID = -8712655439587384301L;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int op;
		User ativo = restoreUser();
		System.out.print("User  : ");
		String login = IO.getString();
		System.out.print("Chave : ");
		String pass = IO.getString();
		if (login.equals(ativo.getLogin()) && pass.equals(ativo.getPass()))
			System.out.println("Autenticação de Admin com sucesso.");
		else
		{
			System.out.println("Pode consultar.");
			ativo = new Padrao();
		}
			do
			{
				
			
			System.out.println(ativo.showMenu());
			op = IO.getInt();
			
			
			if(ativo.ValidaOp(op))
				switch (op) {
				case 1:
					control.ConsultarArtigos(); 
					break;
				case 2:
					control.ConsultarAmigos();
					break;
				case 3:
					//Consultar empréstimos
					break;
				case 4:
					//Consultar Artigos emprestados
					break;
				case 5:
					//Lista de incumprimentos
					break;
				case 6:
						menu.MenuArtigos(control);
					break;
				case 7:
					Amigo amigo = new Amigo();
					System.out.println("Introduza o nome do Amigo a ser registado:");
					amigo.setNome(IO.getString());
					System.out.println("Introduza o telefone:");
					amigo.setTelefone(IO.getInt());
					System.out.println("Introduza a morada:");
					amigo.setNome(IO.getString());
					control.RegistarAmigo(amigo);
					break;
				case 8:
					//Registar Empréstimos
					break;
				case 9:
					//Registar reserva
					break;
				case 10:
					//Registar devolução
					break;
				case 11:
					//Configurações
					break;
				
				case 0:
					
					break;
				default:
					break;
				}
			}while(op != 0);
	}


	// =============== FUNÇÕES IO =========
	// Ler do dispositivo sandard de entrada
	// uma string que converte em interiro
	// que retorna
	public static int getInt() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Integer.parseInt(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que converte em double
	// que retorna
	public static double getDouble() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Double.parseDouble(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que converte em double
	// que retorna
	public static float getFloat() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Float.parseFloat(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que retorna
	public static String getString() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return t.nextLine();
		} catch (Exception e) {
			return "";
		}
	}	
	
		private static User restoreUser()
		{
			
			User ativo = null;
			
			File f = new File("Admin.dat");
			if (!f.exists())
				f = new File("Admin.dat");
		
			else
			{
				try
				{
					ObjectInputStream ficheiroIn = new ObjectInputStream(new FileInputStream("Admin.dat"));
					ativo = (User) ficheiroIn.readObject();
					ficheiroIn.close();
				} catch (IOException | ClassNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			if (ativo == null)
			{
				ativo = new Admin();
				ativo.setLogin("admin");
				ativo.setPass("admin");
			}
			return ativo;
		}
}	