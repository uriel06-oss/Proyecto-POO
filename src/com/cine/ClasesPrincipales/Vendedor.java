package com.cine.ClasesPrincipales;

public class Vendedor extends Empleado {

    private String diaDescanso;

    public Vendedor(String nombre, String apellidoPaterno, String apellidoMaterno, String nickname, String contraseña,
            String correo, String celular, String turno, String diaDescanso) {
        super(nombre, apellidoPaterno, apellidoMaterno, nickname, contraseña, correo, celular, turno);
        this.diaDescanso = diaDescanso;

    }

}
