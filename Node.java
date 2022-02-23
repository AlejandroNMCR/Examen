/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author alenm
 */
public class Node {
    private Archivo archivo;
    private Node siguiente;

    /**
     * @return the archivo
     */
    public Archivo getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the siguiente
     */
    public Node getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
