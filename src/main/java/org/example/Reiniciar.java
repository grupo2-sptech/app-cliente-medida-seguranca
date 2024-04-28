package org.example;

import java.io.IOException;

public class Reiniciar {

    public static void agendarReinicio(long delay) {
        try {
            Thread.sleep(delay);

            Process processo = new ProcessBuilder("shutdown", "/r", "/t", "0").start();

            processo.waitFor();

            System.out.println("Máquina reiniciada.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao agendar reinício: " + e.getMessage());
        }
    }
}

