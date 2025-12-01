package com.cine.ClasesPrincipales;

import java.util.List;

/**
 * Clase sala que hereda a las demas salas
 */
public abstract class Sala {
    protected String tipoDeSala;
    protected double precio;

    /**
     * Contructor de las salas
     * 
     * @param tipoDeSala
     *
     */
    public Sala(String tipoDeSala, double precio) {
        this.tipoDeSala = tipoDeSala;
    }

    /**
     * metodo para que cada sala genere sus asientos
     */
    public abstract List<String> getAsientos();

    public abstract double getPrecio();

    public abstract String getTipoDeSala();

    public abstract int getNumeroColumnas();

    public abstract int getNumeroFilas();

    // modificar si no aparecen las filas y columnas de sala b

    public int getNumeroColumnasDos() {
        return 0;
    }

    public int getNumeroFilasDos() {
        return 0;

    }

}
