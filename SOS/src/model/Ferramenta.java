package model;
public class Ferramenta extends Artigo {

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
			String string = super.toString() + "|           OUTRO          \n"+
											   "|Tipo: " + getTipo()+"     \n"+
		                                       "|Descrição: " + getDesc()+ "\n";
			return string;
			
		}	
}
