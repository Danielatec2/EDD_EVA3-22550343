/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_proyecto_bana_beard;

import java.io.IOException;

/**
 *
 * @author danii
 */
public class EVA2_PROYECTO_BANA_BEARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       String ruta = "C:\\Empresa\\";
       String fileName = "Trabajadores.txt";
       Empresa empresa1=new Empresa("Cars j", "Chih");
       empresa1.imprimirResultados();
       Trabajador trabajador1= new Trabajador(22550343, "Angel", "Montez");
       trabajador1.saveTrabajador(trabajador1);
       trabajador1.addTrabajador(ruta, fileName);
       Proveedores prov1= new Proveedores(500, 350, "SODAS");//Solo recibe la Mercancia
       prov1.saveProveedor(prov1);
       prov1.losProveedores(ruta, "Proveedores.txt");
       trabajador1.imprimirResultados();
       Producto producto = new Producto();// CLASIFICACIÓN DE LOS PRODUCTOS
       producto.imprimirResultados();
       
       
       
    }
    
}
