public class Neutrolitro extends Celula {

	protected String clase;

	public Neutrolitro(String nombre,String tipo,String clase){
        
        super(nombre,tipo);
        this.clase = clase;

    }
	@Override
	public String MostrarDatos(){

        return "Tipo: "+nombre+"\nNombre: "+tipo+"\nClase: "+clase;
   }
}