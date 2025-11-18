package com.cine.ClasesPrincipales;

public class Administrador extends Empleado {

    private String tipoAdmin;

    public Administrador(String nombre, String apellidoPaterno, String apellidoMaterno, String nickname,
            String contraseña, String correo, String celular, String turno, String tipoAdmin) {
        super(nombre, apellidoPaterno, apellidoMaterno, nickname, contraseña, correo, celular, turno);
        this.tipoAdmin = tipoAdmin;
    }

}
