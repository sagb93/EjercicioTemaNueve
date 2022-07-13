package com.sara.ejerciciostemanueve.primerEjercicio;

public class Cliente extends Persona {

    private int credito;

    public Cliente(int credito, String nombre, int edad, int numeroTelefono) {
        super(nombre, edad, numeroTelefono);
        this.credito = credito;
    }

    public String getDetalles() {
        return String.format("Datos del Cliente:\n%s %d anios telefono %d\ncredito disponible: %d mil", getNombre(), getEdad(), getNumeroTelefono(), credito);
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
