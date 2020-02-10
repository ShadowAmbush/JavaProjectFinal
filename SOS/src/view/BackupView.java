package view;

import java.io.IOException;

import controller.Control;

public class BackupView {

	Control control = new Control();
	public void Backups()
	{
	System.out.println("-----------------------------------");
	System.out.println("           BACKUPS                 ");
	System.out.println("-----------------------------------");
	System.out.println("1- Efectuar backup dos Amigos ");
	System.out.println("2- Efectuar backup dos Artigos");
	System.out.println("3- Efectuar backup dos Empréstimos");
	System.out.println("4- Efectuar backup das Reservas ");
	System.out.println("5- Sair                            ");
	System.out.println("-----------------------------------");
	System.out.println("Selecione uma opção:               ");
	int op = IO.getInt();
	switch (op) {
	case 1:
		//Backup de Amigos
		try {
			control.BackupAmigos();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		break;
	case 2:
		//ABackup de Artigos
		try {
			control.BackupArtigos();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Backup de Artigos realizado com sucesso!");
		break;
	case 3:
		//Backup de Empréstimos
		try {
			control.BackupEmp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	case 4:
		//Backup de Reservas
		break;
	case 5:
		
		break;
	case 6:
		
		break;
	case 7:
			
		break;
	default:
		break;
	}
	
} 
}
