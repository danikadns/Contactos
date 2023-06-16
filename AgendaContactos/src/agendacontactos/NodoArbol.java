/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

/**
 *
 * @author Alejandro
 */
public class NodoArbol {
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    private int raiz;
    private String nombre;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }   

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }  

    public int getRaiz() {
        return raiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }
    
    public void setHijoIzquierdo(NodoArbol hijoIzquierdo){
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
    public void setHijoDerecho(NodoArbol hijoDerecho){
        this.hijoDerecho = hijoDerecho;
    }    
    
    public NodoArbol(int raiz, String nombre, String categoria){
        this.categoria = categoria;
        this.nombre = nombre;
        this.raiz = raiz;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
    public boolean hoja(){
        return (this.hijoDerecho == null && this.hijoIzquierdo == null);
    }
}
