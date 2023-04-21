import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        String contenido = "Este es el contenido del archivo.";
        String archivo = "archivo.txt";
        
        try (FileWriter fw = new FileWriter(archivo)) {
            fw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("El archivo se ha guardado exitosamente.");
    }
}
