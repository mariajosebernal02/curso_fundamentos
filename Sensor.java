import java.util.ArrayList;
public class Sensor{

    private String tipo;
    private double valor;
    public static Sensor[] sensores = new Sensor[8];
    public final static int TAMANO = 8;
    public static int posAnadir = 0;
    public static Sensor[] ordenados;

    public Sensor(){
        Sensor.sensores[Sensor.posAnadir] = this;
        Sensor.posAnadir++;
    }

    public Sensor(String t, double v){
        this.tipo =t;
        this.valor = v;
        Sensor.sensores[Sensor.posAnadir] = this;
        Sensor.posAnadir++;
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
        for(int i=0; i<Sensor.posAnadir; i++){
            datosTotales = datosTotales + Sensor.sensores[i].toString();
        }
        if (datosTotales.equals("")){
            datosTotales = "no hay sensores";
        }
        return datosTotales;
    }

    public static int cantidadSensores(){
        return Sensor.posAnadir;
    }

    public static String sensoresTemperatura(){
        String temperaturas = "";
        if(Sensor.posAnadir!=0){
            for (int i=0; i<Sensor.posAnadir; i++){
                if((Sensor.sensores[i].getTipo()).equals("temperatura")){
                    temperaturas = temperaturas + Sensor.sensores[i].toString();
                }
            }
        } 
        if(temperaturas.equals("")){
            temperaturas = "no hay sensores de tipo temperatura";
        }
        return temperaturas;
    }

    public static Sensor[] arregloTemperaturas(){
        ArrayList<Sensor>temperaturas = new ArrayList();
        for(int i=0; i<Sensor.posAnadir;i++){
            int j=0;
            if((Sensor.sensores[i].getTipo()).equals("temperatura")){
                temperaturas.add(Sensor.sensores[i]);
                j++;
            }
        }
        int size = temperaturas.size();
        Sensor temp;
        Sensor[] ordenados = new Sensor [size];
        for(int i=0; i<size; i++){
            ordenados[i] = temperaturas.get(i);
        }
        
        for (int j=1; j<ordenados.length; j++){
            for (int k=0; k<ordenados.length-j; k++){
                if (ordenados[k].getValor()>ordenados[k+1].getValor()){
                    temp = ordenados[k];
                    ordenados[k] = ordenados[k+1];
                    ordenados[k+1] = temp;
                }
            }
        }
        
        return ordenados;
    }

    public static String toStringTemperaturasOrdenados(Sensor[]temperatura){
        String datosOrdenados= "";
        for(int i=0; i<temperatura.length; i++){
            datosOrdenados = datosOrdenados + (temperatura[i].toString());
        }
        return datosOrdenados;
    }
    
}
