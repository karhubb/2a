/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-06-11]
 * Descripción: Clase lógica principal que coordina el conteo de líneas y métodos
 */

import java.util.Scanner;

public class Logic2a {
    
    /**
     * Método principal que ejecuta el análisis de archivos
     * Solicita al usuario el nombre del archivo y genera un reporte individual
     */
    public void logic2a() {
        // Crear objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el nombre del archivo a analizar
        System.out.print("Ingrese el nombre del archivo a analizar: ");
        // Leer el nombre del archivo ingresado por el usuario
        String fileName = scanner.nextLine();
        
        // Crear instancias de las clases requeridas para el análisis
        Input myInput = new Input();              // Para leer archivos
        Data myData = new Data();                 // Para procesar datos
        LineCounter myLineCounter = new LineCounter();     // Para contar líneas
        MethodCounter myMethodCounter = new MethodCounter(); // Para contar métodos
        OutPut output = new OutPut();             // Para escribir resultados
        
        // Leer el contenido del archivo especificado por el usuario
        String fileContent = myInput.readData(fileName);
        
        // Verificar si el archivo se leyó exitosamente
        if (fileContent.isEmpty()) {
            // Mostrar mensaje de error si no se pudo leer el archivo
            System.out.println("Error: No se pudo leer el archivo " + fileName);
            // Cerrar scanner para liberar recursos del sistema
            scanner.close();
            // Salir del método si hay un error
            return;
        }
        
        // Convertir el contenido del archivo en un arreglo de líneas
        String[] linesArray = myData.saveData(fileContent);
        
        // Contar líneas de código válidas en el archivo
        int lineCount = myLineCounter.count(linesArray);
        
        // Contar métodos públicos en el archivo
        int methodCount = myMethodCounter.count(linesArray);
        
        // Crear mensaje de resultados con el análisis realizado
        String result = "Archivo analizado: " + fileName + 
                       "\nLíneas de código contadas: " + lineCount + 
                       "\nMétodos contados: " + methodCount;
        
        // Escribir resultados en el archivo de salida
        output.writeData("Out2.txt", result);
        
        // Mostrar resultados en la consola
        System.out.println(result);
        
        // Cerrar scanner para liberar recursos del sistema
        scanner.close();
    }
}