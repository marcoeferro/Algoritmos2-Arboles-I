package arbolBinario; 
public class Nodo
{
	protected Object dato;
	protected Nodo ramaIzdo;
	protected Nodo ramaDcho;
	protected int nivel;
	//constructores
	public Nodo(Object valor){
		dato = valor;
		this.ramaIzdo = null;
		this.ramaDcho = null;
		this.nivel =0;
	}
	
	public Nodo(Nodo ramaIzdo, Object dato, Nodo ramaDcho){
		this.dato=dato;
		this.ramaIzdo = ramaIzdo;
		this.ramaDcho = ramaDcho;
	}
	
	// Getters
	public Object valorNodo(){ 
		return dato; }
	public Nodo subarbolIzdo(){ 
		return ramaIzdo; }
	public Nodo subarbolDcho(){ 
		return ramaDcho; }
	
	//Setters
	public void nuevoValor(Object d){ 
		dato = d; }
	public void ramaIzdo(Nodo n){ 
		ramaIzdo = n; }
	public void ramaDcho(Nodo n){ 
		ramaDcho = n; }
}

