package arbolBinario;

import java.util.ArrayList;
public class ArbolBinario

{

  

    protected Nodo raiz;
    
    //contructores
    public ArbolBinario(){
        
        raiz = null;
    }
    
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }
    
    //Metodos
    public Nodo raizArbol(){
        return raiz;
    }
        
    public boolean esVacio(){
        return raiz == null;
    }
    
    public Nodo buscarNodo(Nodo nodo, Object dato){
        
        if(dato != nodo.valorNodo()){
            
            if (nodo.subarbolIzdo() != null){
                buscarNodo(nodo.subarbolIzdo(),dato);
            }
            
            if (nodo.subarbolDcho() != null){
                buscarNodo(nodo.subarbolDcho(),dato);
            }
        }else{
            return nodo;
        }
        return null;
    }

    public void insertarNodo(Nodo nodo, int cantidad){
        
        
    }
  
    public void insertar( Nodo nodo,Nodo izq,Nodo der){
        
        if(nodo.nivel!=0){
            nodo.ramaIzdo = izq;
            nodo.ramaIzdo.nivel = nodo.nivel--;
            insertar(nodo.ramaIzdo,izq,der);
            nodo.ramaDcho = der;
            nodo.ramaDcho.nivel = nodo.nivel--;
            insertar(nodo.ramaDcho,izq,der);
        }
        

    }
    
    /*public void eliminar(Object dato){
        
        Nodo elim = buscarNodo(raiz,dato);
        
        if (elim.ramaDcho!=null || elim.ramaDcho!=null){
            Scanner input = new Scanner(System.in);
            Nodo padre ;

            System.out.print("el nodo a eliminar tiene hijos que debe reasignar\n");
            System.out.print("estos son los nodos del arbol :\n");
            preordenVacante(raiz);
            if(elim.ramaDcho!=null){
                System.out.print("ingrese el valor del nuevo padre de "+ elim.ramaDcho);
                padre = buscarNodo(raiz, input.nextLine());
                if(padre!=null){
                    
                    if(padre.ramaIzdo==null){
                        System.out.print("quiere que el valor "+elim.ramaDcho+" sea el hijo izquierdo (si / no)");
                        if (input.nextLine()=="si"){
                            padre.ramaIzdo = elim.ramaDcho;

                        }else{
                            if(padre.ramaDcho==null){
                                System.out.print("quiere que el valor "+elim.ramaDcho+" sea el hijo derecho (si / no)");
                                if (input.nextLine()=="si"){
                                    padre.ramaDcho=elim.ramaDcho;

                                }
                            }
    
                        } 
                    }
                }else{
                    System.out.print("el valor del padre no corresponde con ningun nodo");
                }
                
                
            }else if(elim.ramaIzdo!=null){
                System.out.print("ingrese el valor del nuevo padre de "+ elim.ramaIzdo);
                padre = buscarNodo(raiz, input.nextLine());
                if(padre!=null){
                    
                    if(padre.ramaIzdo==null){
                        System.out.print("quiere que el valor "+elim.ramaIzdo+" sea el hijo izquierdo (si / no)");
                        if (input.nextLine()=="si"){
                            padre.ramaIzdo = elim.ramaIzdo;

                        }else{
                            if(padre.ramaDcho==null){
                                System.out.print("quiere que el valor "+elim.ramaIzdo+" sea el hijo derecho (si / no)");
                                if (input.nextLine()=="si"){
                                    padre.ramaDcho=elim.ramaIzdo;

                                }
                            }
    
                        } 
                    }
                }else{
                    System.out.print("el valor del padre no corresponde con ningun nodo");
                }

            }
            input.close();
        }
        
        if(elim.padre.ramaIzdo==elim){
            elim.padre.ramaIzdo= null;
        }else{
            elim.padre.ramaDcho= null;
        }
        System.out.print("\n Nodo eliminado");
        
    }
    public static void preordenVacante(Nodo nodo){
        
        if(nodo.ramaDcho==null ||nodo.ramaIzdo==null ){
            System.out.print(nodo.valorNodo().toString());
        }
        
        
        if (nodo.subarbolIzdo() != null){
            preorden(nodo.subarbolIzdo());
        }
        
        if (nodo.subarbolDcho() != null){
            preorden(nodo.subarbolDcho());
        }
        
    }*/

    // Recorrido de un árbol binario en preorden
    public static void preorden(Nodo nodo){
        
        System.out.print(nodo.valorNodo().toString());
        
        if (nodo.subarbolIzdo() != null){
            preorden(nodo.subarbolIzdo());
        }
        
        if (nodo.subarbolDcho() != null){
            preorden(nodo.subarbolDcho());
        }
        
    }

    // Recorrido de un árbol binario en inorden
    public static void inorden(Nodo nodo){
        
        
        if (nodo.subarbolIzdo() != null){
            inorden(nodo.subarbolIzdo());
        }
        
        System.out.print(nodo.valorNodo().toString());
        
        if (nodo.subarbolDcho() != null){
            inorden(nodo.subarbolDcho());
        }
        
    }
    
    // Recorrido de un árbol binario en postorden
    public static void postorden(Nodo nodo){
        
        if (nodo.subarbolIzdo() != null){
            postorden(nodo.subarbolIzdo());
        }
        
        if (nodo.subarbolDcho() != null){
            postorden(nodo.subarbolDcho());
        }
        
        System.out.print(nodo.valorNodo().toString());
        
    }

}