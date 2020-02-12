package model;

public class Admin extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3390800977947679868L;


	@Override
	public String showMenu() {
		// TODO Auto-generated method stub
		String menu = "--------------------------------------------------\n"
					+"   	            		MENU                     \n"
					+"---------------------------------------------------\n"
					+"      1-Consultar Artigos Registados               \n"
					+"      2-Consultar lista de Amigos                  \n"
					+"      3-Consultar lista de Empréstimos             \n"
					+"      4-Consultar lista de Artigos Emprestados     \n"
					+"      5-Consultar lista de Incumprimentos          \n"
					+"      6-Registar Artigos                           \n"
					+"      7-Registar Amigos                            \n"
					+"      8-Registar Empréstimo                        \n"
					+"      9-Registar Reserva                           \n"
					+"      10-Registar Devolução                        \n"
					+"      11-Backup de Amigos                          \n"
					+"      12-Restauro de Amigos                        \n"
					+"      13-Configurações                             \n"
					+"      0-Sair       \n"
					+"---------------------------------------------------\n"
					+"opção : \n";
		return menu;
	}
	

	@Override
	public boolean ValidaOp(int op) {
		// TODO Auto-generated method stub
		
		if (op >= 0 && op <= 13)
			return true;
		return false;
	}
	
	
}
