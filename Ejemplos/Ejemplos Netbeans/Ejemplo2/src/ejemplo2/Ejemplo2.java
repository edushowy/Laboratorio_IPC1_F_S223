package ejemplo2;

import java.util.Scanner;

/**
 *
 * @author edush
 */
public class Ejemplo2 {
    
    public static void main(String[] args) {
        String[][] notas = new String[20][4];
        int indice = 0;
        
        /*
            Alumno  Mate    Fisica  Progra
        
            Luis    78      80      90  
            Ana     89      77      100
            Jose    61      69      73
            ..      ..      ..      ..
        */
        
        /* Almacenando la informacion en la matriz*/
        notas[indice][0]="Luis";
        notas[indice][1]="78";
        notas[indice][2]="80";
        notas[indice][3]="90";
        
        indice++;        
        notas[indice][0]="Ana";
        notas[indice][1]="89";
        notas[indice][2]="77";
        notas[indice][3]="100";
        
        indice++;
        notas[indice][0]="Jose";
        notas[indice][1]="61";
        notas[indice][2]="69";
        notas[indice][3]="73";
        
        // dejamos listo el indice en la siguiente fila libre de la matriz
        indice++;
        
        /*
            mostrar la matriz en pantalla
        */
        System.out.println("Alumno  Mate    Fisica  Progra  Promedio");
        
        for(int fila=0; fila<indice; fila++){
            
            double sumatoria=0;
            
            for(int columna=0; columna<4; columna++){
                System.out.print(notas[fila][columna]+'\t');
                
                if(columna>0){
                    sumatoria = sumatoria + Integer.parseInt(notas[fila][columna]);
                }   
                
                /* otra solicion es mostrarlo hasta que se tengan los 3 valores necesarios
                if(columna==3){
                    int promedio = (int) (sumatoria/3);
                    System.out.print(promedio);
                }
                */
            }
            /* se muestra en pantalla la Division del promedio*/            
            int promedio = (int) (sumatoria/3);
            System.out.print(promedio);
            System.out.println("");
        }
        
        
        /* Ingresar informacion con el teclado*/               
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        notas[indice][0]=entrada.nextLine();
        
        System.out.println("Ingrese nota de matematica: ");
        notas[indice][1]=entrada.nextLine();
        
        System.out.println("Ingrese nota de fisica: ");
        notas[indice][2]=entrada.nextLine();
        
        System.out.println("Ingrese nota de progra: ");
        notas[indice][3]=entrada.nextLine();
        
        indice++;
        
        
        System.out.println("********* Listado completo *************");
        
        
        /*
            mostrar la matriz en pantalla por 2da vez con la informacion recien agregada
        */
        System.out.println("Alumno  Mate    Fisica  Progra  Promedio");
        
        /* Se aumenta un valor en filas para que muestre el nuevo dato */
        for(int fila=0; fila<indice; fila++){
            
            double sumatoria=0;
            
            for(int columna=0; columna<4; columna++){
                System.out.print(notas[fila][columna]+'\t');
                
                if(columna>0){
                    sumatoria = sumatoria + Integer.parseInt(notas[fila][columna]);
                }   
                
                /* otra solicion es mostrarlo hasta que se tengan los 3 valores necesarios
                if(columna==3){
                    int promedio = (int) (sumatoria/3);
                    System.out.print(promedio);
                }
                */
            }
            /* se muestra en pantalla la Division del promedio*/            
            int promedio = (int) (sumatoria/3);
            System.out.print(promedio);
            System.out.println("");
        }
        
        
        
        
        /* Ingresar informacion con el teclado por 2da vez*/               
        //Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        notas[indice][0]=entrada.nextLine();
        
        System.out.println("Ingrese nota de matematica: ");
        notas[indice][1]=entrada.nextLine();
        
        System.out.println("Ingrese nota de fisica: ");
        notas[indice][2]=entrada.nextLine();
        
        System.out.println("Ingrese nota de progra: ");
        notas[indice][3]=entrada.nextLine();
        
        indice++;
        
        
        System.out.println("********* Listado completo por 2da vez *************");
        
        
        /*
            mostrar la matriz en pantalla por 2da vez con la informacion recien agregada
        */
        System.out.println("Alumno  Mate    Fisica  Progra  Promedio");
        
        /* Se aumenta un valor en filas para que muestre el nuevo dato */
        for(int fila=0; fila<indice; fila++){
            
            double sumatoria=0;
            
            for(int columna=0; columna<4; columna++){
                System.out.print(notas[fila][columna]+'\t');
                
                if(columna>0){
                    sumatoria = sumatoria + Integer.parseInt(notas[fila][columna]);
                }   
                
                /* otra solicion es mostrarlo hasta que se tengan los 3 valores necesarios
                if(columna==3){
                    int promedio = (int) (sumatoria/3);
                    System.out.print(promedio);
                }
                */
            }
            /* se muestra en pantalla la Division del promedio*/            
            int promedio = (int) (sumatoria/3);
            System.out.print(promedio);
            System.out.println("");
        }
        
    }
    
    
            
}
