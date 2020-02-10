package view;
import view.MVCGestEmp;
import view.IO;

public class ConfigView {
	
	
	public void Configuracoes()
	{
	System.out.println("-----------------------------------");
	System.out.println("           CONFIGURAÇÕES           ");
	System.out.println("-----------------------------------");
	System.out.println("1- Alterar nº de Empréstimos/Pessoa ");
	System.out.println("2- Alterar nº de dias de data limite");
	System.out.println("3- Alterar caminho do ficheiro de backup");
	System.out.println("4- Retroceder                      ");
	System.out.println("5- Sair                            ");
	System.out.println("-----------------------------------");
	System.out.println("Selecione uma opção:               ");
	int op = IO.getInt();
	switch (op) {
	case 1:
		//Alterar o valor de totalEmp
		System.out.println("Introduza o novo total de empréstimos: ");
		MVCGestEmp.totalEmp =(IO.getInt());
		break;
	case 2:
		//Alterar valor de data limite
		System.out.println("Introduza o novo total de dias de empréstimo: ");
		MVCGestEmp.dias =(IO.getInt());
		break;
	case 3:
		//Alterar path de ficheiro backup
		break;
	case 4:
		
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
