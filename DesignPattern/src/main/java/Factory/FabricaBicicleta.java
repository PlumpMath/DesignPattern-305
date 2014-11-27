package Factory;

import Template.Bicicleta;
import Template.BicicletaCorrida;
import Template.BicicletaRampa;
import template.BicicletaInexistenteException;

/**
 *
 * @author Marcus
 */
public class FabricaBicicleta
{
    public Bicicleta fabricarBicicleta(String tipo) throws BicicletaInexistenteException
    {
        if(tipo.toLowerCase().equals("corrida"))
        {
            return new BicicletaCorrida();
        }
        
        else if(tipo.toLowerCase().equals("rampa"))
        {
            return new BicicletaRampa();
        }
        
        else
        {
            throw new BicicletaInexistenteException();
        }
    }
}
