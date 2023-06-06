/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.metodosacceso;

/**
 *
 * @author Usuario
 */
public class ApartamentoFamiliar extends Apartamento {
    
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor administracion = $" + valorAdministracion);
        System.out.println();
    }
    
}
