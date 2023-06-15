/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

/**
 *
 * @author Pablo
 */
public class ListaEnlazadaSimple {
    public NodoLista primero;
    
    // Constructor
    public ListaEnlazadaSimple(){
       this.primero = null;
       
    }
    
    // Método para insertar un nodo en la cabeza de la lista
    public void insertarEnCabezaLista(Object[] dato){
        NodoLista nuevoNodo = new NodoLista(dato);
        nuevoNodo.siguiente = this.primero;
        this.primero = nuevoNodo;
    }
    
    public NodoLista eliminarEnCabezaLista(){
        NodoLista nodoTemporal = primero;
        primero = nodoTemporal.siguiente;
        return nodoTemporal;
    }
    
    public void mostrarDatosLista(){
        System.out.print("Lista enlazada (nodo primero -> último nodo) ");
        NodoLista nodoActual = primero;
        while(nodoActual != null){
            nodoActual.mostrarValorNodo();
            nodoActual = nodoActual.siguiente;
            System.out.println("");
        }
        System.out.print("");
    }
    
    // Metodo para validar si la lista esta vacía
    public boolean listaVacia(){
        return(this.primero == null);
    }
    
    // Metodo para buscar un nodo en la lista
    public NodoLista busquedaDeNodoEnLista(Object datoBuscado){
        NodoLista nodoActual = primero;
        while (!nodoActual.datoTelefono.equals(datoBuscado)){
            if(nodoActual.siguiente == null){
                return null;
            }else{
                nodoActual = nodoActual.siguiente;
            }            
        }
        return nodoActual;
    }
    
    //Meotod para eliminar un nodo de la lista
    public NodoLista eliminarNodoEnLista(Object datoEliminar){
        NodoLista nodoActual = primero;
        NodoLista nodoAnterior = primero;
        
        while (!nodoActual.datoTelefono.equals(datoEliminar)){
            if (nodoActual.siguiente == null){
                return null;
            }else{
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.siguiente;
            }
        }
        
        if (nodoActual == primero){
            primero = primero.siguiente;
        }else{
            nodoAnterior.siguiente = nodoActual.siguiente;
        }
        return nodoActual;
    }
    
    //Metodo para insertar un nuevo nodo en cualquier parte de la lista
    public NodoLista insertarNodoEnLista(Object datoBuscado, Object[] nuevoDato){
        NodoLista nodoActual = primero;
        NodoLista nuevoNodo = new NodoLista(nuevoDato);
        
        while(!nodoActual.datoTelefono.equals(datoBuscado)){
            if(nodoActual.siguiente == null){
                return null;
            } else {
                nodoActual = nodoActual.siguiente;
            }
        }
        
        nuevoNodo.siguiente = nodoActual.siguiente;
        nodoActual.siguiente = nuevoNodo;
        return nuevoNodo;
    }
}
