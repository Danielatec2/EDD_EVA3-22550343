/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escribir_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danii
 */
public class EVA3_10_ESCRIBIR_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta="C:\\archivos\\";
        try {
            writeUsingFiles(ruta+"Archivos Files.txt","HOLI HOLI YA HACE HAMBRE");
            writeUsingFileWriter(ruta + "Archivo FileWriter.txt", "Prueba de un archivo");
             writeUsingBufferedWriter(ruta+ "Archivo BufferedWriter.txt", "Prueba BufferedWriter");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        Path path= Paths.get(ruta);
        Files.write(path,datos.getBytes());
        
    }
    
      public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
          File file = new File(ruta);
          FileWriter filewriter= new FileWriter(file);
          filewriter.write(datos);
          filewriter.close();
        
    }
        public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
              File file = new File(ruta);
            FileWriter fileWriter= new FileWriter(file);
              BufferedWriter bufferedwrite= new BufferedWriter(fileWriter);
              for (int i = 0; i < 10; i++) {
                  bufferedwrite.write(datos);
                   bufferedwrite.write((i+1)+""+datos);
                   bufferedwrite.write("\n");
                  
                
            }
              bufferedwrite.close();
              fileWriter.close();
          }
}
