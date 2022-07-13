/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sara.ejerciciostemanueve;

import com.sara.ejerciciostemanueve.primerEjercicio.Cliente;
import com.sara.ejerciciostemanueve.primerEjercicio.Trabajador;

public class EjerciciosTemaNueve {

    public static void main(String[] args) {
        executeCliente( 5, "Sara", 28, 21254524 );
        System.out.println("*********************************************");
        executeTrabajador(100, "Rebe", 8, 21535485);
    }
    
    public static void executeCliente(int credito, String nombre, int edad, int numeroTelefono){
    Cliente cliente = new Cliente(credito, nombre, edad, numeroTelefono);
        System.out.println(cliente.getDetalles()); 
    }
    
    public static void executeTrabajador(int salario, String nombre, int edad, int numeroTelefono){
    Trabajador trabajador = new Trabajador(salario, nombre, edad, numeroTelefono);
        System.out.println(trabajador.getDetalles());           
    }
}
