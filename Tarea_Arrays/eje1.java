import java.util.Scanner;
public class eje1{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido, programa contador de letras de parrafos de -lorem ipsum-");
        System.out.print("Ingrese el numero de parrafos a contar: ");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Debe dar doble enter luego de ingresar los parrafos");
        System.out.println("Ingrese parrafo :");
        String texto = "";
        int letras[][] = new int[26][2];
        for(int fil = 0; fil < 26; fil++){
            letras[fil][0] = 97 + fil;
            letras[fil][1] = 0;
        }
        for(int i = 0; i < numero; i++){
            texto = scan.nextLine();
            scan.nextLine();
            for(int x = 0; x < texto.length(); x++){
                int pos = (int) (texto.charAt(x));
                pos = pos - 97;
                if(pos >= 0 && pos <= 25)
                    letras[pos][1] = letras[pos][1] + 1;
            }
        }
        int posmayor = 0;
        int cambio = 0;
        int ultimo = 26;
        for(int i = 0; i < 26; i++){
            posmayor = 0;
            for(int x = 0; x < ultimo;x++){
                if(letras[posmayor][1] <= letras[x][1]){
                    posmayor = x;
                }
            }
            cambio = letras[posmayor][1];
            letras[posmayor][1] = letras[ultimo-1][1];
            letras[ultimo-1][1] = cambio;
            cambio = letras[posmayor][0];
            letras[posmayor][0] = letras[ultimo-1][0];
            letras[ultimo-1][0] = cambio;
            ultimo--;

        }
        for(int i = 25; i > 19; i--){
            System.out.println("La cantidad de "+ (char)(letras[i][0]) + " es: " + letras[i][1]);
        }

        
    }
}