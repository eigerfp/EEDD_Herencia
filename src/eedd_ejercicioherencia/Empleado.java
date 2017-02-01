/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eedd_ejercicioherencia;

/**
 *
 * @author a053380739q
 */
public class Empleado {
    private String nombre, cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public static void clasificEdad(){
        
    }
            
}
