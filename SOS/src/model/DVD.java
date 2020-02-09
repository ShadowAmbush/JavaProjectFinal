package model;


public class DVD extends Artigo {

		private Integer id = new Integer(0);
		private String titulo;
		private String cat = new String();
		private Realizador realizador =new Realizador();
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
		public Realizador getRealizador() {
			return realizador;
		}
		public void setRealizador(String real) {
			this.realizador.setNome(real); 
		}

		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		@Override	
		public String toString()
		{
			String string = super.toString() + "|            DVD           \n"+
											   "|Id: " + getId()+"         \n"+
		                                       "|Titulo: " + getTitulo() +"\n"+
		                                       "|Categoria: " + getCat() +"\n"+
		                                       "|Realizador: " + getRealizador()+"\n";
			return string;
			
		}
		
}
