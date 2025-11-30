/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase para leer archivos de código fuente
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {

    /**
     * Lee el contenido de un archivo y lo retorna como String
     * @param inFile nombre del archivo a leer
     * @return contenido del archivo como String, o string vacío en caso de error
     */
    public String readData(String inFile) {
        // StringBuilder para acumular el contenido del archivo eficientemente
        StringBuilder data = new StringBuilder();
        
        // Usar try-with-resources para asegurar que BufferedReader se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            // Variable para almacenar cada línea leída del archivo
            String line;
            
            // Leer archivo línea por línea hasta llegar al final del archivo (null)
            while ((line = br.readLine()) != null) {
                // Agregar la línea al StringBuilder con carácter de nueva línea
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            // Manejar excepciones de entrada/salida imprimiendo el stack trace
            e.printStackTrace();
            // Retornar string vacío en caso de error
            return "";
        }
        
        // Convertir StringBuilder a String y retornarlo
        return data.toString();
    }
}