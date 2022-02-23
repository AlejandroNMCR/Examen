/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author alenm
 */
public class Lista3 {
    private Nodo3 inicio;
    private Nodo3 fin;
    private int tamanio;
    
    public boolean esVacia(){
        return inicio == null;
    }
     public int getTamanio(){
        return tamanio;
    }
     void Eliminar(String numSerie)
    {
        Nodo3 temp = inicio, prev = null;
 
        if (temp != null && temp.getDispositivo().getNumeroSerie() == numSerie) {
            inicio = temp.getSiguiente(); 
            return;
        }
        while (temp != null && temp.getDispositivo().getNumeroSerie() != numSerie) {
            prev = temp;
            temp = temp.getSiguiente();
        }
        if (temp == null)
            return;
 
        prev.setSiguiente(temp.getSiguiente());
        tamanio--;
    }
     
     
     public double ObtenerPuntuacion(String numSerie){
     
         Nodo3 temp=inicio;
         double puntuacion=0;
         while(temp!=null){
             //System.out.println(temp.getDispositivo().getNumeroSerie());
             if(temp.getDispositivo().getNumeroSerie()==numSerie){
             puntuacion=temp.getDispositivo().getPuntuacion();
             }
             temp=temp.getSiguiente();
         }
         
     
     return puntuacion;
     }
     public Nodo3 ObtenerNodo(String numSerie){
     
         Nodo3 temp=inicio;
         Nodo3 aux=new Nodo3();
         while(temp!=null){
             if(temp.getDispositivo().getNumeroSerie()==(numSerie)){
             aux=temp;
             }
             temp=temp.getSiguiente();
         }
         
     
     return aux;
     }
     
     public String Revisar(String NumSerie){
     double puntuacion=ObtenerPuntuacion(NumSerie);
        // System.out.println(NumSerie);
        // System.out.println(puntuacion);
     Nodo3 aux=ObtenerNodo(NumSerie);
     String mensaje="";
     if(puntuacion<500&&puntuacion>=250){
     Eliminar(NumSerie);
     AgregarFinal(aux);
     mensaje="Se vuelve a insertar a la cola";
     }
     if(puntuacion<250){
     Eliminar(NumSerie);
     mensaje="Se Desecha";
     }
     if(puntuacion>500){
     Eliminar(NumSerie);
     mensaje="Se envia al cliente";
     }
     return mensaje;
     }
     
     
     public void AgregarInicio(Nodo3 nodo){ 
        Nodo3 newNode = nodo;  
  
        if(inicio == null) {   
            inicio = newNode;  
            fin=newNode;
        }  
        else {  
            Nodo3 temp = inicio;  
            inicio = newNode;  
            inicio.setSiguiente(temp); 
        }   
         tamanio++;
     }
     
      public void AgregarFinal(Nodo3 nodo) {  
          
        Nodo3 newNode = nodo;  
  
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
         Nodo3 temp=inicio;
         String contenido="";
         while(temp!=null){
         contenido+=temp.getDispositivo().toString()+"\n";
         temp=temp.getSiguiente();
         }
         return contenido;
     }
     
}
