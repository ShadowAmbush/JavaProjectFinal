package view;



import controller.Control;
import model.DVD;
import model.Equipamento;
import model.Ferramenta;
import model.Livro;
import model.Outro;

public class MenuRegArtigo {
	
	public  void MenuArtigos(Control control) {
		
		System.out.println("-----------------------------------");
		System.out.println("         Registar Artigo           ");
		System.out.println("-----------------------------------");
		System.out.println("1- Registar um Livro               ");
		System.out.println("2- Registar um DVD                 ");
		System.out.println("3- Registar um Equipamento         ");
		System.out.println("4- Registar uma Ferramenta         ");
		System.out.println("5- Registar Outro                  ");
		System.out.println("6- Retroceder                      ");
		System.out.println("7- Sair                            ");
		System.out.println("-----------------------------------");
		System.out.println("Selecione uma opção:               ");
		int op = IO.getInt();
		switch (op) {
		case 1:
			Livro l = new Livro();
			System.out.println("Insira o ISBN:");
			l.setISBN(IO.getInt());
			System.out.println("Insira o titulo:");
			l.setTitulo(IO.getString());
			System.out.println("Insira o Autor:");
			l.setAutor(IO.getString());
			l.setQuantRes(Run.totalRes);
			control.RegistarLivro(l);
			break;
		case 2:
			DVD d = new DVD();
			System.out.println("Insira o Id do DVD:");
			d.setId(IO.getInt());
			System.out.println("Insira o titulo:");
			d.setTitulo(IO.getString());
			System.out.println("Insira o Realizador:");
			d.setRealizador(IO.getString());
			d.setQuantRes(Run.totalRes);
			control.RegistarDVD(d);
			break;
		case 3:
			Equipamento e = new Equipamento();
			System.out.println("Insira o tipo de Equipamento:");
			e.setTipo(IO.getString());
			System.out.println("Insira uma descrição:");
			e.setDesc(IO.getString());
			e.setQuantRes(Run.totalRes);
			control.RegistarEquip(e);
			break;
		case 4:
			Ferramenta f = new Ferramenta();
			System.out.println("Insira o tipo de Ferramenta:");
			f.setTipo(IO.getString());
			System.out.println("Insira uma descrição:");
			f.setDesc(IO.getString());
			f.setQuantRes(Run.totalRes);
			control.RegistarTool(f);
			break;
		case 5:
			Outro o = new Outro();
			System.out.println("Insira o tipo de Objeto:");
			o.setTipo(IO.getString());
			System.out.println("Insira uma descrição:");
			o.setDesc(IO.getString());
			o.setQuantRes(Run.totalRes);
			control.RegistarOutro(o);
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
