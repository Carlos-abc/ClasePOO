public class Ecosistema {

    public String tipo;
    public String nombre;
    public String localizacion;
    /*public static void main(String[] args) {
        

        Playas playa1 = new Playas();
        SelvaHumeda selva1 = new SelvaHumeda();
        Praderas pradera1 = new Praderas();

        playa1.SetNombre("Playas Del Carmen");
        playa1.SetLocalizacion("Mexico");

        selva1.SetNombre("Palmar natural");
        selva1.SetLocalizacion("Mexico");

        pradera1.SetNombre("Lubial");
        pradera1.SetLocalizacion("Mexico");

        System.out.println(playa1.GetNombre()+ " se encuentra en "+playa1.GetLocalizacion());
        System.out.println(selva1.GetNombre()+ " se encuentra en "+selva1.GetLocalizacion());
        System.out.println(pradera1.GetNombre()+ " se encuentra en "+pradera1.GetLocalizacion());
    }*/

   public Ecosistema(String tipo, String nombre, String localizacion) {

        this.tipo = tipo;
        this.nombre = nombre;
        this.localizacion = localizacion;
    

    }

public String MostrarDatos(){

        return "Tipo: "+tipo+"\nNombre: "+nombre+"\nLocalizacion: "+localizacion;
   }
}