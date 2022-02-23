/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author alenm
 */
public class Ejercicio3 {
  
    public static void main(String[] args){
    Lista3 lista=new Lista3();
    
    Nodo3 n1= new Nodo3();
    n1.setDispositivo(new Dispositivo("SN0001",500));
    lista.AgregarFinal(n1);
    Nodo3 n2= new Nodo3();
    n2.setDispositivo(new Dispositivo("SN0002",450));
    lista.AgregarFinal(n2);
        System.out.println(lista.Revisar("SN0001"));  
        System.out.println(lista.Revisar("SN0002"));  
        System.out.println(lista.toString());
    
    }
}
