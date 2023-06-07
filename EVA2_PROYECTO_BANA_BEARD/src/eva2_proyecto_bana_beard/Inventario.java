/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pesca
 */
public 
class Inventario implements Resultados {
    private String ruta = "C:\\Empresa\\";
    private String fileName = "Inventario.txt";
    protected List<Producto> productos;
    
    public Inventario() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(String nombre, double precio, double cantidad, boolean tipoDeAlimento) {
        Producto producto = new Producto(nombre, precio, cantidad, tipoDeAlimento);
        productos.add(producto);
        System.out.println("Producto agregado al inventario.");

                
    }
    
    public void eliminarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                System.out.println("Producto eliminado.");
                return;
            }
        }
        System.out.println("El producto no se encuentra en el inventario.");
    }
    
    public void buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado:");
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Este producto no se encuentra en el inventario.");
    }

    public void guardarInventario() throws IOException {
        
        File file = new File(ruta + fileName);

        try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bufWriter = new BufferedWriter(fileWriter)) {
                bufWriter.write("___INVENTARIO____");
            for (Producto producto : productos) {
              int tipo = producto.isTipoDeAlimento() ? 1 : 0;
             
                bufWriter.write("\n Nombre Producto:   " + producto.getNombre());
                bufWriter.write("\n Precio:             " + producto.getPrecio());
                bufWriter.write("\n Cantidad:           " +producto.getCantidad());
                bufWriter.write("\n Tipo de Alimento 1=Inorganico 0= Organico :    "+tipo+"\n");
                System.out.println("Inventario guardado correctamente");
           
                    
                

            }

        } catch(IOException e){
             System.out.println("Error al guardar el inventario: " + e.getMessage());
        }

    }


    
    public void mostrarInventario() {
        System.out.println("___INVENTARIO____");
        for (Producto producto : productos) {
            System.out.println("Nombre: "+producto.getNombre()+",  "+ " Cantidad: "
                    + producto.getCantidad()+", " +  " Precio: "+producto.getPrecio()+","+"Tipo de alimento: ");
        }
    }

    @Override
    public void imprimirResultados() {
        mostrarInventario();
    }
}
