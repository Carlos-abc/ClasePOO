public class Main {
    
    public static void main(String[] args) {
        

        Playas playa1 = new Playas();
        SelvaHumeda selva1 = new SelvaHumeda();
        Praderas pradera1 = new Praderas();

        playa1.setNombre("Playas Del Carmen");
        playa1.SetLocalizacion("Mexico");

        selva1.setNombre("Palmar natural");
        selva1.SetLocalizacion("Mexico");

        pradera1.setNombre("Lubial");
        pradera1.SetLocalizacion("Mexico");

        System.out.println(playa1.getNombre()+ " se encuentra en "+playa1.GetLocalizacion());
        System.out.println(selva1.getNombre()+ " se encuentra en "+selva1.GetLocalizacion());
        System.out.println(pradera1.getNombre()+ " se encuentra en "+pradera1.GetLocalizacion());
    }

}
