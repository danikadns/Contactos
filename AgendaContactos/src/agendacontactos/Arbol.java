/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class Arbol extends JPanel {

    private NodoArbol raiz;

    public Arbol() {
        this.raiz = null;
    }

    public boolean arbolVacio() {
        return (this.raiz == null);
    }

    public NodoArbol getRaiz() {
        return this.raiz;
    }

    // Meotodo para insertar nodos en el arbol
    public void insertarNodo(int valor, NodoArbol nodo, String nombre, String categoria) {
        if (this.arbolVacio()) {
            NodoArbol nuevoNodo = new NodoArbol(valor, nombre, categoria);
            this.raiz = nuevoNodo;
        } else {
            if (valor != nodo.getRaiz()) {
                if (valor < nodo.getRaiz()) {

                    if (nodo.getHijoIzquierdo() == null) {
                        NodoArbol nuevoNodo = new NodoArbol(valor, nombre, categoria);
                        nodo.setHijoIzquierdo(nuevoNodo);
                    } else {                        
                            this.insertarNodo(valor, nodo.getHijoIzquierdo(), nombre, categoria);
                        

                    }
                } else {
                    if (nodo.getHijoDerecho() == null) {
                        NodoArbol nuevoNodo = new NodoArbol(valor, nombre, categoria);
                        nodo.setHijoDerecho(nuevoNodo);
                    } else {                        
                            this.insertarNodo(valor, nodo.getHijoDerecho(), nombre, categoria);
                        
                    }
                }
            }
        }
    }

    //Recorrido inorden
    public void inorden(NodoArbol nodo) {
        if (nodo != null) {
            inorden(nodo.getHijoIzquierdo());
            System.out.println(nodo.getRaiz() + ", ");
            inorden(nodo.getHijoDerecho());
        }
    }

    public void postorden(NodoArbol nodo) {
        if (nodo != null) {
            postorden(nodo.getHijoIzquierdo());
            postorden(nodo.getHijoDerecho());
            System.out.println(nodo.getRaiz() + ", ");
        }
    }

    public void preorden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println(nodo.getRaiz() + ", ");
            preorden(nodo.getHijoIzquierdo());
            preorden(nodo.getHijoDerecho());
        }
    }

    public NodoArbol buscarEnArbol(int valorBuscado) {
        NodoArbol nodoRetorno = this.getRaiz();
        while (nodoRetorno.getRaiz() != valorBuscado) {
            if (valorBuscado < nodoRetorno.getRaiz()) {
                nodoRetorno = nodoRetorno.getHijoIzquierdo();
            } else {
                nodoRetorno = nodoRetorno.getHijoDerecho();
            }

            if (nodoRetorno == null) {
                return null;
            }
        }
        return nodoRetorno;

    }

    /*
    METODO PARA ELIMINAR UN NODO DEL ARBOL
     */
    public boolean eliminarNodo(int dato) {
        NodoArbol nodoTemporal = this.raiz;
        NodoArbol nodoPadre = this.raiz;
        boolean esHijoIzquierdo = (nodoTemporal.getHijoIzquierdo() != null);

        while (nodoTemporal.getRaiz() != dato) {
            nodoPadre = nodoTemporal;
            if (dato < nodoTemporal.getRaiz()) {
                nodoTemporal = nodoTemporal.getHijoIzquierdo();
                esHijoIzquierdo = true;
            } else {
                nodoTemporal = nodoTemporal.getHijoDerecho();
                esHijoIzquierdo = false;
            }

            if (nodoTemporal == null) {
                return false;
            }
        }
        if (nodoTemporal.hoja()) {
            this.eliminarHojaDelArbol(nodoPadre, nodoTemporal, esHijoIzquierdo);
        } else {
            if (nodoTemporal.getHijoIzquierdo() == null || nodoTemporal.getHijoDerecho() == null) {
                this.setUnHijo(nodoPadre, nodoTemporal, esHijoIzquierdo);
            } else {
                this.setDosHijo(nodoPadre, nodoTemporal, esHijoIzquierdo);
            }
        }
        return true;

    }

    private void eliminarHojaDelArbol(NodoArbol nodoPadreParam, NodoArbol nodoTemporalParam, boolean esHijoIzquierdoParam) {
        if (nodoTemporalParam == this.raiz) {
            this.raiz = null;
        } else {
            if (esHijoIzquierdoParam) {
                nodoPadreParam.setHijoIzquierdo(null);
            } else {
                nodoPadreParam.setHijoDerecho(null);
            }
        }
    }

    private void setUnHijo(NodoArbol nodoPadreParam, NodoArbol nodoTemporalParam, boolean esHijoIzquierdoParam) {
        if (nodoTemporalParam == this.raiz) {
            if (nodoTemporalParam.getHijoIzquierdo() == null) {
                this.raiz = nodoTemporalParam.getHijoIzquierdo();
            } else {
                this.raiz = nodoTemporalParam.getHijoDerecho();
            }
        } else {
            if (esHijoIzquierdoParam) {
                if (nodoTemporalParam.getHijoIzquierdo() == null) {
                    nodoPadreParam.setHijoIzquierdo(nodoTemporalParam.getHijoIzquierdo());
                } else {
                    nodoPadreParam.setHijoIzquierdo(nodoTemporalParam.getHijoDerecho());
                }
            } else {
                if (nodoTemporalParam.getHijoDerecho() == null) {
                    nodoPadreParam.setHijoDerecho(nodoTemporalParam.getHijoDerecho());
                } else {
                    nodoPadreParam.setHijoDerecho(nodoTemporalParam.getHijoIzquierdo());
                }
            }
        }
    }

    private void setDosHijo(NodoArbol nodoPadreParam, NodoArbol nodoTemporalParam, boolean esHijoIzquierdoParam) {
        NodoArbol nuevoNodo = reemplazarNodoDerecho(nodoTemporalParam);
        if (nodoTemporalParam == this.raiz) {
            this.raiz = nuevoNodo;
        } else {
            if (esHijoIzquierdoParam) {
                nodoPadreParam.setHijoIzquierdo(nuevoNodo);
            } else {
                nodoPadreParam.setHijoDerecho(nuevoNodo);
            }
        }
        nuevoNodo.setHijoIzquierdo(nodoTemporalParam.getHijoIzquierdo());
    }

    private NodoArbol reemplazarNodoDerecho(NodoArbol nodoTemporal) {
        NodoArbol padre = nodoTemporal;
        NodoArbol nodoAuxiliar = nodoTemporal.getHijoDerecho();
        NodoArbol nodoRemover = nodoTemporal;

        while (nodoAuxiliar != null) {
            padre = nodoRemover;
            nodoRemover = nodoAuxiliar;
            nodoAuxiliar = nodoAuxiliar.getHijoIzquierdo();
        }

        if (nodoRemover != nodoTemporal.getHijoDerecho()) {
            padre.setHijoIzquierdo(nodoRemover.getHijoDerecho());
            nodoRemover.setHijoDerecho(nodoTemporal.getHijoDerecho());
        }
        System.out.println("El nodo de remplazo es: " + nodoRemover.getRaiz());
        return nodoRemover;
    }

    // Metodo para buscar el nodo menor
    public double buscarValorMenor() {
        double valorMenor = raiz.getRaiz();
        NodoArbol nodo = this.raiz;

        while (nodo.getHijoIzquierdo() != null) {
            nodo = nodo.getHijoIzquierdo();
            valorMenor = nodo.getRaiz();
        }
        return valorMenor;
    }

    public double buscarValorMayor() {
        double valorMayor = raiz.getRaiz();
        NodoArbol nodo = this.raiz;

        while (nodo.getHijoDerecho() != null) {
            nodo = nodo.getHijoDerecho();
            valorMayor = nodo.getRaiz();
        }
        return valorMayor;
    }

    //Metodo para contar todos los nodos que contiene el arbol
    public int contarNodosEnArbol(NodoArbol temporal) {
        if (temporal != null) {
            int conteo1 = contarNodosEnArbol(temporal.getHijoIzquierdo());
            int conteo2 = contarNodosEnArbol(temporal.getHijoDerecho());
            int resultado = conteo1 + conteo2 + 1;
            return resultado;
        }
        return 0;
    }

    public int pesoDelArbol(NodoArbol temp) {
        int peso = 0;
        if (temp.hoja()) {
            return 1;
        } else {
            if (temp.getHijoIzquierdo() != null) {
                peso += pesoDelArbol(temp.getHijoIzquierdo());
            }
            if (temp.getHijoDerecho() != null) {
                peso += pesoDelArbol(temp.getHijoDerecho());
            }
            return peso;
        }
    }

    public int alturaDelArbol(NodoArbol temp) {
        if (temp != null) {
            return 1 + Math.max(alturaDelArbol(temp.getHijoIzquierdo()), alturaDelArbol(temp.getHijoDerecho()));
        }
        return 0;
    }

    //Sumar valores con un arbol
    public int sumarValoresEnArbol(NodoArbol temp) {
        if (temp != null) {
            int suma1 = sumarValoresEnArbol(temp.getHijoIzquierdo());
            int suma2 = sumarValoresEnArbol(temp.getHijoDerecho());
            return suma1 + suma2;
        }
        return 0;
    }

    //Metodo para saber cuales son nodos padres
    public int nodosPadres(NodoArbol temp) {
        if (temp != null) {
            nodosPadres(temp.getHijoIzquierdo());
            if (!temp.hoja()) {
                System.out.print("Nodos padres: " + temp.getRaiz() + " - ");
            }
            nodosPadres(temp.getHijoDerecho());
        }
        return 0;
    }

    //Metodo para saber cuales son nodos hijos
    public int nodosHijos(NodoArbol temp) {
        if (temp != null) {
            nodosHijos(temp.getHijoIzquierdo());
            if (temp != this.raiz) {
                System.out.println("Nodos hijos: " + temp.getRaiz() + " - ");
            }
            nodosHijos(temp.getHijoDerecho());
        }
        return 0;
    }

    //Metodo para saber cuales osn nodos hermanos
    public int nodosHermanos(NodoArbol temp) {
        if (temp != null) {
            nodosHermanos(temp.getHijoIzquierdo());
            if (temp.getHijoIzquierdo() != null && temp.getHijoDerecho() != null) {
                System.out.println(" ( " + temp.getHijoIzquierdo().getRaiz() + " - " + temp.getHijoDerecho().getRaiz() + " ) ");
            }
            nodosHermanos(temp.getHijoDerecho());
        }
        return 0;
    }

    // Metodo para verificar si el arbol esta completo
    public boolean arbolCompleto(NodoArbol nodo) {
        if (nodo == null) {
            return true;
        } else {
            if ((nodo.getHijoDerecho() == null && nodo.getHijoIzquierdo() != null) || (nodo.getHijoDerecho() != null && nodo.getHijoIzquierdo() == null)) {
                return false;
            }
            boolean bandera1 = arbolCompleto(nodo.getHijoIzquierdo());
            boolean bandera2 = arbolCompleto(nodo.getHijoDerecho());

            return (bandera1 && bandera2);
        }
    }

    // Metodos para convertir esta clase en una representacion grafica
    private void representarArbolGraficamente(NodoArbol nodo, int x, int y, int nivel, Graphics grafica) {
        int radio = 25;
        int diametro = radio * 2;
        
        if(nodo.getCategoria().equals("Familia")){
            grafica.setColor(Color.BLUE);
        }else if(nodo.getCategoria().equals("Amigos")){
            grafica.setColor(Color.GREEN);
        }else if(nodo.getCategoria().equals("Trabajo")){
            grafica.setColor(Color.red);
        }
        
        
        
        grafica.fillOval(x - radio, y - radio, diametro, diametro);
        grafica.setColor(Color.black);
        grafica.drawOval(x - radio, y - radio, diametro, diametro);
        grafica.drawString(String.valueOf(nodo.getRaiz()), x - 25, y + 5);
        grafica.drawString(String.valueOf(nodo.getNombre()), x - 5, y + 15);

        int espacioX = 100;
        int espacioY = 80;

        if (nodo.getHijoIzquierdo() != null) {
            grafica.drawLine(x, y, x - espacioX, y + espacioY);
            representarArbolGraficamente(nodo.getHijoIzquierdo(), x - espacioX, y + espacioY, nivel + 1, grafica);
        }
        if (nodo.getHijoDerecho() != null) {
            grafica.drawLine(x, y, x + espacioX, y + espacioY);
            representarArbolGraficamente(nodo.getHijoDerecho(), x + espacioX, y + espacioY, nivel + 1, grafica);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        repaint();
        this.representarArbolGraficamente(raiz, getWidth() / 2, 50, 0, g);
    }

}
