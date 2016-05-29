
/**
 * Write a description of class EmbarcacionDepor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDepor extends Barco
{
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDepor
     */
    public EmbarcacionDepor(int potencia, String matricula, float eslora, int anoFabricacion)
    {
          super( matricula, eslora, anoFabricacion);
          this.potencia = potencia;
    }
    
    public int getPotencia(){
       return potencia;
    }
    
    /**
     * @Override
     */
    public int getCoeficienteBernua(){
        return potencia;
    }
    
    public String toString(){
        return  "Matricula:" +getMatricula()+ "Eslora" +getEslora()+ "Año de fabricacion: " +getAnoFabricacion()
        + "Potencia: " +potencia+ "cv.";
    }
}















