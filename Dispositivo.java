/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author alenm
 */
public class Dispositivo {
    private String NumeroSerie;
    private double Puntuacion;

    /**
     * @return the NumeroSerie
     */
    public String getNumeroSerie() {
        return NumeroSerie;
    }
    public Dispositivo(String numeroSerie,double puntuacion){
        this.setNumeroSerie(numeroSerie);
        this.setPuntuacion(puntuacion);
    }
    /**
     * @param NumeroSerie the NumeroSerie to set
     */
    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    /**
     * @return the Puntuacion
     */
    public double getPuntuacion() {
        return Puntuacion;
    }

    /**
     * @param Puntuacion the Puntuacion to set
     */
    public void setPuntuacion(double Puntuacion) {
        this.Puntuacion = Puntuacion;
    }
    
    @Override
    public String toString(){
    return "Dispositivo: "+this.getNumeroSerie()+"==> "+this.getPuntuacion();
    }
    
}
