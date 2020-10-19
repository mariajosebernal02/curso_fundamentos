import java.util.Scanner;
public class Principal{
    public static void main (String [] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un número:");
            int num = scan.nextInt();

            if (num==0){
                break;
            } else if(num==1){
                if (Vehiculo.posAnadir<Vehiculo.TAMANO){
                    System.out.println("Ingrese modelo: ");
                    int mo = scan.nextInt();
                    System.out.println("Ingrese marca: ");
                    String ma = scan.next();
                    System.out.println("Ingrese valor comercial: ");
                    double va = scan.nextDouble();
                    System.out.println("Ingrese color: ");
                    String co = scan.next();
                    Vehiculo v = new Vehiculo(mo, ma, va, co);
                } else{
                    System.out.println("Error base de datos llena");
                }
            } else if (num==2){
                System.out.println("Datos Vehiculos: ");
                System.out.println(Vehiculo.toStringVehiculos());
            } else if (num==3){
                System.out.println("Cantidad de vehículos: ");
                System.out.println(Vehiculo.cantidadVehiculos());
            } else if (num==4){
                System.out.println("Vehiculos color verde: ");
                System.out.println(Vehiculo.vehiculosVerdes());
            } else if (num==5){
                if (Sensor.posAnadir<Sensor.TAMANO){
                    System.out.println("Ingrese tipo: ");
                    String ti = scan.next();
                    System.out.println("Ingrese valor: ");
                    double va = scan.nextDouble();
                    Sensor v = new Sensor(ti, va);
                } else{
                    System.out.println("Error base de datos llena");
                }
            } else if (num==6){
                System.out.println("Datos Sensores: ");
                System.out.println(Sensor.toStringSensores());
            } else if (num==7){
                System.out.println("Cantidad de sensores: ");
                System.out.println(Sensor.cantidadSensores());
            } else if (num==8){
                System.out.println("Sensores de tipo temperatura: ");
                System.out.println(Sensor.sensoresTemperatura());
            } else if (num==666){
                System.out.println("Sensores de tipo temperatura ordenados por valor: ");
                System.out.println(Sensor.toStringSensoresOrdenados(Sensor.arregloTemperatura()));
            }

        }
    }
}

