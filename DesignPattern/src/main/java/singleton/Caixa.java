package singleton;

/**
 *
 * @author AndersonLuis
 */
public class Caixa
{
    private static Caixa caixa;
    private static Double valorCaixa;
    
    private Caixa()
    {
        valorCaixa = new Double(0);
    }
    
    public static Caixa getInstance()
    {
        if(caixa == null)
        {
            caixa = new Caixa();
        }
        
        return caixa;
    }

    public static Double getValorCaixa() 
    {
        return valorCaixa;
    }
    
    public static void setValorCaixa(Double valorCaixa)
    {
        Caixa.valorCaixa = valorCaixa;
    }
}