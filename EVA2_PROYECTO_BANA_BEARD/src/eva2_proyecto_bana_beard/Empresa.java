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
public class Empresa implements Resultados {
    private String nombre;
    private String direccion;
    private String tipoEmpresa; //publica, privada
    List<Empresa> empresa = new ArrayList<>();
    
    public Empresa() {
        this.nombre="";
        this.direccion="";
        this.tipoEmpresa="";
    }

    public Empresa(String nombre, String direccion, String tipoEmpresa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoEmpresa=tipoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
    
    public void datosEmpresa() {
        Scanner input = new Scanner(System.in);
        System.out.println("____EMPRESA____");
        System.out.println("NOMBRE DE LA EMPRESA: ");
        nombre = input.nextLine();
        System.out.println("DIRECCION DE LA EMPRESA");
        direccion = input.nextLine();
        System.out.println("LA EMPRESA ES PUBLICA O PRIVADA?");
        tipoEmpresa = input.nextLine();
    }
      public void saveEmpresa(Empresa empres) {
        empresa.add(empres);

    }

    public void addEmpresa(String ruta, String fileName) throws IOException {
        File file = new File(ruta + fileName);

        try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bufWriter = new BufferedWriter(fileWriter)) {

            for (Empresa empresa : empresa) {

                bufWriter.write("___DATOS EMPRESA____");
                bufWriter.write("\n Nombre de la empresa: " + getNombre());
                bufWriter.write("\n Dirección:            " + getDireccion());
                bufWriter.write("\n Publica o privada:    " + getTipoEmpresa());

            }

        }

    }

    @Override
    public void imprimirResultados() {
        datosEmpresa();
      
    }
    
    
    
    
}
