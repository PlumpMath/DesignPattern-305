package Main;
import Template.Bicicleta;
import Template.BicicletaInexistenteException;
import Factory.FabricaBicicleta;


public class Main
{
    
    public static void main(String... args)
    {
        try
        {
            Bicicleta b = FabricaBicicleta.fabricarBicicleta("rampa");
            System.out.println("Construindo bicicleta");
        }
        catch(BicicletaInexistenteException ex)
        {
            System.out.println(ex);
        }
        
    }   
}
