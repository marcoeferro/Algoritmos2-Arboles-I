package arbolBinario;
import java.util.Scanner;
public class main{
    public static void main(String [] args){
     
        int condicion=99,rta=99,contador_nodos=0;
        String nvo_nodo;
        Scanner input = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario() ;
    
        do{
            System.out.print("[1] Añadir Nodo \n");
            System.out.print("[2] Mostrar Arbol \n");
            System.out.print("[3] Eliminar Nodo \n");
            System.out.print("[4] Recorrer pre orden in orden post orden \n");
            System.out.print("[0] Salir del programa \n");
            rta=input.nextInt();
            input.nextLine();
            
            switch(rta){
                case 1:
                    if (contador_nodos==0){
                        String valor;
                        System.out.print("\n Ingrese el valor del nodo raiz");
                        valor = input.nextLine();
                        arbol = new ArbolBinario(valor);
                        contador_nodos++;
                    }else{ 
                        do{
                            String valor;
                            System.out.print("\n Ingrese el valor del nodo ");
                            valor = input.nextLine();
                            Nodo nodo = new Nodo(valor);
                            arbol.insertar(nodo);
                            System.out.print("\n¿Desea Ingresar nuevo nodo ? (si / no)\n");
                            nvo_nodo=input.nextLine();
                        }while (nvo_nodo != "no");
                    }
                    
                    break;
                case 2:
                    String valor;
                    System.out.print("Ingrese el valor que desea Eliminar \n");
                    valor = input.nextLine();
                    arbol.eliminar(valor);
                    break;
                case 3:
                    String valor2;
                    System.out.print("Ingrese el valor que desea Buscar \n");
                    valor2 = input.nextLine();
                    arbol.buscarNodo(valor2);

                    break;
                case 4:
                    
                System.out.print("Recorrido en Orden :");
                    ArbolBinario.inorden(arbol.raiz);
                    System.out.print("Recorrido en pre Orden :");
                    ArbolBinario.preorden(arbol.raiz);
                    System.out.print("Recorrido en Post Orden :");
                    ArbolBinario.postorden(arbol.raiz);
                    
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



