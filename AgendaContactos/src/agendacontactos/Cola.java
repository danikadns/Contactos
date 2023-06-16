/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

/**
 *
 * @author Alejandro
 */
public class Cola {
    private Object [][] arregloCola;
    private int frente;
    private int fin;
    private  int tamanoMax;
    private int numeroElementos;
    
    //Constructor de la cola
    
    public Cola(int tamano){
        this.arregloCola = new Object[tamano][4]; //
        this.tamanoMax = tamano;
        this.numeroElementos=0;
        this.frente =0;
        this.fin = -1;
    }
    
    //Metodo para insertar valores
    
    public void insertar(Object nombre,Object numero, Object mensaje, Object fecha){
        if (fin == tamanoMax-1){
            fin =-1;
        }
        fin ++;
        arregloCola[fin][0] = nombre;
        arregloCola[fin][1] = numero;
        arregloCola[fin][2] = mensaje;
        arregloCola[fin][3] = fecha;
        numeroElementos ++;
        
    }
    
    //metodo para exrtraer o remover elementos de la cola
    
    public Object[] quitar(){
        Object elementoTemporal[] = arregloCola[frente];
        frente ++;
        
        if (frente == tamanoMax){
            frente =0;
        }
        numeroElementos--;
        return elementoTemporal;
        
    }
    
    //Metodo para obtener el elemento al frente de la cola
    public Object[] frenteCola(){
        return arregloCola[frente];
    }
    
    //metodo para sabber el tamano de la cola
    public int tamanoCola(){
        return numeroElementos;
    }
    
    //metodo para saber si la cola esta vacia 
    
    public boolean colaVacia(){
        return(numeroElementos==0);
    }
    
    //mmetodo para saber si la cola esta llena 
    
    public boolean colaLlena(){
        return (numeroElementos==tamanoMax);
    }
    
}
