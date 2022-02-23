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
public class Archivo {
  private  String NumeroDocumento,Nombre,Propietario,Contenido;
  private LocalDate FechaCreacion;
  private int CantidadPaginas;
  
  public Archivo(String Nombre,String Propietario,String Contenido,LocalDate FechaCreacion,String numeroDocumento,int CantidadPaginas){
  this.setNombre(Nombre);
  this.setPropietario(Propietario);
  this.setContenido(Contenido);
  this.setFechaCreacion(FechaCreacion);
  this.setCantidadPaginas(CantidadPaginas);
  this.setNumeroDocumento(numeroDocumento);
  }
  
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Propietario
     */
    public String getPropietario() {
        return Propietario;
    }

    /**
     * @param Propietario the Propietario to set
     */
    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    /**
     * @return the Contenido
     */
    public String getContenido() {
        return Contenido;
    }

    /**
     * @param Contenido the Contenido to set
     */
    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    /**
     * @return the FechaCreacion
     */
    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    /**
     * @param FechaCreacion the FechaCreacion to set
     */
    public void setFechaCreacion(LocalDate FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    /**
     * @return the NumeroDocumento
     */
    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    /**
     * @param NumeroDocumento the NumeroDocumento to set
     */
    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    /**
     * @return the CantidadPaginas
     */
    public int getCantidadPaginas() {
        return CantidadPaginas;
    }

    /**
     * @param CantidadPaginas the CantidadPaginas to set
     */
    public void setCantidadPaginas(int CantidadPaginas) {
        this.CantidadPaginas = CantidadPaginas;
    }
  
}
