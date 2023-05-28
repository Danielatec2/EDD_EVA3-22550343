/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isc_eva3_oop_examen_bana_bread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danii
 * 
 * 
 */
 
public class StudentManagementSystem extends Estudiante {
    String ruta="C:\\ListaStudent\\";
    List<Estudiante>estudiantes = new ArrayList<>();

    public StudentManagementSystem() {
        estudiantes=new ArrayList<>();
    }
    
    public StudentManagementSystem(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
      public void addStudent(Estudiante estudiante ){
        estudiantes.add(estudiante);   
    }

    public Estudiante getstudent(int rollNumber) throws Exception {
        for(Estudiante estudiante: estudiantes){
            if(estudiante.getNumLista()==rollNumber) {
                return estudiante;
            }
        }
          return  null;
    }
    public void  storeData(String ruta,String fileName) throws IOException    {

       File file = new File(ruta+fileName);
       
       FileWriter fileWriter = new FileWriter(file);
       BufferedWriter bufWriter = new BufferedWriter(fileWriter);
       
          for(Estudiante estudiante : estudiantes) {
                bufWriter.write(estudiante.getNombre() + "," + estudiante.getNumLista() + "," +
                estudiante.getGrado()+"\n");
             
          }
             bufWriter.close();
                fileWriter.close();
    }
    
    public void loadData(String ruta, String fileName) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LAA CADENA DE TEXTO
        Path path= Paths.get(ruta+fileName);
        
       List<String> todasLineas=Files.readAllLines(path);
        System.out.println("Resultado:");
        System.out.println(todasLineas.toString());
     
    }
    public void saveFiles(String ruta) throws IOException{
        for (Estudiante estudiante : estudiantes) {
             String fileName = (estudiante.getNombre()+".txt");
             File file = new File(ruta+fileName);
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufWriter = new BufferedWriter(fileWriter);
             bufWriter.write(estudiante.getNombre() + "," + estudiante.getNumLista() + "," +
             estudiante.getGrado()+"\n");
             bufWriter.close();
             fileWriter.close();
            
        }
        
    }
    
    

}
