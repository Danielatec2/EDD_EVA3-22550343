/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author danii
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
final static String RUTA= "C:\\archivos\\prueba.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            readUsingFiles(RUTA);
        }catch(IOException ex){
            ex.printStackTrace();
            
        }
        
        
    }
    //FILES : se lee todo el contenido del archivo y se trnasfiere a memoria principal (RAM) ultil para archivos pequeños
    
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LAA CADENA DE TEXTO
        Path path= Paths.get(ruta);
        
       /*List<String> todasLineas=Files.readAllLines(path);
        System.out.println("Resultado:");
      //  System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
           
            System.out.println(todasLineas.get(i));
            
        }*/
        byte[] byes= Files.readAllBytes(path);
        System.out.println(new String(byes));
    }
}
