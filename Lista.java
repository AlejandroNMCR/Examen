/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author alenm
 */
public class Lista {
    private Node inicio;
    private Node fin;
    private int tamanio;
    
    public boolean esVacia(){
        return inicio == null;
    }
     public int getTamanio(){
        return tamanio;
    }
     
     public void Agregar(Node nodo){
        if(nodo.getArchivo() instanceof ArchivoConfidencial)
        {
        AgregarFinal(nodo);
        }
        else
        {
         AgregarInicio(nodo);
        }
     
     }
     
     public void AgregarInicio(Node nodo){ 
        Node newNode = nodo;  
  
        if(inicio == null) {   
            inicio = newNode;  
            fin=newNode;
        }  
        else {  
            Node temp = inicio;  
            inicio = newNode;  
            inicio.setSiguiente(temp); 
        }   
         tamanio++;
     }
     
      public void AgregarFinal(Node nodo) {  
          
        Node newNode = nodo;  
  
        if(inicio == null) {  
            inicio = newNode;  
            fin = newNode;  
        }  
        else {  
            fin.setSiguiente(newNode);   
            fin = newNode;  
        }  
    }  
     
    @Override
     public String toString(){
         Node temp=inicio;
         String contenido="";
         while(temp!=null){
         contenido+=temp.getArchivo().toString()+"\n";
         temp=temp.getSiguiente();
         }
         return contenido;
     }
     public String CantidadDocumentos(){
     int n=0;
     int c=0;
     Node temp=inicio;
         String contenido="";
         while(temp!=null){
             if(temp.getArchivo() instanceof ArchivoConfidencial){
             c++;
             }
             else{
             n++;
             }
         temp=temp.getSiguiente();
         }
         contenido="Total de Archivos por tipo\n"
                 + "Normales: "+n+"\n"
                 + "Confidenciales: "+c;
         return contenido;
         }
     
}

