package arbolBinario;

public class ArbolBinario

{
    protected Nodo raiz= new Nodo(null);
    
    //contructores
    public ArbolBinario(){
        
        raiz.dato = null;
    }
    
    public ArbolBinario(Object dato){
        this.raiz.dato = new Nodo(dato);
    }
    
    //Metodos
    public Nodo buscarNodo(Object dato){
        Nodo actual = raiz;
        
        if (dato != null){
            
            int datonodo = Integer.parseInt((String.valueOf(dato)));
        
            while (Integer.parseInt(String.valueOf(actual.dato)) != datonodo){
                
                if(datonodo<Integer.parseInt(String.valueOf(actual.dato))){
                    actual = actual.ramaIzdo;
                }else if(datonodo>Integer.parseInt(String.valueOf(actual.dato))){
                    actual = actual.ramaDcho;
                }
            }
            return actual;
        }else {
            return null;
        }
        
    }

    public void insertar(Nodo nodo){
        Nodo actual = raiz;
        Nodo anterior = new Nodo(null);
        
        if (nodo !=null){
            int datonodo = Integer.parseInt((nodo.dato.toString()));
            while (actual != null){
                anterior = actual;
                if(datonodo<Integer.parseInt((actual.dato.toString()))){
                    actual = actual.subarbolIzdo();
                }else if(datonodo>Integer.parseInt((actual.dato.toString()))){
                    actual = actual.subarbolDcho();
                }else {
                    System.out.print("\n El valor insertado ya existe \n");
                    return;
                }
            }
            if(datonodo>Integer.parseInt((anterior.dato.toString()))){
                anterior.ramaDcho = nodo;

            }else if(datonodo<Integer.parseInt((anterior.dato.toString()))){
                anterior.ramaIzdo=nodo;
            }else {
                System.out.print("\n El valor insertado ya existe \n");
                return;
            }
        }else{
            return;
        }
    }
  
    
    public Nodo eliminar(Nodo Root,Object dato){
        Nodo aux=null;

        if(Root==null){
            
            return Root;
        }
        if(Integer.parseInt(String.valueOf(dato)) < Integer.parseInt(String.valueOf(Root.dato))){

            Root.ramaIzdo=eliminar(Root.ramaIzdo,dato);

        }else if (Integer.parseInt(String.valueOf(dato)) > Integer.parseInt(String.valueOf(Root.dato))){
            Root.ramaDcho=eliminar(Root.ramaDcho,dato);
        }else{
            if(Root.ramaIzdo!=null && Root.ramaDcho!= null){                
                aux =Root.ramaDcho;
                return Root.ramaIzdo;

            }else if(Root.ramaIzdo!=null){                
                return Root.ramaIzdo;

            }else if (Root.ramaDcho!= null){                
                return Root.ramaDcho;

            }else{                
                return Root.ramaIzdo;
            }
        }
        insertar(aux);
        return Root;
    }
    

    // Recorrido de un árbol binario en preorden
    public void preorden(Nodo nodo){
        
        System.out.print(" ["+String.valueOf(nodo.dato)+"] ");
        
        if (nodo.subarbolIzdo() != null){
            preorden(nodo.subarbolIzdo());
        }
        
        if (nodo.subarbolDcho() != null){
            preorden(nodo.subarbolDcho());
        }
        
    }

    // Recorrido de un árbol binario en inorden
    public void inorden(Nodo nodo){
        
        
        if (nodo.subarbolIzdo() != null){
            inorden(nodo.subarbolIzdo());
        }
        
        System.out.print(" ["+String.valueOf(nodo.dato)+"] ");
        
        if (nodo.subarbolDcho() != null){
            inorden(nodo.subarbolDcho());
        }
        
    }
    
    // Recorrido de un árbol binario en postorden
    public void postorden(Nodo nodo){
        
        if (nodo.subarbolIzdo() != null){
            postorden(nodo.subarbolIzdo());
        }
        
        if (nodo.subarbolDcho() != null){
            postorden(nodo.subarbolDcho());
        }
        
        System.out.print(" ["+String.valueOf(nodo.dato)+"] ");
        
    }

}