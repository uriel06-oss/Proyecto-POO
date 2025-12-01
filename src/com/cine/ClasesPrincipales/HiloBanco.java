package com.cine.ClasesPrincipales;

public class HiloBanco extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Estableciendo conexión con el banco...");
            Thread.sleep((int) (Math.random() * 3000 + 2000)); // 2–5 segundos

            System.out.println("Haciendo el cargo correspondiente...");
            Thread.sleep((int) (Math.random() * 3000 + 2000)); // 2–5 segundos

            System.out.println("Transacción finalizada.");
            Thread.sleep((int) (Math.random() * 3000 + 2000)); // 2–5 segundos

        } catch (InterruptedException e) {
            System.out.println("Error en el proceso bancario: " + e.getMessage());
        }
    }
}
