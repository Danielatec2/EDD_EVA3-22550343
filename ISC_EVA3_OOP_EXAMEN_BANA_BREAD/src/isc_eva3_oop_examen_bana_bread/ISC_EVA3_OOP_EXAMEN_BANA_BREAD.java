/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isc_eva3_oop_examen_bana_bread;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author danii
 */
public class ISC_EVA3_OOP_EXAMEN_BANA_BREAD {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String ruta="C:\\listaStudent\\";
        String fileName = "Datos_Almacenados.txt";
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        
        Estudiante estuda= new Estudiante("Daniela_Piñon", 1, "2do");
        Estudiante estudb= new Estudiante("Angel_Martinez", 2, "2do");
        Estudiante estudc= new Estudiante("Poleth_Escarcega", 3, "2do");
        Estudiante estudd= new Estudiante("Allison_Aldaz", 4, "2do");
        
        
        studentManagementSystem.addStudent(estuda);
        studentManagementSystem.addStudent(estudb);
        studentManagementSystem.addStudent(estudc);
        studentManagementSystem.addStudent(estudd);
        
       
        try {
             studentManagementSystem.storeData(ruta, fileName);
              studentManagementSystem.loadData(ruta, fileName);
              studentManagementSystem.saveFiles(ruta);
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
         
     
    
}

