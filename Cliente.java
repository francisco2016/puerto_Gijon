
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
   private String nombre;
   private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

   /**
    * Serie de getters para retornar el valor de los atributos
    */
   public String getNombre(){
       return nombre;
   }
   public String getDni(){
       return dni;
   }
   
   /**
    * mt para retornar los datos del objeto
    */
   public String toString(){
   return "Nombre:" +nombre+  "DNI" +dni; 
   }
}



















