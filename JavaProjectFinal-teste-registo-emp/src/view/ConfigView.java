package view;
import view.Run;
import controller.Control;
import view.IO;

public class ConfigView {
	
	
	public void Configuracoes()
	{
	System.out.println("-----------------------------------");
	System.out.println("           CONFIGURA��ES           ");
	System.out.println("-----------------------------------");
	System.out.println("1- Alterar n� de Empr�stimos/Pessoa ");
	System.out.println("2- Alterar n� de dias de data limite");
	System.out.println("3- Alterar nome do ficheiro de Amigos");
	System.out.println("4- Alterar nome do ficheiro de Artigos");
	System.out.println("5- Alterar nome do ficheiro de Empr�stimos");
	System.out.println("6- Retroceder                      ");
	System.out.println("-----------------------------------");
	System.out.println("Selecione uma op��o:               ");
	int op = IO.getInt();
	switch (op) {
	case 1:
		//Alterar o valor de totalEmp
		System.out.println("Introduza o novo total de empr�stimos: ");
		Run.totalEmp =(IO.getInt());
		break;
	case 2:
		//Alterar valor de data limite
		System.out.println("Introduza o novo total de dias de empr�stimo: ");
		Run.dias =(IO.getInt());
		break;
	case 3:
		//Alterar nome de ficheiro de Amigos
		System.out.println("Introduza o novo nome do ficheiro de Amigos?");
		
		break;
	case 4:
		//Alterar nome de ficheiro de Artigos
				System.out.println("Introduza o novo nome do ficheiro de Amigos?");
		break;
	case 5:
		//Alterar nome de ficheiro de Empr�stimos
				System.out.println("Introduza o novo nome do ficheiro de Amigos?");
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
