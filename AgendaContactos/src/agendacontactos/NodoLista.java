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
public class NodoLista {
    // Atributos
    public Object datoNombre;
    public Object datoTelefono;
    public Object datoCorreo;
    public Object datoCategoria;
    public NodoLista siguiente;
    
    // Constructor
    public NodoLista(Object[] dato){
        this.datoNombre = dato[0];
        this.datoTelefono = dato[1];
        this.datoCorreo = dato[2];
        this.datoCategoria = dato[3];
        this.siguiente = null;
    }
    
    public void mostrarValorNodo(){
        System.out.print("["+this.datoNombre+"]");
        System.out.print("["+this.datoTelefono+"]");
        System.out.print("["+this.datoCorreo+"]");
        System.out.print("["+this.datoCategoria+"]");        
    }
}
