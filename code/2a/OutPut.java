/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase para escribir resultados en archivos
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutPut {
    
    /**
     * Escribe texto en un archivo especificado
     * @param outFile nombre del archivo de salida
     * @param outText texto a escribir en el archivo
     */
    public void writeData(String outFile, String outText) {
        // Usar try-with-resources para asegurar que BufferedWriter se cierre automáticamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            // Escribir el texto en el archivo
            bw.write(outText);
        } catch (IOException e) {
            // Manejar excepciones de entrada/salida imprimiendo el stack trace
            e.printStackTrace();
        }
    }
}