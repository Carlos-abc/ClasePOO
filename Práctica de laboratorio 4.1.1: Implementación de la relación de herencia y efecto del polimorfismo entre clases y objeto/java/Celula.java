public class Celula {

	protected String nombre;
	protected String tipo;

	public Celula(String nombre, String tipo){

		this.nombre = nombre;
		this.tipo = tipo;

	}
	/*public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		
		return nombre;
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}*/

	public String MostrarDatos(){

        return "Tipo: "+nombre+"\nNombre: "+tipo;
   }

}