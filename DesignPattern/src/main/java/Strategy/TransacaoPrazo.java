package Strategy;

/**
 *
 * @author AndersonLuis
 */
public class TransacaoPrazo implements ITipoTransacao
{
    @Override
    public Double calcularValorTransacao(Double valor)
    {
        return valor;
    }
}