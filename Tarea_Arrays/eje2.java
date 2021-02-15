import java.util.Scanner;
public class eje2{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("Veriricar si la palabra es palindromo");
        System.out.println("Ingrese parrafo :");
        String texto = scan.nextLine();
        scan.nextLine();
        String palabra = "";
        int pos = 0;
        int tam = 0;
        int bandera = 0;
        int r = 0;
        for(int i = 0; i < texto.length(); i++){
            if(Character.compare(texto.charAt(i), ',') == 0){
                palabra = texto.substring(pos, i);
                tam = palabra.length();
                char c[] = new char[tam];
                char c2[] = new char[tam];
                for(int z = 0; z < palabra.length(); z++){
                    c[z] = palabra.charAt(z);
                    c2[tam-1] = palabra.charAt(tam-1);
                    r = Character.compare(c[z], c2[tam-1]);
                    tam--;
                    if(r != 0){
                        bandera = 1;
                        break;
                    }
                }
                if(bandera == 1){
                    System.out.println("La palabra " + palabra +" no es palindromo");
                    bandera = 0;
                }
                else{
                    System.out.println("La palabra " + palabra +" es palindromo");
                }
                pos = i + 2;
                i++;
            }
        }
    }
}
