package model;

public class Padrao extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 299652715086760968L;

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
					+"      0-Sair          \n"
					+"---------------------------------------------------\n"
					+"opção : \n";
		return menu;
	}

	@Override
	public boolean ValidaOp(int op) {
		// TODO Auto-generated method stub
		if (op >= 0 && op <= 5)
			return true;
		return false;
	}
	
	
}
