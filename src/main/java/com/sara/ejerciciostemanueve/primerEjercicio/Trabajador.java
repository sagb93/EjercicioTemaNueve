
package com.sara.ejerciciostemanueve.primerEjercicio;

public class Trabajador extends Persona {

    private int salario;

    public Trabajador(int salario, String nombre, int edad, int numeroTelefono) {
        super(nombre, edad, numeroTelefono);
        this.salario = salario;
    }

    public String getDetalles() {
        return String.format("Informacion del trabajador:\n%s %d anios telefono %d\nSalario: %d", getNombre(), getEdad(), getNumeroTelefono(), salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
