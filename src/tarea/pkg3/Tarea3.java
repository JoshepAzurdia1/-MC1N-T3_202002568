package tarea.pkg3;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Tarea3 {

    public static void main(String[] args) throws IOException {
     BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador=0;
		double i;
		double j;
		double k;
		double m;
		double n;
                                    int menu;
     String tecla = " " ;
     do{
     
        Scanner entrada = new Scanner(System.in);
         System.out.print("MENU\n1. Tema 1: contador\n2. Salir del programa\nIngrese una opcion: ");
         
         menu=entrada.nextInt();
        switch (menu){
            case 1:
                System.out.println(" ");
                System.out.println("TEMA 1: contador -->");
                System.out.print("ingrese el valor de n: ");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			for (j=1;j<=i;j++) {
				for (k=1;k<=j;k++) {
					for (m=1;m<=k;m++) {
						contador = contador+1;
					}
				}
			}
		}
		System.out.println("el valor del contador es: "+contador);
              
            System.out.print("Ingrese f para regresar: ");
                            tecla = new Scanner(System.in).nextLine();
                            System.out.println(" ");
                            contador=0;
                            break;
                           
                }
        }while(menu!= 2);
        System.out.println("Saliendo del programa...."); 
        
        
    }
    
}
