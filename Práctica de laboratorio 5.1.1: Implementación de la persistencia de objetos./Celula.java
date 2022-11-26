import java.io.Serializable;
import java.util.*;


public class Celula implements Serializable{

    private String nombre;
    private Vector<Neurona> neuronas;
    private Vector<Ovulo> ovulos;
    private Vector<Neutrolitro> neutrolitros;

    public Celula(String nombre){
        this.nombre = nombre;
        neuronas = new Vector<Neurona>();
        ovulos = new Vector<Ovulo>();
        neutrolitros = new Vector<Neutrolitro>();
    }

    public void addNeurona(Neurona neurona){
        neuronas.add(neurona);
    }

    public void addOvulo(Ovulo ovulo){
        ovulos.add(ovulo);
    }

    public void addNeutrolitro(Neutrolitro neutrolitro){
        neutrolitros.add(neutrolitro);
    }

    public String getNombre(){
        return nombre;
    }

    public Vector<Neurona> getNeuronas(){
        return neuronas;
    }

    public Vector<Ovulo> getOvulos(){
        return ovulos;
    }

    public Vector<Neutrolitro> getNeutrolitros(){
        return neutrolitros;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNeuronas(Vector<Neurona> neuronas){
        this.neuronas = neuronas;
    }

    public void setOvulos(Vector<Ovulo> ovulos){
        this.ovulos = ovulos;
    }

    public void setNeutrolitros(Vector<Neutrolitro> neutrolitros){
        this.neutrolitros = neutrolitros;
    }

    public String toString(){
        return nombre;
    }

    public void setCelula(){

        this.setNombre("Celula");
        this.setNeuronas(new Vector<Neurona>());
        this.setOvulos(new Vector<Ovulo>());
        this.setNeutrolitros(new Vector<Neutrolitro>());
    }
}