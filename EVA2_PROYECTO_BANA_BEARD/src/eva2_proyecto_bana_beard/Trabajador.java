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

    public void addTrabajador(String ruta, String fileName) throws IOException {
        File file = new File(ruta + fileName);

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (Trabajador trabajador : traba) {
            bufWriter.write("Numero de Control: "+","+trabajador.getNumControl()+ ","+"Nombre: "+trabajador.getNombre() +","+ "Apellido: " + trabajador.getApellido());

        }

        bufWriter.close();
        fileWriter.close();
    }

    @Override
    public void imprimirResultados() {
        System.out.println("DATOS DEL TRABAJADOR ");
        System.out.println("Número de Control: " + getNumControl());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());

    }

}
