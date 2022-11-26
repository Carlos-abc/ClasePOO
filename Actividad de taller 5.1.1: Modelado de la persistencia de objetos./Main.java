import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Ecosistema ecosistema = new Ecosistema("Ecosistema");
        BiotopoTerrestre bt = new BiotopoTerrestre("Biotopo Terrestre");
        BiotopoAcuatico ba = new BiotopoAcuatico("Biotopo Acuatico");

        ecosistema.getBiotopos().add(bt);
        ecosistema.getBiotopos().add(ba);
        bt.setEcosistema(ecosistema);
        ba.setEcosistema(ecosistema);

        System.out.println(bt);
        System.out.println(ba);

        System.out.println(ecosistema);


        FileOutputStream fileOutputStream;

        try{

            fileOutputStream = new FileOutputStream("ecosistema.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ecosistema);
            objectOutputStream.close();
        }
        catch(Exception e){

            e.printStackTrace();

        }

        FileOutputStream fileOutputStream2;

        try{

            fileOutputStream2 = new FileOutputStream("biotopo.ser");
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
            objectOutputStream2.writeObject(bt);
            objectOutputStream2.close();
        }
        catch(Exception e){

            e.printStackTrace();

        }

        FileOutputStream fileOutputStream3;

        try{

            fileOutputStream3 = new FileOutputStream("biotopo2.ser");
            ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(fileOutputStream3);
            objectOutputStream3.writeObject(ba);
            objectOutputStream3.close();
        }
        catch(Exception e){

            e.printStackTrace();

        }
    }
    
}
