/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase para contar métodos públicos en código Java
 */

public class MethodCounter {

    /**
     * Cuenta métodos públicos en un arreglo de líneas de código
     * @param artData arreglo de líneas de código a analizar
     * @return número total de métodos públicos encontrados
     */
    public int count(String[] artData) {
        // Inicializar contador para métodos encontrados
        int count = 0;
        
        // Iterar a través de cada línea en el arreglo de entrada
        for (String line : artData) {
            // Remover espacios en blanco al inicio y final de la línea
            String trimmedLine = line.trim();
            
            // Verificar si la línea cumple con los criterios para un método público
            if (trimmedLine.startsWith("public") &&    // Debe ser público
                trimmedLine.contains("(") &&           // Debe tener paréntesis de apertura
                trimmedLine.contains(")") &&           // Debe tener paréntesis de cierre
                !trimmedLine.contains("class") &&      // No debe ser declaración de clase
                !trimmedLine.startsWith("//") &&       // No debe ser comentario de una línea
                !trimmedLine.endsWith("{}") &&         // No debe ser método vacío sin lógica
                !trimmedLine.endsWith(");")) {         // No debe ser declaración sin cuerpo
                // Incrementar contador de métodos
                count++;
            }
        }
        
        // Retornar el número total de métodos encontrados
        return count;
    }
}