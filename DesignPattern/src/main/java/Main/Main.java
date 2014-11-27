package Main;
import Template.Bicicleta;


public class Main
{
    
    public static void main(String... args)
    {
        Bicicleta b = FabricaBicicleta.fabricarBicicleta("rampa");
        System.out.println("Construindo bicicleta");
    }   
}
