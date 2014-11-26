package strategy;

/**
 *
 * @author AndersonLuis
 */
public class TransacaoVista implements ITipoTransacao
{
    @Override
    public Double calcularValorTransacao(Double valor)
    {
        return valor - (valor * 0.05);
    }
}