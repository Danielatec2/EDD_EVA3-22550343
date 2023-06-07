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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       String ruta = "C:\\Empresa\\";
       String fileName = "Trabajadores.txt";
       
       Empresa empresa1=new Empresa();
       empresa1.imprimirResultados();
       empresa1.saveEmpresa(empresa1);
       empresa1.addEmpresa(ruta, "Datos_Empresa.txt");
       
       Trabajador trabajador= new Trabajador();
      trabajador.imprimirResultados();
      trabajador.saveTrabajador(trabajador);
      trabajador.addTrabajador(ruta, "Datos_Trabajador.txt");
      
      Producto producto = new Producto();
      producto.imprimirResultados();
      producto.contarDesechosInorganicos();
       
     
      
       
       
       
       
    }
    
}
