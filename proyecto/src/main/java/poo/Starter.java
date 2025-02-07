package poo;

import poo.ui.CLI;

/**
 * Clase principal que inicia la ejecución de la aplicación.
 */

public class Starter {
    /**
     * Método principal que crea una instancia de la clase CLI y ejecuta la aplicación.
     *
     * @param args Argumentos de línea de comandos (no utilizados en esta implementación).
     */
    
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.runApp();
    }
}