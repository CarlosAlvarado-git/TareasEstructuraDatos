import java.util.Scanner;
public class arrays{
    public static void Tdebitos(double a[]){
        double suma = 0.0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        System.out.println("La suma total de debito es: " + suma);
    }
    public static void Tcreditos(double a[]){
        double suma = 0.0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        System.out.println("La suma total de credito es: " + suma);
    }
    public static void SaldoT(double d[], double c[]){
        double suma = 0.0;
        for(int i = 0; i < c.length; i++){
            suma += c[i];
        }
        for(int i = 0; i < d.length; i++){
            suma -= d[i];
        }
        System.out.println("El saldo total del cliente es: " + suma);
    }
    public static void Pdebitos(double d[]){
        double suma = 0.0;
        int parar = 0;
        for(int i = 0; i < d.length; i++){
           if(d[i] == 0.0){
               parar = i;
               break;
           }
           suma += d[i];
        }
        double p = Double.valueOf(parar);
        double prom = suma/p;
        System.out.println("El promedio de debitos es: " + prom);
    }
    public static void Mdebitos(double d[]){
        double suma = 0.0;
        double mayor = 0.0;
        for(int i = 0; i < d.length; i++){
           if(mayor <= d[i]){
               mayor = d[i];
           }
        }
        System.out.println("El monto de debito mas grande es: " + mayor);
    }
    public static void ImCreDebi(double d[], double c[]){
        System.out.println("Creditos del cliente: ");
        for(int i = 0; i < c.length; i++){
            if(c[i] != 0.0)
                System.out.println( "  "+(1+i) + ": " + c[i]);
        }
        System.out.println("Debitos del cliente: ");
        for(int i = 0; i < d.length; i++){
            if(d[i] != 0.0)
                System.out.println("  "+(1+i) + ": " + d[i]);
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        double creditos[] = new double[10];
        double debitos[] = new double[15];
        System.out.println("Bienvenido a su control de debitos y creditos.");
        System.out.println("Primero debera ingresar sus debitos, con un minimo de 10.");
        int stop = 1;
        int total = 0;
        while(stop == 1){
            System.out.print("Ingrese su debito numero: " + (total + 1)+ " : ");
            debitos[total] = scan.nextDouble();
            total++;
            scan.nextLine();
            if(total >= 10 && total <= 14){
                System.out.print("Desea continuar: (s/n) == (1/0) ");
                stop = scan.nextInt();
            }
            if(total == 15){
                stop = 0;
            }
        }
        total = 0;
        stop = 1;
        System.out.println("Ahora debera ingresar sus creditos, con un minimo de 5.");
        while(stop == 1){
            System.out.print("Ingrese su credito numero: " + (total + 1)+ " : ");
            creditos[total] = scan.nextDouble();
            total++;
            scan.nextLine();
            if(total >= 5 && total <= 9){
                System.out.print("Desea continuar: (s/n) == (1/0) ");
                stop = scan.nextInt();
            }
            if(total == 10){
                stop = 0;
            }
        }
        Tdebitos(debitos);
        Tcreditos(creditos);
        SaldoT(debitos, creditos);
        Pdebitos(debitos);
        Mdebitos(debitos);
        ImCreDebi(debitos, creditos);
    }
}