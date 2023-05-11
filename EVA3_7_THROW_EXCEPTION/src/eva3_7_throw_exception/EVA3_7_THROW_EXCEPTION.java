/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danii
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EL PROGRAMADOR PUEDE GENERAR EXCEPCIONES 
        //Throw --- lanzar 
        //Excepciones son objetos
        Prueba obj= new Prueba();
        try {
            //checked : es forzoso atenderlas o resolverlas
            //uncheked: errores de lógica, no es forzoso resolverlas
            //int resu=5/0;
            obj.capturaMayorCero(100);
            Scanner input= new Scanner(System.in);
            int valor=input.nextInt();
            
        } catch (Exception ex) {
            //NO ES BUENO USAR  EXCEPTION, YA QUE ES LA SUPER CÑASE DE LAS EXCEPCIONES . VA A CAPTURr cualquier expecion
            System.out.println(ex.getMessage());
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        //ARITMETIC  EXCEPTION ES "UNCHEKED" Y NO ES OBLIGATORIO CAPTURAR LA EXCEPCION 
        try{
            obj.division(100, 0);
        }catch(ArithmeticException e){
        }
    }
    
}
class Prueba{
    //EXCEPTION ES CHECKED EXCEPTION, ESTAMOS OBLIGADOS A ATENDERLAS
    public void capturaMayorCero(int valor) throws Exception{
        if(valor<=0)// voy a gnerar una excepción
            throw new Exception(valor+" Es negativo, solo se aceptan valores positivos");
        System.out.println("El valor es: "+valor);
        
    }
    public int division(int x, int y) throws ArithmeticException{
        if(y==0)
            throw new ArithmeticException("EL VALOR DEL DIVISOR ES CERO ");
        return x/y;
    }
}