/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author danii
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers1= new Persona("DANI", "POLANCO", -19);
        pers1.setNombre("Daniela");
        pers1.setApellido("Pinon");
        try{
        pers1.setEdad(-18);
        }catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());  
            
        }
    }
    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        nombre="";
        apellido="";
        edad=0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad; //set(edad)
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if(edad<0)
            throw new DatoEntradaCheckedEx();
           // throw new DatoEntradaException();
        this.edad = edad;
    }
    
    //UNCHECK
   
}
class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("DATO DE ENTRADA INCORRECTO!! El valor debe de ser POSITIVO");
    }
}
class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("DATO DE ENTRADA INCORRECTO!! El valor debe de ser POSITIVO");
        
    }
}
