
/**
 * Write a description of class Alquiler here.
 *Francisco.
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    public static final int VALOR_FIJO_ALQUILER  = 300;
    public static final int MULTIPLICADOR_ESLORA  = 10;
    
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numeroDias, Cliente cliente, Barco barco)
    {
       this.numeroDias = numeroDias;
       cliente = new Cliente( cliente.getNombre(),  cliente.getDni());
       //barco = new Barco(barco.getMatricula(), barco.getEslora(), barco.getAnoFabricacion());
        
    }

    public String toString(){
        return "Matricula:" +(barco).getMatricula()+ "Eslora" +(barco).getEslora()+ "Año de fabricacion: " +(barco).getAnoFabricacion();
    }
    
    public float getCosteAlquiler(){
        return numeroDias *(10 * barco.getEslora() + (300 * barco.getCoeficienteBernua()) );
    }
}



















