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
public class Producto extends Proveedores implements Resultados {

    private boolean tipoDeAlimento;
    int orga = 0;
    int in = 0;
    int pla=0,vid=0,alu=0;
    List<Producto> product = new ArrayList<>();
    public Producto() {
        this.tipoDeAlimento = false;
    }

    public Producto(boolean tipoDeAlimento, double cantidad, double precio, String nomproducto) {
        super(cantidad, precio, nomproducto);
        this.tipoDeAlimento = tipoDeAlimento;
    }
    public boolean isTipoDeAlimento() {
       
        
        return tipoDeAlimento;
    }
    

    public void setTipoDeAlimento(boolean tipoDeAlimento) {
        this.tipoDeAlimento = tipoDeAlimento;
    }
    public void saveAlimento(Producto producto){
        product.add(producto);
        
    }
    public void ListaAlimento(String ruta ,String fileName) throws IOException{
         File file = new File(ruta + fileName);

        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            
            for (Proveedores proveedores : prove) {
                
             bufWriter.write("Nombre Producto:"+proveedores.getNomproducto()+","+"Precio: "+proveedores.getPrecio()+","+"Cantidad: ");

            }
            
            bufWriter.close();
        }
    }
   public void clasificacion_Alimento() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre del producto: ");
        nomproducto = input.next();
        System.out.println("Precio del producto: ");
        precio = input.nextDouble();
        System.out.println("Ingrese la cantidad de productos(Por unidad): ");
        cantidad = input.nextDouble();
        System.out.println("Ingresa el tipo de desecho Organico is a false, Inorganico is a true ");
        tipoDeAlimento = input.nextBoolean();// nos permite capturar*/
        if (tipoDeAlimento == false) {
            //int orga=0;
            orga++;

        } else {
            //int in=0;
            in++;
           int claIno=0;
            System.out.println("Que tipo de desecho INORGANICO ES: "+ "\n1)Plastico"+"\n2)Vidrio"+"\n3)Aluminio");
            claIno = input.nextInt();
            switch(claIno){
                case 1:
                    pla++;
                    break;
                case 2:
                    vid++;
                case 3:
                    alu++;
            }
        }
        System.out.println("LA CANTIDAD DE DESECHOS ORGANICOS SON: " + (orga * cantidad));
        System.out.println("LA CANTIDAD DE DESECHOS INORGANICOS SON: " +( in * cantidad) +"\n Y ESTOS SE PUEDEN RECICLAR: ");

    }
 
    @Override
    public void imprimirResultados() {
        
        clasificacion_Alimento();
        
       

    }

}
