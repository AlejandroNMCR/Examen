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
public class ArchivoConfidencial extends Archivo {
    private boolean Confidencial;
    
    public ArchivoConfidencial(String Nombre, String Propietario, String Contenido, LocalDate FechaCreacion, String numeroDocumento, int CantidadPaginas,boolean pConfidencial) {
        super(Nombre, Propietario, Contenido, FechaCreacion, numeroDocumento, CantidadPaginas);
        this.setConfidencial(pConfidencial);
    }

    /**
     * @return the Confidencial
     */
    public boolean isConfidencial() {
        return Confidencial;
    }

    /**
     * @param Confidencial the Confidencial to set
     */
    public void setConfidencial(boolean Confidencial) {
        this.Confidencial = Confidencial;
    }
    
    public String toString(){
    return "Archivo Clasificado ("+this.getNumeroDocumento()+" - "+
            this.getPropietario()+" - "
            +this.getCantidadPaginas()
            +" - "+this.getFechaCreacion()+" - "+this.isConfidencial()+")";
    }
}
