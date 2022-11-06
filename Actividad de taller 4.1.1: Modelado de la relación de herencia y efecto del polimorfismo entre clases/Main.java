public class Main {
    
    public static void main(String[] args) {
        
        Ecosistema misEcosistemas[] = new Ecosistema[3];

        misEcosistemas[0] = new SelvaHumeda("Selva","Palmar natural","Mexico","Yucatan");
        misEcosistemas[1] = new Praderas("Pradera","Lubial","Mexico","Quintana Roo");
        misEcosistemas[2] = new SelvaHumeda("Playa","Del Carmen","Mexico","CD MX");

        for(Ecosistema ecosistemas: misEcosistemas){

            System.out.println(ecosistemas.MostrarDatos());
            System.out.println("");
        }
    }
}
