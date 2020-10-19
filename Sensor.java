import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Sensor{

    private String tipo;
    private double valor;
    public static Sensor[] sensores = new Sensor[8];
    public final static int TAMANO = 8;
    public static int posAnadir = 0;
    public static Sensor[] ordenados;

    public Sensor(){
        this.sensores[this.posAnadir] = this;
        this.posAnadir++;
    }

    public Sensor(String t, double v){
        this.tipo =t;
        this.valor = v;
        this.sensores[this.posAnadir] = this;
        this.posAnadir++;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public String toString(){
        String datos = "/" + this.tipo + ", " + this.valor + "/ ";
        return datos;
    }

    public static String toStringSensores(){
        String datosTotales = "";
        for(int i=0; i<posAnadir; i++){
            datosTotales = datosTotales + sensores[i].toString();
        }
        if (datosTotales.equals("")){
            datosTotales = "no hay sensores";
        }
        return datosTotales;
    }

    public static int cantidadSensores(){
        return posAnadir;
    }

    public static String sensoresTemperatura(){
        String temperaturas = "";
        if(posAnadir!=0){
            for (int i=0; i<posAnadir; i++){
                if((sensores[i].getTipo()).equals("temperatura")){
                    temperaturas = temperaturas + sensores[i].toString();
                }
            }
        } 
        if(temperaturas.equals("")){
            temperaturas = "no hay sensores de tipo temperatura";
        }
        return temperaturas;
    }

    public static ArrayList<Sensor> arregloTemperatura(){
        ArrayList<Sensor>temperaturas = new ArrayList();
        for(int i=0; i<posAnadir;i++){
            if((sensores[i].getTipo()).equals("temperatura")){
                temperaturas.add(sensores[i]);
            }
        }
        Collections.sort(temperaturas,Comparator.comparing(Sensor::getValor));
        return temperaturas;
    }

    public static String toStringSensoresOrdenados(ArrayList<Sensor>temperatura){
        String datosOrdenados= "";
        for(int i=0; i<temperatura.size(); i++){
            datosOrdenados = datosOrdenados + (temperatura.get(i).toString());
        }
        return datosOrdenados;
    }
    
}
