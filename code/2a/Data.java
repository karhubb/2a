/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase para procesamiento y conversión de datos
 */

public class Data {

    /**
     * Constructor por defecto
     */
    public Data() {
        // Cuerpo del constructor - no se necesita inicialización específica
    }

    /**
     * Convierte un String en un arreglo de líneas separadas
     * @param data String con contenido a dividir
     * @return arreglo de Strings con cada línea del contenido
     */
    public String[] saveData(String data) {
        // Dividir el string usando el carácter de nueva línea como separador
        return data.split("\n");
    }
}