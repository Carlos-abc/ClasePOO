public class Main {
    
    public static void main(String[] args) {
        
        Celula misCelulas[] = new Celula[3];

        misCelulas[0] = new Neurona("epiteliales","2","B");
        misCelulas[1] = new Neutrolitro(" Granulocito","1","D");
        misCelulas[2] = new Ovulo("NA","NA","NA");

        for(Celula celulas: misCelulas){

            System.out.println(celulas.MostrarDatos());
            System.out.println("");
        }


    }
}
