/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_22_cap4;

/**
 *
 * @author Luis F Montoya
 */
public class Empleado {
    String nombre;
    double SalarioPorHora,SalarioMensual;
    int HorasTrabajadas;
    

    public Empleado(String nombre, double SalarioPorHora, int HorasTrabajadas) {
        this.nombre = nombre;
        this.SalarioPorHora = SalarioPorHora;
        this.HorasTrabajadas = HorasTrabajadas;
        SalarioMensual = SalarioPorHora * HorasTrabajadas;
    }
    
    
}
