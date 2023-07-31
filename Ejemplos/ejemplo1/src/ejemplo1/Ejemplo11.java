package ejemplo1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Ejemplo11 {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        int num1=10;
        int num2=34;
        String mensaje = "Se han sumado ";
        String mensaje2 = " el resultado es: ";
        
        System.out.println(mensaje+ num1+" y "+num2 +mensaje2+(num1+num2));
        
        int []numeros = new int[4];
        final double pi = 3.1416;
        numeros[2]=8;
        numeros[0]=-15;
        numeros[1]=20;
        numeros[3]=-36;
        
        System.out.println("imprimir arreglo[0]: "+numeros[0]);
        System.out.println("imprimir arreglo[1]: "+numeros[1]);
        System.out.println("imprimir arreglo[2]: "+numeros[2]);
        System.out.println("imprimir arreglo[3]: "+numeros[3]);
        
        System.out.println("imprimir numero[] = ["+numeros[0]+","+numeros[1]+","+numeros[2]+","+numeros[3]+"]");
        
        System.out.println("-----------------");
        for(int indice=0; indice<4; indice++){
            System.out.println("imprimir arreglo["+indice+"]: "+numeros[indice]);
        }
        
        numeros[0]=0;
        numeros[3]=0;
        
        System.out.println("--------- otro --------");
        for(int indice=0; indice<4; indice++){
            System.out.println("imprimir arreglo["+indice+"]: "+numeros[indice]);
        }
        
        System.out.println("pi: "+pi);
        
        String acentos = "Letras con acentos áéíóú ÁÉÍÓÚ";
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.out.println(acentos);
       
        
        
       
        
    }    
}
