package com.cine.ClasesPrincipales;

public class Vendedor extends Empleado {

    private String diaDescanso;

    public Vendedor(String nombre, String apellidoPaterno, String apellidoMaterno,
                    String nickname, String contraseña, String correo,
                    String celular, String edad, String turno, String diaDescanso) {

        super(nombre, apellidoPaterno, apellidoMaterno, nickname, contraseña, correo, celular, edad, turno);
        this.diaDescanso = diaDescanso;
    }

    public String getDiaDescanso() {
    return diaDescanso;
    }

    public void setDiaDescanso(String diaDescanso) {
        this.diaDescanso = diaDescanso;
    }

    @Override
    public String toString() {
    return "Cliente:\n" +
           "Nombre: " + getNombre() + "\n" +
           "Apellido Paterno: " + getApellidoPaterno() + "\n" +
           "Apellido Materno: " + getApellidoMaterno() + "\n" +
           "Nickname: " + getNickname() + "\n" +
           "Contraseña: " + getContraseña() + "\n" +
           "Correo: " + getCorreo() + "\n" +
           "Celular: " + getCelular() + "\n" +
           "Edad: " + getEdad() + "\n" +
           "Dia de descanso: " + diaDescanso + "\n";
    }
}
