
/**
 * Write a description of class Barco here.
 *
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFabricacion )
    {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anoFabricacion = anoFabricacion;
       
    }

   /**
    * Serie de mt para retornar el valor de los atributos
    */
   public String getMatricula(){
       return matricula;
   }
   
   public float getEslora(){
       return eslora;
   }
   
   public int getAnoFabricacion(){
       return anoFabricacion;
   }
   
   public abstract int getCoeficienteBernua();
   
   public String toString(){
       return "Matricula:" +matricula+ "Eslora" +eslora+ "Año de fabricacion: " +anoFabricacion;
   }
}



















