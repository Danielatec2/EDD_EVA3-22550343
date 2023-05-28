/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isc_eva3_oop_examen_bana_bread;

/**
 *
 * @author danii
 */
public class Estudiante {
    private String Nombre;
    private int NumLista;
    private String grado;

    public Estudiante() {
        Nombre="";
        NumLista=0;
        grado="";
    }

    public Estudiante(String Nombre, int NumLista, String grado) {
        this.Nombre = Nombre;
        this.NumLista = NumLista;
        this.grado = grado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumLista() {
        return NumLista;
    }

    public void setNumLista(int NumLista) {
        this.NumLista = NumLista;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
    
}
