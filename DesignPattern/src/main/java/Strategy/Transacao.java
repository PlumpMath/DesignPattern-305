package Strategy;

import singleton.Caixa;

/**
 *
 * @author AndersonLuis
 */
public class Transacao
{
    private ITipoTransacao tipoTransacao;
    
    public void realizarTransacao(Double valorTransacao)
    {
        synchronized(this)
        {
            Caixa.getInstance().setValorCaixa(Caixa.getValorCaixa() + tipoTransacao.calcularValorTransacao(valorTransacao));
            System.out.println("Transação realizada com sucesso");
        }
    }

    public void setTipoTransacao(ITipoTransacao tipoTransacao)
    {
        this.tipoTransacao = tipoTransacao;
    }
}