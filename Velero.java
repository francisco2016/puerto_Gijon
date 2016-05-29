
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFabricacion)
    {
     super( matricula, eslora, anoFabricacion);
     this.numeroMastiles = numeroMastiles;
    }

    /**
     * Serie de mt para retornar el valor de los atributos
     */
    public int getNumeroMastiles(){
        return numeroMastiles;
    }
    
    /**
     * @Override
     */
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    public String toString(){
        return  "Matricula:" +getMatricula()+ "Eslora" +getEslora()+ "Año de fabricacion: " +getAnoFabricacion()
                + " Número de mástiles: " +numeroMastiles;
    }
}

