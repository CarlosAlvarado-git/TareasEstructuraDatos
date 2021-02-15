import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class eje2Csv  
{  
    public static void main(String[] args)   
        {  
            String line = "";  
            String splitBy = ",";  
            try   
            {  
                BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));  
                int tam = 0;
                int bandera = 0;
                int r = 0;
                String pal = "";
                while ((line = br.readLine()) != null) 
                {  
                    String[] palabras = line.split(splitBy);
                    for(int i = 0; i < palabras.length; i++){
                        if(i == 0){
                            pal = palabras[i];
                            tam = pal.length();
                            char c[] = new char[tam];
                            char c2[] = new char[tam];
                            for(int z = 0; z < pal.length(); z++){
                                c[z] = pal.charAt(z);
                                c2[tam-1] = pal.charAt(tam-1);
                                r = Character.compare(c[z], c2[tam-1]);
                                tam--;                            
                                if(r != 0){
                                    bandera = 1;
                                    break;
                                }
                            }
                        }
                        else{
                            pal = palabras[i];
                            pal = pal.substring(1);
                            tam = pal.length();
                            char c[] = new char[tam];
                            char c2[] = new char[tam];
                            for(int z = 0; z < pal.length(); z++){
                                c[z] = pal.charAt(z);
                                c2[tam-1] = pal.charAt(tam-1);
                                r = Character.compare(c[z], c2[tam-1]);
                                tam--;                            
                                if(r != 0){
                                    bandera = 1;
                                    break;
                                }
                            }
                        }   
                        if(bandera == 1){
                            System.out.println("La palabra " + pal +" no es palindromo");
                            bandera = 0;
                        }
                        else{
                            System.out.println("La palabra " + pal +" es palindromo");
                        }
                    }
                }  
            }   
            catch (IOException e)   
            {  
                e.printStackTrace();  
            }  
        }  
}  