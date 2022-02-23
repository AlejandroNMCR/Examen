/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alenm
 */
public class Main {
    public static void main(String[] args){
   Lista lista=new Lista();
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   
   ArchivoNormal n1=new ArchivoNormal("A1","Alejandro","Solamente probando",LocalDate.parse("21/02/2022", formatter),"001",2);
   ArchivoNormal n2=new ArchivoNormal("A3","Nunez","Solamente probando otra vez",LocalDate.parse("20/02/2022", formatter),"003",1);
   ArchivoConfidencial c1=new ArchivoConfidencial("A2","Andres","Examen realizado",LocalDate.parse("22/02/2022", formatter),"002",3,true);
    
   Node nodo1=new Node();
   nodo1.setArchivo(n1);
   Node nodo2=new Node();
   nodo2.setArchivo(c1);
   Node nodo3=new Node();
   nodo3.setArchivo(n2);
   lista.Agregar(nodo2);
   lista.Agregar(nodo1);
   lista.Agregar(nodo3);
        System.out.println(lista.toString());
        System.out.println(lista.CantidadDocumentos());
           
    }
}
