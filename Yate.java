
/**
 * Write a description of class Yate here.
 * 
 * Francisco
 */
public class Yate extends EmbarcacionDepor{
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes, int potencia, String matricula, float eslora, int anoFabricacion)
    {
        super( potencia, matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }

    /**
    * @Override
    */
    public int getCoeficienteBernua(){
        return camarotes;
    }
    
    public String toString(){
        return  "Matricula:" +getMatricula()+ "Eslora" +getEslora()+ "Año de fabricacion: " +getAnoFabricacion()
        + "Potencia: " +getPotencia()+ "cv. Camarotes;" +camarotes ;
    }
}






