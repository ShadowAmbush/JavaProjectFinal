package model;
public class Equipamento extends Artigo {

	private String tipo = new String();
	private String desc = new String();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setEmprestado(Amigo amigo)
	{
		super.setEmprestado(amigo);
	}
	@Override	
	public String toString()
	{
		String string = super.toString() + "_________________________________\n"+
										   "|           EQUIPAMENTO          \n"+
										   "|Tipo: " + getTipo()+"           \n"+
	                                       "|Descrição: " + getDesc()+"      ";
		return string;
		
	}
}
