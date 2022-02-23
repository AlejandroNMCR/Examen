/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenalejandro;

/**
 *
 * @author alenm
 */
public class Ejercicio1{
    
    public static void main(String[] args)
    {
    
        System.out.println("Hola Mundo");
        System.out.println(CalcCos(2,1));
    }
    
    public static double CalcCos(int x,int n){
    double result=0;
    for(int i=0;i<n;i++){
    result+=(Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n);
    }
    return result;
    }
    
    public static double factorial(int num){
    double result=1.0;
    for(int i=0;i<=num;i++){
    result=result*i;
    } 
    return result;
    }
}
