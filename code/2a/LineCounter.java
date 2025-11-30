/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase para contar líneas de código excluyendo comentarios y líneas vacías
 */

public class LineCounter {

    /**
     * Cuenta líneas de código válidas excluyendo comentarios y líneas vacías
     * @param artData arreglo de líneas de código a analizar
     * @return número total de líneas de código válidas
     */
    public int count(String[] artData) {
        // Inicializar contador para líneas válidas
        int count = 0;
        
        // Iterar a través de cada línea en el arreglo de entrada
        for (String line : artData) {
            // Remover espacios en blanco al inicio y final de la línea
            String trimmedLine = line.trim();
            
            // Verificar si la línea debe ser excluida del conteo
            if (trimmedLine.isEmpty() ||               // Línea vacía
                trimmedLine.startsWith("//") ||        // Comentario de una línea
                trimmedLine.equals("{") ||             // Llave de apertura sola
                trimmedLine.equals("}") ||             // Llave de cierre sola
                trimmedLine.startsWith("*") ||         // Comentarios Javadoc
                trimmedLine.startsWith("/*") ||        // Inicio de comentario multi-línea
                trimmedLine.endsWith("*/")) {          // Fin de comentario multi-línea
                // Saltar esta línea y continuar con la siguiente iteración
                continue;
            }
            
            // Si la línea pasa todos los filtros, incrementar el contador
            count++;
        }
        
        // Retornar el número total de líneas válidas contadas
        return count;
    }
}