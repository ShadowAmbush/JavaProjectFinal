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
					+"      1-Consultar lista de Artigos Registados      \n"
					+"      2-Consultar lista de Amigos                  \n"
					+"      3-Consultar lista de Empr�stimos             \n"
					+"      4-Consultar lista de Artigos Emprestados     \n"
					+"      5-Consultar lista de Incumprimentos          \n"
					+"      6-Registar Artigos                           \n"
					+"      7-Registar Amigos                            \n"
					+"      8-Registar Empr�stimo                        \n"
					+"      9-Registar Devolu��o                         \n"
					+"      10-Backup de Amigos                          \n"
					+"      11-Backup de Artigos                         \n"
					+"      12-Backup de Empr�stimos                     \n"
					+"      13-Backup de Reservas                        \n"
					+"      14-Restauro de Amigos                        \n"
					+"      15-Configura��es                             \n"
					+"      0-Sair       \n"
					+"---------------------------------------------------\n"
					+"op��o : \n";
		return menu;
	}
	

	@Override
	public boolean ValidaOp(int op) {
		// TODO Auto-generated method stub
		
		if (op >= 0 && op <= 15)
			return true;
		return false;
	}
	
	
}
