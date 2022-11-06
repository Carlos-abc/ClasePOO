public class Playas extends Ecosistema {

    public String estado;

    public Playas(String tipo,String nombre,String localizacion,String estado){
        
        super(tipo,nombre,localizacion);
        this.estado = estado;

    }

    /*public void SetNombre(String nombre){
        
        this.nombre = nombre;
    }

    public String GetNombre(){

        return nombre;
    }

    public void SetLocalizacion(String localizacion){
        
        this.localizacion = localizacion;
    }

    public String GetLocalizacion(){

        return localizacion;
    }

    public void SetEstado(String estado){
        
        this.estado = estado;
    }

    public String GetEstado(){

        return estado;
    }*/

    @Override
    public String MostrarDatos(){

        return "Tipo: "+tipo+"\nNombre: "+nombre+"\nLocalizacion: "+localizacion+ "\nEstado: "+estado;
    }
    
}