package Template;

/**
 *
 * @author Petrovick
 */
public class BicicletaCorrida extends Bicicleta
{
    public BicicletaCorrida()
    {
        super.setValor(new Double(2000));
        super.setTipo("corrida");
    }
    
    @Override
    public Double obterValor()
    {
        return super.getValor();
    }
}
