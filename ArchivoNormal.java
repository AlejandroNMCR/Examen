/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author alenm
 */
public class ArchivoNormal extends Archivo {
    
    public ArchivoNormal(String Nombre, String Propietario, String Contenido, LocalDate FechaCreacion, String numeroDocumento, int CantidadPaginas) {
        super(Nombre, Propietario, Contenido, FechaCreacion, numeroDocumento, CantidadPaginas);
    }
    public String toString(){
    return "Archivo Normal ("+this.getNumeroDocumento()+" - "+this.getPropietario()+" - "+this.getCantidadPaginas()+" - "+this.getFechaCreacion()+")";
    
    }
}
