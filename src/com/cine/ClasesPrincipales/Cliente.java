package com.cine.ClasesPrincipales;

public class Cliente extends Persona {

    private String tarjeta;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String nickname, String contraseña,
            String correo, String celular, String tarjeta) {
        super(nombre, apellidoPaterno, apellidoMaterno, nickname, contraseña, correo, celular);
        this.tarjeta = tarjeta;
    }

}
