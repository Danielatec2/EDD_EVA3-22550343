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
public class Proveedores   { // Sol
    protected double cantidad;  //unidad
    protected double precio;
    protected String nomproducto; //PLATONOS //SODAS
    String ruta = "C:\\Empresa\\";
     String fileName ="Proveedores";
    List<Proveedores>prove = new ArrayList<>();

    public Proveedores() {
        this.cantidad = 0;
        this.precio = 0;
        this.nomproducto = "";
    }

    public Proveedores( double cantidad, double precio, String nomproducto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nomproducto = nomproducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }
    public void saveProveedor( Proveedores proveed){
        prove.add(proveed);
        
    }
    public void losProveedores(String ruta, String fileName) throws IOException{
          File file = new File(ruta + fileName);

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (Proveedores proveedores : prove) {
       bufWriter.write("Cntidad: "+", "+proveedores.getCantidad()+" Precio: "+","+proveedores.getPrecio() +","+"Nombre Producto: "+proveedores.getNomproducto());
        }

        bufWriter.close();
        fileWriter.close();
    }


  

}
