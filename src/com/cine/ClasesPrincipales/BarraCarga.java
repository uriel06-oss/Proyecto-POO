package com.cine.ClasesPrincipales;

public class BarraCarga extends Thread {

    private Thread hiloBanco;

    public BarraCarga(Thread hiloBanco) {
        this.hiloBanco = hiloBanco;
    }

    @Override
    public void run() {
        try {
            // Mientras el hilo del banco siga vivo
            while (hiloBanco.isAlive()) {
                System.out.print("★ ");
                Thread.sleep(500);
            }

            // Cuando el hilo del banco termine, seguir 3 segundos más
            long fin = System.currentTimeMillis() + 3000;
            while (System.currentTimeMillis() < fin) {
                System.out.print("█ ");
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println("Error en la barra de progreso.");
        }
    }
}
