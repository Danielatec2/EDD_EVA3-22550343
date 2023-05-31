/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;

/**
 *
 * @author danii
 */
public class Empresa implements Resultados {
    private String nombre;
    private String direccion;
    private String tipoEmpresa; //publica, privada

    public Empresa() {
        this.nombre="";
        this.direccion="";
    }

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    @Override
    public void imprimirResultados() {
        System.out.println("EMPRESA:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
    }
    
    
    
    
}
