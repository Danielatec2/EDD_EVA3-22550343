/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danii
 */
public class  Producto extends Inventario implements Resultados {
    private String nombre;
    private double precio;
    private double cantidad;
    private boolean tipoDeAlimento;
    
    public Producto(){
        this.nombre="";
        this.precio=0;
        this.cantidad=0;
        this.tipoDeAlimento=false;
    }
    public Producto(String nombre, double precio, double cantidad, boolean tipoDeAlimento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipoDeAlimento = tipoDeAlimento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public boolean isTipoDeAlimento() {
        return tipoDeAlimento;
    }
    
 public void clasificacionAlimento() throws IOException {
        Scanner input = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n_____PRODUCTO_____");
            System.out.println("   === MENU ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Guardar inventario");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion deseada: ");

            int opcion = input.nextInt();
            input.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("\n____INFORMACION DEL PRODUCTO____");
                    System.out.println("Nombre del producto: ");
                    String nombreProducto = input.nextLine();
                    System.out.println("Precio del producto: ");
                    double precio = input.nextDouble();
                    System.out.println("Cantidad del producto: ");
                    double cantidad = input.nextDouble();
                    System.out.println("Tipo de alimento (1 = Inorganico, 0 = Organico): ");
                    int tipo = input.nextInt();
                    boolean tipoDeAlimento = tipo == 1;

                    agregarProducto(nombreProducto, precio, cantidad, tipoDeAlimento);
                    break;
                case 2:
                    System.out.println("Nombre del producto a eliminar: ");
                    String productoEliminar = input.nextLine();
                    eliminarProducto(productoEliminar);
                    break;
                case 3:
                    System.out.println("Nombre del producto a buscar: ");
                    String productoBuscar = input.nextLine();
                    buscarProducto(productoBuscar);
                    break;
                case 4:
                    mostrarInventario();
                    break;
                case 5:
                    guardarInventario();
                    break;
                case 6:
                    salir = true;
                    System.out.println("FINALIZADO!!!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        }
    }
     public int contarDesechosOrganicos() {
        int totalOrganicos = 0;
        for (Producto producto : productos) {
            if (!producto.isTipoDeAlimento()) {
                totalOrganicos += producto.getCantidad();
            }
        }
        return totalOrganicos;
    }

    public int contarDesechosInorganicos() {
        int totalInorganicos = 0;
        for (Producto producto : productos) {
            if (producto.isTipoDeAlimento()) {
                totalInorganicos += producto.getCantidad();
            }
        }
        return totalInorganicos;
    }
      public double calcularGananciaDesechos() {
        double gananciaTotal = 0;
        for (Producto producto : productos) {
            if (producto.isTipoDeAlimento()) {
                gananciaTotal += producto.getCantidad() * producto.getPrecio();
            }
        }
        return gananciaTotal;
    }
      
    @Override
    public void imprimirResultados() {
        try {
            clasificacionAlimento();
        } catch (IOException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\nCONTEO DE DESECHOS");
        System.out.println("Cantidad de desechos organicos: " + contarDesechosOrganicos());
        System.out.println("Cantidad de desechos inorganicos: " + contarDesechosInorganicos());
        System.out.println("Ganancia de los desechos inorganicos: " + calcularGananciaDesechos());
    }
}

    


 
    