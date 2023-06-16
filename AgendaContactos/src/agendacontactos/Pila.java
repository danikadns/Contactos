/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

/**
 *
 * @author GMG
 */
public class Pila {
    
    private Object [][] arregloPila;
    
    private int tamanoPila;
    private int cima;
     
    //constructo
    public Pila(int tamano){
        this.tamanoPila= tamano;
        this.cima = -1;
        arregloPila = new Object[tamano][3];
        
    }
    
    //METODO PUSH
    public void push(Object telefono, Object nombre, Object fecha){
        cima++;
        arregloPila[cima][1]= telefono;
        arregloPila[cima][0]= nombre;
        arregloPila[cima][2]=fecha;
    }
    
    //metodo pop
    public Object[] pop(){
        Object temporal[] = arregloPila[cima];        
        cima--;
        return temporal;
    }
    //Metodo cual es la cima
    public Object cimapila(){
        return arregloPila[cima];
    }
    //metodo para saber si la pila esta vacia 
    
    public boolean pilaVacia(){
        return cima==-1;
    }
    
    
    //metodo para saber si la pila esta llena 
    public boolean pilaLlena(){
        return cima == tamanoPila -1;
    }
    
    
    //Metodo para obtner la cantidad de elementos de la pila 
    public int cantidadElementosPila(){
        return cima+1;
    }
    
    //mostrar todos los valors de la fila
    
    public void mostrarElementosPila(){
        for(int i=0; i<cantidadElementosPila(); i++){
            System.out.print(arregloPila[i][0]);
            System.out.print("  ");
            System.out.print(arregloPila[i][1]);
             System.out.print(",  ");
        }
    }
}
