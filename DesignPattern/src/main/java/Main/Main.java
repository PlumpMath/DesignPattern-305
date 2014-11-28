package Main;
import Template.Bicicleta;
import Template.BicicletaInexistenteException;
import Factory.FabricaBicicleta;
import Strategy.Transacao;
import Strategy.TransacaoPrazo;
import Strategy.TransacaoVista;
import singleton.Caixa;


public class Main
{
    
    public static void main(String... args)
    {
        try
        {
            Bicicleta b = new FabricaBicicleta().fabricarBicicleta("rampa");
            Transacao transacao = new Transacao();
            transacao.setTipoTransacao(new TransacaoVista());
            transacao.realizarTransacao(b.getValor());
            System.out.println(Caixa.getValorCaixa());
            System.out.println("Construindo bicicleta");
        }
        catch(BicicletaInexistenteException ex)
        {
            System.out.println(ex);
        }
        
        System.out.println("--------------------------");
        
        try
        {
            Bicicleta b = new FabricaBicicleta().fabricarBicicleta("corrida");
            Transacao transacao = new Transacao();
            transacao.setTipoTransacao(new TransacaoPrazo());
            transacao.realizarTransacao(b.getValor());
            System.out.println(Caixa.getValorCaixa());
            System.out.println("Construindo bicicleta");
        }
        catch(BicicletaInexistenteException ex)
        {
            System.out.println(ex);
        }
        
        System.out.println("--------------------------");
        
        try
        {
            Bicicleta b = new FabricaBicicleta().fabricarBicicleta("naoexiste");
            Transacao transacao = new Transacao();
            transacao.setTipoTransacao(new TransacaoPrazo());
            transacao.realizarTransacao(b.getValor());
            System.out.println(Caixa.getValorCaixa());
            System.out.println("Construindo bicicleta");
        }
        catch(BicicletaInexistenteException ex)
        {
            System.out.println(ex);
        }
        
    }   
}
