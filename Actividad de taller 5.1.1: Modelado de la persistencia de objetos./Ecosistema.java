import java.io.Serializable;
import java.util.*;

public class Ecosistema extends SistemaBiologico implements Serializable{

    private String nombre;
    private Vector<Biosenosis> biosenosis;
    private Vector<Biotopo> biotopos;

    public Ecosistema(String nombre){

        this.nombre = nombre;
        this.biosenosis = new Vector<Biosenosis>();
        this.biotopos = new Vector<Biotopo>();

    }

    public String getNombre(){

        return this.nombre;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public Vector<Biosenosis> getBiosenosis(){

        return this.biosenosis;

    }

    public void setBiosenosis(Vector<Biosenosis> biosenosis){

        this.biosenosis = biosenosis;

    }

    public Vector<Biotopo> getBiotopos(){

        return this.biotopos;

    }

    public void setBiotopos(Vector<Biotopo> biotopos){

        this.biotopos = biotopos;

    }

    public void addBiotopo(Biotopo biotopo){

        this.biotopos.add(biotopo);

    }

    public void addBiosenosis(Biosenosis biosenosis){

        this.biosenosis.add(biosenosis);

    }

    public void removeBiotopo(Biotopo biotopo){

        this.biotopos.remove(biotopo);

    }

    public void removeBiosenosis(Biosenosis biosenosis){

        this.biosenosis.remove(biosenosis);

    }

    public void setEcosistema(){

        this.setNombre("Ecosistema");
        this.setBiotopos(new Vector<Biotopo>());
        this.setBiosenosis(new Vector<Biosenosis>());

    }



}