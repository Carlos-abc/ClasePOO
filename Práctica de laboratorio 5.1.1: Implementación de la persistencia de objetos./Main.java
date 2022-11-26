import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Celula celula = new Celula("Celula 1");
        CuerpoCelular cuerpoCelular = new CuerpoCelular("Cuerpo Celular 1");
        FibrasNerviosas fibrasNerviosas = new FibrasNerviosas("Fibras Nerviosas 1");
        Membrana membrana = new Membrana("Membrana 1");

        celula.getNeuronas().add(cuerpoCelular);
        celula.getNeuronas().add(fibrasNerviosas);
        celula.getOvulos().add(membrana);

        System.out.println(cuerpoCelular);
        System.out.println(fibrasNerviosas);
        System.out.println(membrana);

        FileOutputStream fileOutputStream;

        try {
            fileOutputStream = new FileOutputStream("celula.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(celula);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}


