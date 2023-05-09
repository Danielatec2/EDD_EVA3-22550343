/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author danii
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=5, y=0;
        try{
            //SECCION DE CODIGO QUE POTENCIALMENTE GENERA UNA EXCEPCION
        int resu= x/y;
        System.out.println("EL resultado es : "+resu); 
        }catch(ArithmeticException e){
            //se genera un objeto exception llamado "e" de tipo ArithmeticException
            
            System.out.println("Se produjo un error :"+ e.getMessage());
        }  
        System.out.println("Fin del programa");
    }
    
}
