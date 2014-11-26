package Template;

/**
 *
 * @author Petrovick
 */
public class BicicletaInexistenteException extends Exception
{
    @Override
    public String toString()
    {
        return "Para criar uma bicicleta informe um tipo válido. Tipo informado não existe.";
    }
}
