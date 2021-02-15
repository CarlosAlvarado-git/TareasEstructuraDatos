import java.util.Scanner;
public class eje1{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido, programa contador de letras de parrafos de -lorem ipsum-");
        System.out.print("Ingrese el numero de parrafos a contar: ");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese parrafo :");
        String texto = "";
        for(int i = 0; i < numero; i++){
            texto += scan.nextLine();
            scan.nextLine();
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.println(texto);
        
    }
}