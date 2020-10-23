public class Vehiculo{

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static final int TAMANO = 10;
    public static int posAnadir = 0;

    public Vehiculo(){
            Vehiculo.vehiculos[Vehiculo.posAnadir] = this;
            Vehiculo.posAnadir++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        Vehiculo.vehiculos[Vehiculo.posAnadir] = this;
        Vehiculo.posAnadir++;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        String datos = "/" + this.modelo + ", " + this.marca + ", " + this.valorComercial + ", " + this.color + "/ ";
        return datos;
    }

    public static String toStringVehiculos(){
        String datosTotales = "";
        for(int i=0; i<Vehiculo.posAnadir; i++){
            datosTotales = datosTotales + vehiculos[i].toString();
        }
        if (datosTotales.equals("")){
            datosTotales = "no hay vehiculos";
        }
        return datosTotales;
    }

    public static int cantidadVehiculos(){
        return Vehiculo.posAnadir;
    }

    public static String vehiculosVerdes(){
        String verdes = "";
        if(Vehiculo.posAnadir!=0){
            for (int i=0; i<Vehiculo.posAnadir; i++){
                if((Vehiculo.vehiculos[i].getColor()).equals("verde")){
                    verdes = verdes + Vehiculo.vehiculos[i].toString();
                }
            }
        } 
        if(verdes.equals("")){
            verdes = "no hay vehiculos verdes";
        }
        return verdes;
        }
}

