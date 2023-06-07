/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Trabajador implements Resultados {

    private double numControl;
    private String nombre;
    private String apellido;
    List<Trabajador> traba = new ArrayList<>();
    String ruta = "C:\\Empresa\\";

    public Trabajador() {
        this.numControl = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public Trabajador(double numControl, String nombre, String apellido) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public double getNumControl() {
        return numControl;
    }

    public void setNumControl(double numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void saveTrabajador(Trabajador trabajad) {
        traba.add(trabajad);

    }

    
    public void datosTrabajador() {
        Scanner input = new Scanner(System.in);
        System.out.println("____TRABAJADOR:____");
        
        System.out.println("NUMERO DE CONTROL:");
        numControl=input.nextDouble();
        System.out.println("NOMBRE:");
        nombre =input.next();
        System.out.println("APELLIDO:");
        apellido = input.next();
      
    }

    public void addTrabajador(String ruta, String fileName) throws IOException {
        File file = new File(ruta + fileName);

        try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bufWriter = new BufferedWriter(fileWriter)) {
            
            for (Trabajador trabajador : traba) {
       bufWriter.write("DATOS DEL TRABAJADOR");
        bufWriter.write("\nNúmero de Control: " + getNumControl());
        bufWriter.write("\nNombre:            " + getNombre());
        bufWriter.write("\nApellido:          " + getApellido());
            }
            
        }
    }

    @Override
    public void imprimirResultados() {
        datosTrabajador();
    }
    
}
