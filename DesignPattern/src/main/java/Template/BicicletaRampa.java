package Template;

/**
 *
 * @author Petrovick
 */
public class BicicletaRampa extends Bicicleta
{
    public BicicletaRampa()
    {
        super.setValor(new Double(900));
        super.setTipo("rampa");
    }
    
    @Override
    public Double obterValor()
    {
        return super.getValor();
    }  
}
