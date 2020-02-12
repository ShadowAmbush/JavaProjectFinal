package model;
public class Ferramenta extends Artigo {

		/**
	 * 
	 */
	private static final long serialVersionUID = -2132574895656173269L;
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

		@Override	
		public String toString()
		{
			String string = super.toString() + "___________________________\n"+
											   "|           FERRAMENTA          \n"+
											   "|Tipo: " + getTipo()+"     \n"+
		                                       "|Descrição: " + getDesc()+ "\n";
			return string;
			
		}	
}
