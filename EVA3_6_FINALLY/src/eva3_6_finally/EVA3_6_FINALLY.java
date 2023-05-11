/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_finally;

import java.awt.BorderLayout;

/**
 *
 * @author danii
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=9, y=0;
        try{
        int resu=x/y;
        System.out.println("Resultado : "+resu);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
        }finally{//OBLIGA A LA EHECUCIÓN DE ESTA SECCIÓN DE CÓDIGO
            System.out.println("SIEMPRE ME VOY A EJECUTAR");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
