package arbolBinario;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
     
        int condicion=99,rta=99;
        String subarbol;
        Scanner input = new Scanner(System.in);
        String izq,der,padre;
        ArbolBinario arbol = new ArbolBinario();
    
        do{
            System.out.print("[1] Armar arbol \n");
            System.out.print("[2] Mostrar Arbol \n");
            System.out.print("[3] Eliminar Nodo \n");
            System.out.print("[0] Salir del programa \n");
            rta=input.nextInt();
            input.nextLine();
            
            switch(rta){
                case 1:
                    do{
                        System.out.print("Ingrese Los datos del subarbol izquierdo");
                        
                        System.out.print("Ingrese el dato del nodo raiz");
                        padre = input.nextLine();
                        System.out.print("Ingrese el dato del nodo izquierdo");
                        izq = input.nextLine();
                        System.out.print("Ingrese el dato del nodo derecho");
                        der = input.nextLine();
                        arbol.nvoArbol(der,padre,izq);
                        
                        System.out.print("Ingrese Los datos del subarbol derecho");
                        
                        System.out.print("Ingrese el dato del nodo raiz");
                        padre = input.nextLine();
                        System.out.print("Ingrese el dato del nodo izquierdo");
                        izq = input.nextLine();
                        System.out.print("Ingrese el dato del nodo derecho");
                        der = input.nextLine();
                        arbol.nvoArbol(der,padre,izq);
                        
                        System.out.print("Ingrese el dato del nodo raiz de los subarboles anteriores");
                        arbol.armarArbol(input.nextLine());
                        
                        System.out.print("¿Desea Ingresar nuevo subarbol ? (si / no)");
                        subarbol=input.nextLine();
                    }while (subarbol != "no");
                    break;
                case 2:
                    System.out.print("Ingrese el valor que desea Eliminar \n");
                    break;
                case 3:
                    System.out.print("Ingrese el valor que desea Buscar \n");
                    break;
                case 0 :
                    condicion = 0;
                    break;
                default:
                    System.out.print("La opcion ingresada no es valida\n");
                    break;
    
            }
        }while(condicion!= 0);
        System.out.print("Ejecucion Terminada \n");
    
        input.close();
    };
}



